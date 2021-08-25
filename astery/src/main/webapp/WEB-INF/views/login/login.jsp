<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@400;500;700&display=swap" rel="stylesheet">
<script src="https://kit.fontawesome.com/53a8c415f1.js" 
 crossorigin="anonymous">
</script>
<link rel="stylesheet" href="/resources/css/login.css">
<title>로그인</title>
</head>
<body>
    <div class="wrap">
        <div class="login">
            <h2>Log-in</h2>
            <div class="login_sns">
	            <a href="#"><i class="fab fa-instagram"></i></a>
	            <a href="#"><i class="fab fa-facebook-f"></i></a>
	            <a href="#"><i class="fab fa-twitter"></i></a>
            </div>
            <div class="login_id">
                <h4>아이디</h4>
                <input type="text" name="userId" id="userId" placeholder="Email">
            </div>
            <div class="login_pw">
                <h4>비밀번호</h4>
                <input type="password" name="userPwd" id="userPwd" placeholder="Password">
            </div>
            <div class="login_etc">
<!--                 <div class="checkbox">
                	<input type="checkbox" name="" id=""> Remember Me?
            	</div> -->
                <div class="forgot_pw">
                <a href="">Forgot Password?</a>
            </div>
            </div>
            
            <div class="submit">
            	<input type="button" onclick="location.href='join.jsp'" value="회원가입">
            	<!-- <a href="join.jsp">회원가입</a> -->
            </div>
            <div class="submit">
                <input type="submit" value="로그인">
            </div>
        </div>
    </div>
</body>
</html>