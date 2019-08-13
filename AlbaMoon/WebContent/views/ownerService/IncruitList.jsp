<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="ownerService.model.vo.Incruit"
    import="java.util.ArrayList"
%>
<%
	ArrayList<Incruit> list = (ArrayList<Incruit>)request.getAttribute("incruitList");
%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>공고 리스트</title>
</head>
<body>

	단순 리스트 출력
	탭형식으로 진행중/마감된 나누면 좋겠음

</body>
</html>