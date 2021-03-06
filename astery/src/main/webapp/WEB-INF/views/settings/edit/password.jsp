<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>비밀번호 변경</title>
<<<<<<< HEAD
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/astery.css?after" >
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/settings.css?after">
=======
<link rel="stylesheet" type="text/css" href="/resources/css/astery.css?after" >
<link rel="stylesheet" type="text/css" href="/resources/css/settings.css?after">
>>>>>>> 008e85ad7668365fdd3410cc5c9260b0553dd9f1
</head>
<body>
	<jsp:include page="/WEB-INF/views/include/header.jsp" />
	<div><!-- 여기부터 -->
	    <section>
	        <!-- 설정 목록 -->
	        <jsp:include page="/WEB-INF/views/include/settingList.jsp" />
	        <!-- 세부 항목 -->
	        <article class="settingForm">
	            <!-- 각각 항목에 대한 페이지로 작성 -->
	            <form:form commandName="changePasswordCommand">
	                  	<div class="inputcell">
				            <div class="item">현재 비밀번호</div>
				            <div class="input">
				                <div class="inputText">
				                	<form:password path="oldPassword"/>
				                	<form:errors path="oldPassword"/>
				                </div>
				                <div class="text"></div>
				            </div>
				        </div>
				        <div class="inputcell">
				            <div class="item">새 비밀번호</div>
				            <div class="input">
				                <div class="inputText">
				                	<form:password path="newPassword"/>
				                </div>
				                <div class="text"></div>
				            </div>
				        </div>
				        <div class="inputcell">
				            <div class="item">새 비밀번호 확인</div>
				            <div class="input">
				                <div class="inputText">
				                	<form:password path="confirmNewPassword"/>
				                	<form:errors path="confirmNewPassword"/>
				                </div>
				                <div class="text"></div>
				            </div>
				        </div>
				        <input type="submit" value="변경">
				    </form:form>
	        </article>
	    </section>
	    <footer></footer>
    </div>
</body>
</html>