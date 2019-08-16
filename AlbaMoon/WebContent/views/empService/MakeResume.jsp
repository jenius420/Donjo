<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="EUC-KR"
	import="emp.model.vo.Emp"
%>
<%@ include file="../empService/EmpServiceMenubar.jsp"%>
<%	
	Emp emp = (Emp) session.getAttribute("loginUser");
	Boolean accessAuth = true;
	String eName = "";
	int phone = 0;
	String address = "";
	String email = "";
	if(emp == null){
		accessAuth = false;
	}else{
		eName = emp.geteName();
		phone = emp.getPhone();
		address = emp.getAddress();
		email = emp.getEmail();
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>이력서 등록</title>
</head>
<body>

	<form id="resumeForm" action="<%=request.getContextPath()%>/resume.es" method="POST">
		
		제목 <input type="text" name="resumeTitle" id="resumeTitle"
			placeholder="이력서 제목">
			
		이름 <%= eName %>
		전화번호<%= phone %>
		주소<%= address %>
		이메일<%= email %>
		
		희망근무지(구) 
		<select name="district" id="district">
			<option value="강남구">강남구</option>
		</select> 
		
		희망업직종 
		<select name="type" id="type">
			<option value="IT">IT</option>
		</select> 
		
		최종학력 
		<select name="edu" id="edu">
			<option value="대학졸업">대학졸업</option>
		</select> 
		
		희망급여형태 
		<select name="desireForm" id="desireForm">
			<option value="시급">시급</option>
		</select> 
		
		희망급여 
		<input type="text" name="desireIncome" id="desireIncome">원
		
		사진
		
		하고싶은말
		<textarea name="comment" id="comment" cols="30" rows="10" style="resize:none;"></textarea>
		
		이력서공개설정 	
		<input type="checkbox" name="openSet" id="openSet"  value="Y" checked>
		
		<input type="hidden" value="보여주면 안 되는데 같이 넘겨야 하는 경우">
		
		<input type="submit" value="저장완료">
		<input type="reset" value="초기화">
		<button type="button" onclick="javascript:history.back();">이전 화면으로</button>

	</form>

</body>
</html>