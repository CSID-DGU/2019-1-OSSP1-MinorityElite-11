	$(document)
			.ready(
					function() {

						/**
						 * This object controls the nav bar. Implement the add and remove
						 * action over the elements of the nav bar that we want to change.
						 *
						 * @type {{flagAdd: boolean, elements: string[], add: Function, remove: Function}}
						 */
						var myNavBar = {

							flagAdd : true,

							elements : [],

							init : function(elements) {
								this.elements = elements;
							},

							add : function() {
								if (this.flagAdd) {
									for (var i = 0; i < this.elements.length; i++) {
										document
												.getElementById(this.elements[i]).className += " fixed-theme";
									}
									this.flagAdd = false;
								}
							},

							remove : function() {
								for (var i = 0; i < this.elements.length; i++) {
									document.getElementById(this.elements[i]).className = document
											.getElementById(this.elements[i]).className
											.replace(
													/(?:^|\s)fixed-theme(?!\S)/g,
													'');
								}
								this.flagAdd = true;
							}

						};

						/**
						 * Init the object. Pass the object the array of elements
						 * that we want to change when the scroll goes down
						 */
						myNavBar
								.init([ "header", "header-container", "brand" ]);

						/**
						 * Function that manage the direction
						 * of the scroll
						 */
						function offSetManager() {

							var yOffset = 0;
							var currYOffSet = window.pageYOffset;

							if (yOffset < currYOffSet) {
								myNavBar.add();
							} else if (currYOffSet == yOffset) {
								myNavBar.remove();
							}

						}

						/**
						 * bind to the document scroll detection
						 */
						window.onscroll = function(e) {
							offSetManager();
						}

						/**
						 * We have to do a first detectation of offset because the page
						 * could be load with scroll down set.
						 */
						offSetManager();

						$(".dropdown").hover(
								function() {
									$('.dropdown-menu', this).not(
											'.in .dropdown-menu').stop(true,
											true).slideDown("fast");
									$(this).toggleClass('open');
								},
								function() {
									$('.dropdown-menu', this).not(
											'.in .dropdown-menu').stop(true,
											true).slideUp("fast");
									$(this).toggleClass('open');
								});
					
						//$('#plus_btn').removeAttr("href");
						$('#plus_btn').click(function(event){
							$.ajax({
						        type : "GET",
						        url : "addcontents.jsp",
						        dataType : "html",
						        error : function(){
						            alert('통신실패!!');
						        },
						        success : function(data){
						        	$('.dataArea').html(data);
						        }
						    });					
						})
						$('#dropdown_addcontents').click(function(){
							$.ajax({
						        type : "GET",
						        url : "addcontents.jsp",
						        dataType : "html",
						        error : function(){
						            alert('통신실패!!');
						        },
						        success : function(data){
						        	$('#contents-area').html($($("#contents-area").html(data)).find('.addcontentsbody').html());
						        	
						        	$('.cancel').click(function(){
										$('.addbody').remove();
										$('.addcurtain').remove();
									})
						        }
						    });
						})
						$('#brand').click(function(){
							location.href="mainPeedView.do";
						})
						
						
						$('.form-control').keydown(function(e){
							 if (e.keyCode == 13){
								 var obj = $('.form-control').val();
									//alert(obj);
									var allData = { "data": obj };
									
									$.ajax({
								        type : "POST",
								        url : "memberSearch.do",
								        data:allData,
								        error : function(){
								            alert('통신실패!!');
								        },
								        success : function(data){
								        	if(data=='error')
								        		alert("찾으시려는 계정 정보가 없습니다.");
								        	else
								        	location.href="userPeedView.do?id="+data; 
								        	
								        }
								    });	
							 }
						})
						
						$('#search-btn').click(function(){
							var obj = $('.form-control').val();
							//alert(obj);
							var allData = { "data": obj };
							
							$.ajax({
						        type : "POST",
						        url : "memberSearch.do",
						        data:allData,
						        error : function(){
						            alert('통신실패!!');
						        },
						        success : function(data){
						        	if(data=='error')
						        		alert("찾으시려는 계정 정보가 없습니다.");
						        	else
						        	location.href="userPeedView.do?id="+data; 
						        	
						        }
						    });	
						})
					});