<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>프로필 설정</title>
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
	            <form:form commandName="changeProfileCommand">
	                <div class="profilepicture">
				        <!-- <div class="photo"><img ></div> -->
				        <div class="textLink photoChange">프사 바꾸기</div>
				    </div>
			    	<div class="inputcell">
			            <div class="item"><strong>아이디</strong></div>
			            <div class="input">
			                <div class="inputText">
			                	<form:input path="id" value="${member.id}"/>
			                	<form:errors path="id"/>
			                </div>
			                <div class="text"></div>
			            </div>
			        </div>
			        <div class="inputcell">
			            <div class="item"><strong>닉네임</strong></div>
			            <div class="input">
			                <div class="inputText">
			                	<form:input path="nickname" value="${member.nickname}"/>
			                	<form:errors path="nickname"/>
			                </div>
			                <div class="text"></div>
			            </div>
			        </div>
			        <div class="inputcell">
			            <div class="item"><strong>이름</strong></div>
			            <div class="input">
			                <div class="inputText">
			                	<form:input path="name" value="${member.name}"/>
			                </div>
			                <div class="text"></div>
			            </div>
			        </div>
			        <div class="inputcell">
			            <div class="item"><strong>연락처</strong></div>
			            <div class="input">
			                <div class="inputText">
			                	<form:input path="tel" value="${member.tel}"/>
			                </div>
			                <div class="text"></div>
			            </div>
			        </div>
			        <div class="inputcell">
			            <div class="item"><strong>주소</strong></div>
			            <div class="input">
			                <div class="inputText">
			                	<form:input path="address" value="${member.address}"/>
			                </div>
			                <div class="text"></div>
			            </div>
			        </div>
			        <div class="inputcell textarea">
			            <div class="item"><strong>소개</strong></div>
			            <div class="input">
			                <div class="inputText">
			                	<form:textarea path="intro" value="${member.intro}"/>
			                </div>
			                <div class="text"></div>
			            </div>
			        </div>
			        <div class="inputcell">
			        	<input type="submit" value="변경">
			        </div>
			    </form:form>
	        </article>
	    </section>
	    <footer></footer>
	    <script>
			var intro = document.getElementById('intro');
			intro.innerHTML = '${member.intro}';
		</script>
    </div>
</body>
</html>