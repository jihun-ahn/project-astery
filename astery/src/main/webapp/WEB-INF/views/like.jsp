<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="/resources/css/astery.css?after">
<title>잘못된 접근</title>
</head>
<body>
	function likeInsert(pid){
	$.ajax({
		// onclick="likeInsert('+ id +');  // view에서 이런식으로 한 이유는..(밑에줄)
		url : '/like/insert/' + pid, // pathvariable로 설정했으므로 postid값을 넘겨줘야됨
		type : 'post',
		success : function(data){
			if(data == 1)
				likeview();
		}
	});
}
	
function likeDelete(pid){
	$.ajax({
		url : '/like/delete/' + pid,
		type : 'post',
		success : function(data){
			if(data == 1)
				likeview();
		}
	});
}
</body>
</html>