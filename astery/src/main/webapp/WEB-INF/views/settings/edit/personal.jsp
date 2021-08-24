<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>개인 계정 전환</title>
<link rel="stylesheet" type="text/css" href="/resources/css/astery.css?after" >
<link rel="stylesheet" type="text/css" href="/resources/css/official.css?after" >
</head>
<body>
<jsp:include page="/WEB-INF/views/include/header.jsp" />
	<form:form commandName="changeOfficialAccountCommand">
    	<section>    	
        <h1>공식 계정 설정</h1>
        <article>
            <label>
                <div class="label">
                    <img src="/resources/img/artist.png" alt="개인계정"><br>
                    <p>개인계정</p>
                    <form:radiobutton path="official" value="F"/>
                </div>
            </label>
        </article>
        <div class="submit"><input type="submit" value="확인" class="btn"></div>
        
    	</section>
    </form:form>
    <footer></footer>
</body>
</html>