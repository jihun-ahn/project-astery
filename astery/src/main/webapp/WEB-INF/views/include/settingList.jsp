<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<article class="settingList">
	<ul>
<<<<<<< HEAD
		<li class="m_profile"><a href="${pageContext.request.contextPath}/settings/edit/profile">프로필 편집</a></li>
		<li class="m_pwd"><a href="${pageContext.request.contextPath}/settings/edit/password">비밀번호 변경</a></li>
=======
		<li class="m_profile"><a href="/settings/edit/profile">프로필 편집</a></li>
		<li class="m_pwd"><a href="/settings/edit/password">비밀번호 변경</a></li>
>>>>>>> 008e85ad7668365fdd3410cc5c9260b0553dd9f1
		<!-- <li><a href="">알림 설정</a></li> -->
		<li class="m_public"><a href="">공개 범위</a></li>
		<li class="m_privacy"><a href="">비공개 계정</a></li>
		<c:if test="${official=='F'}">
<<<<<<< HEAD
			<li class="m_official"><a href="${pageContext.request.contextPath}/settings/official">공식 계정 전환</a></li>
		</c:if>
		<c:if test="${official=='A'}">
			<li class="m_official"><a href="${pageContext.request.contextPath}/settings/official">개인 계정 전환</a></li>
		</c:if>
		<c:if test="${official=='B'}">
			<li class="m_official"><a href="${pageContext.request.contextPath}/settings/official">개인 계정 전환</a></li>
=======
			<li class="m_official"><a href="/settings/official">공식 계정 전환</a></li>
		</c:if>
		<c:if test="${official=='A'}">
			<li class="m_official"><a href="/settings/official">개인 계정 전환</a></li>
		</c:if>
		<c:if test="${official=='B'}">
			<li class="m_official"><a href="/settings/official">개인 계정 전환</a></li>
>>>>>>> 008e85ad7668365fdd3410cc5c9260b0553dd9f1
		</c:if>
	</ul>
</article>
