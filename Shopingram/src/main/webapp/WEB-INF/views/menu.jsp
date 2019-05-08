<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="css/NewFile.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<script src="js/menubar.js"></script>

<title>Insert title here</title>
</head>
<body>
	<nav id="header" class="navbar navbar-fixed-top">
		<div id="header-container" class="container navbar-container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#navbar" aria-expanded="false"
					aria-controls="navbar">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				
				<img src="image/selluv_logo.png" id="brand" class="navbar-brand"><a href="mainPeedView.do"></a>
			</div>

			<div id="navbar" class="collapse navbar-collapse">
				<div class="col-sm-4 col-md-4">
					<form class="navbar-form navbar-right" role="search">
						<div class="input-group">
							<input type="text" class="form-control" placeholder="Search"
								name="q">
							<div class="input-group-btn">
								<button class="btn btn-default" id="search-btn" type="button">
									<i class="glyphicon glyphicon-search"></i>
								</button>
							</div>
						</div>
					</form>
				</div>
			
				<ul class="nav navbar-nav navbar-right">
					<li class="active"></li>
					<li><a href="#about"><span
							class="glyphicon glyphicon-bell"></span></a></li>
					<li><a href="#about"><span
							class="glyphicon glyphicon-send"></span></a></li>
					<li><a href="#about" id="plus_btn"><span
							id="plus_btn1" class="glyphicon glyphicon-plus-sign"></span></a></li>
					<li><a href="userPeedView.do?id=${sessionScope.memberId }">
					<span class="glyphicon glyphicon-user" id="user-peed"></span>
					</a></li>
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown"><span
							class="glyphicon glyphicon-option-vertical"></span></a>
						<ul class="dropdown-menu" role="menu" style="display: none;">
							<li><a href="follow.jsp">follow</a></li>
							<li><a href=businessRegister.jsp id="dropdown_addcontents">register seller</a></li>
							<li><a href="orderResponseDetail.html">order response</a></li>
							<li><a href="orderResponseDetail.html">profile update</a></li>
							<li class="divider"></li>
							<li><a href="logout.do">logout</a></li>
						</ul></li>
				</ul>
			</div>
			<!-- /.nav-collapse -->
		</div>
		<!-- /.container -->
	</nav>

	<!--/.container-->
</html>