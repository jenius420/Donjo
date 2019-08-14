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
	아니면 한 테이블에서 정렬해서 출력하던지
	
	<div class="tableArea">
		
			<table id="listArea">
				<tr>
					<th></th>
					<th width="300"></th>
					<th></th>
					<th></th>
					<th></th>
				</tr>
				<%if(list.isEmpty()){%>
					<tr><td colspan="?">존재하는 내용이 없습니다</td></tr>
				<%}else{ 
				for(Incruit i : list) {%>
				<tr>
					<td><%=i.get() %></td>
					<td><%=i.get() %></td>
					<td><%=i.get() %></td>
					<td><%=i.get() %></td>
					<td><%=i.get() %></td>
				</tr>
				<%}}%>
				
				
			</table>
		
		</div>

</body>
</html>