<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>댓글</title>
<link rel="stylesheet" type="text/css" href="/resources/css/astery.css?ver=1">
<link rel="stylesheet" type="text/css" href="/resources/css/main.css?ver=1">

</head>
<body>
<jsp:include page="include/header.jsp"/>
	<comment>
		<div class="container">
			<label for="content">comment</label>
				<form name="commentInsertForm">
					<div class="input-group">
						<input type="hidden" name="pid" id="pid" value="${p.id}" /> 
						<input type="text" class="form-control" id="content" name="content" placeholder="내용을 입력하세요."> 
						<input type="hidden" name="uid" value="${currentid}" />
						<span class="input-group-btn">
							<button class="btn btn-default" type="button" name="commentInsertBtn">등록</button>
						</span>
					</div>
				</form>
					<div class="commentList"></div>
		</div>

<%@ include file="comment.jsp"%>
	</comment>
</body>
</html>