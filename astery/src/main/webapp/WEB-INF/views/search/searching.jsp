<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${search}-검색결과</title>
<<<<<<< HEAD
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/astery.css?ver=1">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/search.css?ver=1">
<style>
img.prophoto {
    width: 45px;
    height: 45px;
    border-radius: 100%;
}
</style>
=======
<link rel="stylesheet" type="text/css" href="/resources/css/astery.css?ver=1">
<link rel="stylesheet" type="text/css" href="/resources/css/search.css?ver=1">
>>>>>>> 008e85ad7668365fdd3410cc5c9260b0553dd9f1
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
		   			<div class="members">
		   				<div class="s_profile">
<<<<<<< HEAD
		   					<div class="s_profilephoto">
		                        <img class="prophoto" src="${pageContext.request.contextPath}/resources/img/${member.profilephoto}" alt="테스트프사">
=======
		                    <div class="s_profilephoto">
		                    	<img src="${member.profilephoto}" alt="테스트프사">
>>>>>>> 008e85ad7668365fdd3410cc5c9260b0553dd9f1
		                    </div>
		                    <span class="s_nickname">${member.nickname}</span>
		                </div>
	                	<div class="s_intro"><span>${member.intro}</span></div>
	                </div>
	   			</c:forEach>
	   		</c:if>
		</article>
		<article class="postList">
   			<c:if test="${empty postList}">
    			<h2>글이 존재하지 않습니다.</h2>
    		</c:if>
    		<c:if test="${!empty postList}">
	   			<c:forEach var="post" items="${postList}">
		   			<div class="posts">
		            	<div class="s_profile">
		             		<div class="s_profilephoto">
<<<<<<< HEAD
		             			<img class="prophoto" src="${pageContext.request.contextPath}/resources/img/${post.profilephoto}" alt="테스트프사">
=======
		             			<img src="/resources/img/${post.profilephoto}" alt="테스트프사">
>>>>>>> 008e85ad7668365fdd3410cc5c9260b0553dd9f1
		             			<span class="s_nickname">${post.nickname}</span>
	             			</div>
		            	</div>
		            	<div class="s_photo">
<<<<<<< HEAD
		            		<img class="sphoto" src="${pageContext.request.contextPath}/resources/img/${post.picture}" alt="테스트사진">
=======
		            		<img src="/resources/img/${post.picture}" alt="테스트사진">
>>>>>>> 008e85ad7668365fdd3410cc5c9260b0553dd9f1
		            		</div>
		            	<div class="s_content">${post.content}</div>
	            	</div>
	   			</c:forEach>
	   		</c:if>
		</article>
	</section>
</body>
</html>