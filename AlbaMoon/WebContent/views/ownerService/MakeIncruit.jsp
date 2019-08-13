<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="owner.model.vo.OwnerInfo"%>
<%@ include file="../ownerService/OwnerServiceMenubar.jsp"%>
<%	
	OwnerInfo ownerInfo = (OwnerInfo) session.getAttribute("emp");
	Boolean auth = true;
	String eName = "";
	int phone = 0;
	String address = "";
	String email = "";
	
	if(ownerInfo == null){
		auth = false;
	}else{
		eName = emp.geteName();
		phone = emp.getPhone();
		address = emp.getAddress();
		email = emp.getEmail();
	}
%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>공고 작성</title>
</head>
<body>


공고상품 검색해서 삽입하는 부분은 ajax 배운 후에 가능

</body>
</html>