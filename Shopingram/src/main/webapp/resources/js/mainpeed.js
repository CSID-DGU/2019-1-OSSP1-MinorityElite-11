	$(document).ready(function() {
		$(".adetail").removeAttr("href");
		
		$('.tooltiptext').css('display','none');
		
		

		$(document).on('click','#like',function(){
			
			var obj = $(this).attr('class');
			$('.'+obj).css('display','none');
			$('.'+obj+'d').css('display','inline');
			obj = obj.substring(0,obj.length-5);
			$('.'+obj+'-tooltiptext').fadeIn("slow").css('display','inline');
			$('.'+obj+'-tooltiptext').fadeOut();
		})
		
		$(document).on('click','#liked',function(){
			var obj = $(this).attr('class');
			$('.'+obj).css('display','none');
			obj = obj.substring(0,obj.length-1);
			$('.'+obj).css('display','inline');
			
		})
		
		
		$(document).on('click','.content', function(){
			//alert('컨텐츠 상세 조회 보기')
			event.stopPropagation();
			var obj = $(this);
			var formObj = obj.children('form');
			var inputObj = formObj.children('input:nth-child(1)');
			//alert(inputObj.val());
				
			var contentNum = inputObj.val();
			
			var inputObj1 = formObj.children('input:nth-child(2)');
			//alert(inputObj1.val());
			var idNum = inputObj1.val();
			var allData = { "idNum": idNum, "contentNum": contentNum };
			$.ajax({
		        type : "POST",
		        url : "detailContents.do",
		        data:allData,
		        error : function(){
		            alert('통신실패!!');
		        },
		        success : function(data){
		        	$('.dataArea').html(data);
		        }
		    });	
			
			
		})

	});
