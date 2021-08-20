<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>프로필 설정</title>
<link rel="stylesheet" type="text/css" href="/resources/css/astery.css?after" >
</head>
<body>
	<jsp:include page="../../include/header.jsp" />
	<div><!-- 여기부터 -->
	    <section>
	        <!-- 설정 목록 -->
	        <jsp:include page="../../include/settingList.jsp" />
	        <!-- 세부 항목 -->
	        <article class="setting">
	            <!-- 각각 항목에 대한 페이지로 작성 -->
	            <form:form commandName="changeProfileCommand">
	                <div class="profilepicture">
				        <!-- <div class="photo"><img ></div> -->
				        <div class="textLink photoChange">프사 바꾸기</div>
				    </div>
			    	<div class="inputcell">
			            <div class="item">아이디</div>
			            <div class="input">
			                <div class="inputText">
			                	<form:input path="id" value="${member.id}"/>
			                	<form:errors path="id"/>
			                </div>
			                <div class="text"></div>
			            </div>
			        </div>
			        <div class="inputcell">
			            <div class="item">닉네임</div>
			            <div class="input">
			                <div class="inputText">
			                	<form:input path="nickname" value="${member.nickname}"/>
			                	<form:errors path="nickname"/>
			                </div>
			                <div class="text"></div>
			            </div>
			        </div>
			        <div class="inputcell">
			            <div class="item">이름</div>
			            <div class="input">
			                <div class="inputText">
			                	<form:input path="name" value="${member.name}"/>
			                </div>
			                <div class="text"></div>
			            </div>
			        </div>
			        <div class="inputcell">
			            <div class="item">연락처</div>
			            <div class="input">
			                <div class="inputText">
			                	<form:input path="tel" value="${member.tel}"/>
			                </div>
			                <div class="text"></div>
			            </div>
			        </div>
			        <div class="inputcell">
			            <div class="item">주소</div>
			            <div class="input">
			                <div class="inputText">
			                	<form:input path="address" value="${member.address}"/>
			                </div>
			                <div class="text"></div>
			            </div>
			        </div>
			        <div class="inputcell">
			            <div class="item">소개</div>
			            <div class="input">
			                <div class="inputText">
			                	<form:textarea path="intro" value="${member.intro}"/>
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