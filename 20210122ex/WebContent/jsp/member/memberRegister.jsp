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
<h1>여기는 회원가입 결과를 보여주는 페이지 </h1>
<div>
이름 :  ${param.name }<br/> <!-- 얘네는 파라미터 값을 불러오는 거기 때문에 param 붙여줘야 함 -->
아이디 : ${param.id }<br/>  
취미 :  ${paramValues.hobbys[0] } ${paramValues.hobbys[1] }
       ${paramValues.hobbys[2] } ${paramValues.hobbys[3] }
       ${paramValues.hobbys[4] } <br/>
성별 : ${param.gender }<br/>
번호 : ${param.tel }<br/>
돌아올 메세지 : ${param.id }님 ${msg } <!-- setAttribute("msg", message)는 원래 서버가 갖고 있는 값이기 때문에 param 안 붙여줘도 됨 -->
</div>
</div>
</body>
</html>