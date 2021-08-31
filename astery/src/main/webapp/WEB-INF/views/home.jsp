<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<link href="${pageContext.request.contextPath}/resources/css/find.css" rel="stylesheet"/>
<link href="${pageContext.request.contextPath}/resources/css/astery.css" rel="stylesheet"/>
<link href="${pageContext.request.contextPath}/resources/css/login.css" rel="stylesheet"/>
<link href="${pageContext.request.contextPath}/resources/css/join.css" rel="stylesheet"/>
</head>
<body>
    <section id="container">
    <h2>회원가입</h2>
	<form action="signUp" name="signForm" method="post">
		<div class="textForm">
			<input name="id" type="text" class="id" placeholder="아이디">
		</div>
		
		<div class="textForm">
			<input name="passWord" type="password" class="pw" placeholder="비밀번호">
		</div>
		
		<div class="textForm">
			<input name="name" type="text" class="name" placeholder="이름">
		</div>
		
		
		<div class="submit">
			<input type="submit" id="submit" value="가입하기">
			<!-- <a href="join.jsp">회원가입</a> -->
		</div>
	</form>
	</section>
	
	
<!-- 	      <h2>회원가입</h2>
      
      <section id="container">
      	<form action="signUp" method="post" name="signForm">
		      <div class="textForm">
		        <input name="loginId" type="text" class="id" placeholder="아이디">
		      </div>
		      
		      <div class="textForm">
		        <input name="loginPw" type="password" class="pw" placeholder="비밀번호">
		      </div>
		      
		      <div class="textForm">
		        <input name="loginPwConfirm" type="password" class="chpw" placeholder="비밀번호 확인">
		      </div>
		      
		      <div class="textForm">
		        <input name="name" type="text" class="name" placeholder="이름">
		      </div>
		      
		      <div class="textForm">
		        <input name="email" type="text" class="email" placeholder="이메일">
		      </div>
		      
		      <div class="textForm">
		        <input name="nickname" type="text" class="nickname" placeholder="닉네임">
		      </div>
		      
		      <div class="textForm">
		        <input name="cellphoneNo" type="number" class="cellphoneNo" placeholder="전화번호">
		      </div>
		      
				<div class="submit">
		           	<input type="submit" id="submit" value="가입하기" onclick="return joinChk()">
		          	<a href="join.jsp">회원가입</a>
		        </div>
		</form>
      </section> -->
	
</body>
</html>