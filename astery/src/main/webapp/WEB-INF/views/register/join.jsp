<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<<<<<<< HEAD
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/join.css">
=======
<link rel="stylesheet" href="/resources/css/join.css">
>>>>>>> 008e85ad7668365fdd3410cc5c9260b0553dd9f1
</head>
<body>
      <h2>회원가입</h2>
      
      <div class="textForm">
        <input name="loginId" type="text" class="id" placeholder="아이디">
      </div>
      
      <div class="textForm">
        <input name="loginPw" type="password" class="pw" placeholder="비밀번호">
      </div>
      
      <div class="textForm">
        <input name="loginPwConfirm" type="password" class="pw" placeholder="비밀번호 확인">
      </div>
      
      <div class="textForm">
        <input name="name" type="password" class="name" placeholder="이름">
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
      
      <input type="submit" class="btn" value="JOIN"/>
</body>
</html>