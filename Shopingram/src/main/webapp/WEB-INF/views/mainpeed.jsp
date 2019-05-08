<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="css/NewFile.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	
<link rel="stylesheet" href="resources/css/menubar.css">
<link rel="stylesheet" href="resources/css/detailContents.css">
<link rel="stylesheet" href="resources/css/mainpeed.css">
<link rel="stylesheet" href="resources/css/addcontents.css">
<link rel="stylesheet" href="resources/css/NewFile.css">


<script src="resources/js/mainpeed.js"></script>
<script src="resources/js/menubar.js"></script>

</head>
<body>
<div class="mainpeed_body">
	<div class="dataArea"></div>
<jsp:include page="menu.jsp"></jsp:include>
<div class="col-md-12 mainpeed-body">
	<c:if test="${ mainpeeds ne null }">
		<c:forEach var="map" items="${mainpeeds}" varStatus="num">
			<c:forEach var="list" items="${map.value}" varStatus="status2">
			<c:if test="${!status2.last }"><input type="hidden" id="last" value='11'></c:if>
			<div class="col-md-4 mainpeed-contents">
				<div class="profile">
					<img src="${list.profileImg }" class="img-circle" id="mainpeed-profile">
					 <a href="userPeedView.do?id=${list.memberId }" 
					 style="color:#262626;margin-left: 5px; margin-top:5px" id="profile-peed">${map.key}</a>
					<div class="memberId"></div>
				</div>
				<div class="content">
				<form action="detailContents.do" method="post" id="formdetail">
					<input type="hidden" id="content_num" value="${list.contentCode }">
					<input type="hidden" id="writer_id" value="${list.memberId }">
					<img src="${list.contentsImg }"
						class="img-thumbnail1">
						</form>
				</div>
				<div class="contentMenu">
					<div class="contentMenu">
					<div>
						<span class="${list.contentCode}-tooltiptext" style="display:none;width:100px;background-color: #ff0055;color: #fff;text-align: center;border-radius: 6px; padding: 5px 0;position: absolute;z-index: 1; bottom: 20%;left:17.5%;margin-left: -60px;">좋아용~</span>
							<img src="./image/like.png" id="like" class="${list.contentCode}-like"  style="cursor:pointer;width:50px;height:50px;float:left;margin-top:5px;margin-left:35px;margin-right:60px">
						</div>
						<div>
							<img src="./image/liked.png" id="liked" class="${list.contentCode}-liked" style="display:none;cursor:pointer;width:50px;height:50px;float:left;margin-top:5px;margin-left:35px;margin-right:60px">
						</div>					
					<div>
						<img src="./image/comment.png"  style="width:50px;height:50px;float:left;margin-top:5px;margin-right:60px">
					</div>
				</div>
				</div>
			</div>
			</c:forEach>
			</c:forEach>
			</c:if>
</div>
</div>
</body>
</html>