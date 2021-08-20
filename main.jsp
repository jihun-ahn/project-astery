<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인화면</title>
<link rel="stylesheet" type="text/css" href="/resources/css/astery.css?ver=1">
</head>
<body>
<jsp:include page="include/header.jsp" />
	<c:if test="${empty code}">
		<h2>로그인이 필요합니다.</h2>
	</c:if>
	<c:if test="${!empty code}">
		<p>${code}님 환영합니다.</p>
	</c:if>
	<div class="item">아이디</div>
    <div class="input">
        <div class="inputText">
        	<p>코드 : ${code}</p>
        </div>
        <div class="text"></div>
    </div>
    
    <main>
    <c:forEach var="p" items="${posting}"> <!-- posting list를 for문돌려서 여러개의 피드 띄우기 -->
    	<div class="feed">
    		<article>
    			<header>
    				<div class="profilephoto"> <!--  프로필사진  -->
    					<a href="/main/user/${p.user.id}">
    						<img class="profilephotoPic" src="/images/profile/${p.user.profile_photo}">
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
    			</div>
    				<!-- 좋아요갯수표시 -->
    			
    			<div class="write"> <!-- 글내용 -->
					<span>${p.description}</span>
				</div>
				
				<!-- 댓글 -->
				<div><!-- 댓글작성 -->
                	<input id="commentInput" class="commentInput" type="text" placeholder="댓글 달기..." >
                	<button type="submit" class="commentButton">게시</button>
              	</div>
    		</article>
    </c:forEach>
    </main>
</body>
</html>