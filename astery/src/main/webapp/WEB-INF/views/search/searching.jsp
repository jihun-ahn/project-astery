<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${search}-검색결과</title>
<link rel="stylesheet" type="text/css" href="/resources/css/astery.css?ver=1">
<link rel="stylesheet" type="text/css" href="/resources/css/search.css?ver=1">
</head>
<body>
	<jsp:include page="/WEB-INF/views/include/header.jsp" />
	<section>
		<article class="memberList">
			<c:if test="${empty memberList}">
    			<h2>사용자가 존재하지 않습니다.</h2>
    		</c:if>
    		<c:if test="${!empty memberList}">
	   			<c:forEach var="member" items="${memberList}">
	   				<div class="profile">
	                    <div class="profilephoto"><img src="${member.profilephoto}" alt="테스트프사"></div>
	                    <div class="nickname"><span>${member.nickname}</span></div>
	                </div>
                	<div class="intro"><span>${member.intro}</span></div>
	   			</c:forEach>
	   		</c:if>
		</article>
		<article class="postList">
   			<c:if test="${empty postList}">
    			<h2>글이 존재하지 않습니다.</h2>
    		</c:if>
    		<c:if test="${!empty postList}">
	   			<c:forEach var="post" items="${postList}">
	            	<div class="profile">
	             		<div class="profilephoto">
	             			<img src="/resources/img/${post.profilephoto}" alt="테스트프사">
	             		</div>
	             		<div class="nickname">
	             			<span>${post.nickname}</span>
	             		</div>
	            	</div>
	            	<div class="photo">
	            		<img src="/resources/img/${post.picture}" alt="테스트사진">
	            		</div>
	            	<div class="content">${post.content}</div>
	   			</c:forEach>
	   		</c:if>
		</article>
	</section>
</body>
</html>