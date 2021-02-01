<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="../common/menu.jsp" />
<div align="center">
<h1>여기는 로그인 결과를 보여주는 페이지 </h1>
입력한 아이디 : ${param.id }<br/>  <!-- 얘네는 파라미터 값을 불러오는 거기 때문에 param 붙여줘야 함 -->
입력한 패스워드 : ${param.pw }<br/>
돌아올 메세지 : ${param.id }님 ${msg } <!-- setAttribute("msg", message)는 원래 서버가 갖고 있는 값이기 때문에 param 안 붙여줘도 됨 -->
</div>
</body>
</html>