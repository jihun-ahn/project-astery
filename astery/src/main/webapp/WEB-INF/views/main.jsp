<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인화면</title>
<link rel="stylesheet" type="text/css" href="/resources/css/astery.css?ver=1">
<link rel="stylesheet" type="text/css" href="/resources/css/main.css?ver=1">

</head>
<body>
	<jsp:include page="/WEB-INF/views/include/header.jsp" />

	<c:if test="${empty code}">
		<h2>로그인이 필요합니다.</h2>
	</c:if>
	<c:if test="${!empty code}">
		<p>${code}님 환영합니다.</p>
	</c:if>
	
    <main>
    <c:if test="${empty posts}">
    	<h2>게시글이 존재하지 않아요</h2>
    </c:if>
    <c:if test="${!empty posts}">
	   <c:forEach var="p" items="${posts}"> <!-- posting list를 for문돌려서 여러개의 피드 띄우기 -->
	   	<div class="feed">
	   		<article>
	   			<header>
	   				<div class="profilephoto"> <!--  프로필사진  -->
	   					<a href="/main/user/${p.usercode}">
	   						<img class="profilephotoPic" src="/images/profile/${p.user.profilephoto}">
	   					</a>
	   				</div>
	   				<div class="usernickname"> <!-- 닉네임 -->
	   					<a href="/main/user/${p.user.id}">${p.user.userId}</a>
	   				</div>
	   			</header>
	   			<div class="feedImage"> <!-- 게시물사진 -->
	   				<c:forEach var="img" items="${img}">
	   					<c:if test="${p.id == img.postId}">
	   						<img class="feedPic" src="/images/${p.user.userId}/${img.filename}" class="imgg">
	   					</c:if>
	   				</c:forEach>
	   			</div>
	   			<div class="icon">
	   				<!-- 좋아요, 댓글달기, 북마크 -->
	   				 <li><a href='<c:url value='/'/>'><img class="like" src="/resources/img/like.png"></a></li>
	   				  <li><a href='<c:url value='/'/>'><img class="comment" src="/resources/img/comment.png"></a></li>
	   				   <li><a href='<c:url value='/'/>'><img class="bookmark" src="/resources/img/bookmark.png"></a></li>
	   			</div>
	   			<div> <!--  좋아요갯수표시 -->
	   				ㅇㅇㅇ님 외 12345678명이 좋아합니다.
	   			</div>
	   			<div class="write"> <!-- 글내용 -->
					<span>${p.content}</span>
				</div>
				
				<!-- 댓글 -->
				<div><!-- 댓글작성 -->
	               	<input id="commentInput" class="commentInput" type="text" placeholder="댓글 달기..." >
	               	<button type="submit" class="commentButton">게시</button>
	             	</div>
	   		</article>
	   </c:forEach>
    </c:if>
    </main>
</body>
</html>