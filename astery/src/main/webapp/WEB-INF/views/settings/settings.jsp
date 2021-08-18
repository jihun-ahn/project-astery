<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>설정</title>
<link rel="stylesheet" type="text/css" href="/resources/css/astery.css" >
</head>
<body>
	<jsp:include page="../include/header.jsp" />
	<div><!-- 여기부터 -->
	    <section>
	        <!-- 설정 목록 -->
	        <jsp:include page="../include/settingList.jsp" />
	        <!-- 세부 항목 -->
	        <article class="setting">
	            <!-- 각각 항목에 대한 페이지로 작성 -->
	            <p>세팅 메인</p>
	        </article>
	    </section>
	    <footer></footer>
    </div>
</body>
</html>