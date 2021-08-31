<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@400;500;700&display=swap" rel="stylesheet">
<script src="https://kit.fontawesome.com/53a8c415f1.js" 
 crossorigin="anonymous">
</script>

<link href="${pageContext.request.contextPath}/resources/css/find.css" rel="stylesheet"/>
<link href="${pageContext.request.contextPath}/resources/css/astery.css" rel="stylesheet"/>
<link href="${pageContext.request.contextPath}/resources/css/login.css" rel="stylesheet"/>
<link href="${pageContext.request.contextPath}/resources/css/astery.css" rel="stylesheet"/>
<title>로그인</title>
</head>
<body>
	<div class="head">
		<div class="width">
			<a href="#" class="logo">Astery<!--<img src="../img/Astery100x58.png">--></a>
		</div>
	</div>            
    <div class="wrap">
        <div class="login">
            <h2>Log-in</h2>
            <div class="login_sns">
	            <a href="#"><i class="fab fa-instagram"></i></a>
	            <a href="#"><i class="fab fa-facebook-f"></i></a>
	            <a href="#"><i class="fab fa-twitter"></i></a>
            </div>
		<form action="login/login.do" name="form1" method="post" id="form1">
			<input type="hidden" value="name" name="name">	
            <div class="login_id">
                <h4>아이디</h4>
                <input type="text" name="id" id="userId" placeholder="Email">
            </div>
            <div class="login_pw">
                <h4>비밀번호</h4>
                <input type="password" name="passWord" id="userPwd" placeholder="Password">
            </div>
            
            <div class="submit">
            	<a href="/home">회원가입</a>
            </div>
            <div class="submit">
            	<c:if test="${msg == 'failure'}">
            		<div style="color: red;">
            			아이디 또는 비밀번호가 일치하지 않습니다.
            		</div>
            	</c:if>
                <input type="submit" value="로그인">
                <c:if test="${msg == 'logout'}">
            		<div style="color: red;">
            			로그아웃 되었습니다.
            		</div>
            	</c:if>
            </div>
            </form>
        </div>
    </div>
</body>