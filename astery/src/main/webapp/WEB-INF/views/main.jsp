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
	<p>메인입니다.</p>
	<div class="item">아이디</div>
    <div class="input">
        <div class="inputText">
        	<p>코드 : ${code}</p>
        </div>
        <div class="text"></div>
    </div>
</body>
</html>