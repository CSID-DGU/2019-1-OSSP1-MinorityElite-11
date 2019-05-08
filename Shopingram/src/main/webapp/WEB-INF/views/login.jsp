<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax	.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="css/registerButton.css">
<link rel="stylesheet" href="css/login.css">
<link rel="stylesheet" href="css/menubar.css">
<link rel="stylesheet" href="css/NewFile.css">

</head>
<script>
	function myFunction() {
		document.getElementById("login-form").submit();
	}
</script>
<body>
<form id="login-form" action="login.do" method="post">
	<div class="outer">
		<div class="logo">
			<div class="logoImage">
				<img src="image/selluv.png">
			</div>
		</div>
		
			<div class="login">
				<div class="selluvText">
					<img src="image/login.png" class="title">
				</div>
				<div class="form-id">
					<input type="text" class="search-box" id="id" name="id"
						placeholder="ID" size="50">
				</div>
				<div class="form-pwd">
					<input type="password" class="search-box" id="pwd" name="pwd"
						placeholder="PASSWORD" size="50">
				</div>
				
				<div class="loginerror">${requestScope.error}</div>
				
				<div class="login_btn" onClick="myFunction()">
					<span>로그인</span>
					<div class="dot"></div>
				</div>
				<div></div>
		<div class="find_layer">
			<a href="" class="searchId" style="color:floralwhite">아이디 찾기</a>
			<a href="" class="searchPwd" style="color:floralwhite">비밀번호	찾기</a>
		</div>
		<div class="loginBottom">
			<a href="register.jsp" class="register" style="color:floralwhite">회원가입</a>
		</div>
	</div>
	</div>
</form>


</body>
</html>