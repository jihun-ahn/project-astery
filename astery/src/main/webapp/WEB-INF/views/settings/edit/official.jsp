<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<<<<<<< HEAD
<title>공식 계정 전환</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/astery.css?after" >
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/official.css?after" >
=======
<<<<<<<< HEAD:astery/src/main/webapp/WEB-INF/views/settings/edit/official.jsp
<title>공식 계정 전환</title>
<link rel="stylesheet" type="text/css" href="/resources/css/astery.css?after" >
<link rel="stylesheet" type="text/css" href="/resources/css/official.css?after" >
========
<title>공식 계정 설정</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/astery.css?after" >
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/official.css?after" >
>>>>>>>> 008e85ad7668365fdd3410cc5c9260b0553dd9f1:astery/src/main/webapp/WEB-INF/views/settings/official.jsp
>>>>>>> 008e85ad7668365fdd3410cc5c9260b0553dd9f1
</head>
<body>
	<jsp:include page="/WEB-INF/views/include/header.jsp" />
	<form:form commandName="changeOfficialAccountCommand">
    	<section>    	
        <h1>공식 계정 설정</h1>
        <article>
            <label>
                <div class="label">
                    <img src="${pageContext.request.contextPath}/resources/img/artist.png" alt="아티스트 및 인플루언서"><br>
                    <p>아티스트 및 인플루언서</p>
                    <form:radiobutton path="official" value="A"/>
                </div>
            </label>
        </article>
        <article>
            <label>
                <div class="label">
                    <img src="${pageContext.request.contextPath}/resources/img/business.png" alt="기업, 단체"><br>
                    <p>기업, 단체</p>
                    <form:radiobutton path="official" value="B"/>
                </div>
            </label>
        </article>
        <div class="submit"><input type="submit" value="확인" class="btn"></div>
    	</section>
    </form:form>
    <footer></footer>
</body>
</html>
</body>
</html>