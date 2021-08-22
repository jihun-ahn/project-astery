s<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<header>
    <div class="head">
        <div class="width">
            <a href="<c:url value='/'/>" class="logo">Astery<!--<img src="../img/Astery100x58.png">--></a>
        </div>
        <div class="textbox"><input type="text" name="search" placeholder="🔍검색"></div>
        <ul class="menuList">
            <li><a href="<c:url value='/views/upload'/>"><img class="upload" src="/resources/img/upload.png"></a></li>
            <li><a href='<c:url value='/'/>'><img class="notice" src="/resources/img/notice.png"></a></li>
            <li><a href=''><img class="profile" src="/resources/img/profile.png"></a></li>
            <li class="aster"><a href="<c:url value='/settings/settingForm'/>"><img class="setting" src="/resources/img/setting.png"></a></li>
        </ul>
    </div>
</header>