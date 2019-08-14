<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html ">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>게시글 신고 내역</title>
</head>
<body>

<!-- 게시글 클릭 시 스크립트 -->
<script>
		$(function(){
			$("listArea td").mouserenter(function(){
				$(this).parent().css({"background":"darkgrey", "cursor":"pointer"});
			}).mouseout(function(){
				$(this).parent().css("background","black");
			}).click(function(){
				var num = $(this).parent().children().eq(0).text();
				location.href="<%=request.getContextPath()%>/detail.no?tNum=" + num;
			});
		});
		
		서블렛에서는 아래로 받아줘야함
		int tNum = Integer.parseInt(requset.getParameter("tNum"));
	
	</script>

</body>
</html>