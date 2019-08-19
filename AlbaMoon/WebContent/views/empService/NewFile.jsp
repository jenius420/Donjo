<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

서블렛에서 서블렛 호출
//response.sendRedirect("manageResume.es"); 이런식으로 서블렛을 바로 부를 수도 있고
//response.sendRedirect("manageResume.es?empNum="+empNum); 해당서블렛에서 사용될 변수가 있으면 이렇게 추가하면 됨

페이징 처리
int listCount = SO.getCount(); // 컨탠츠 갯수 알아옴
int currentPage;
int pageLimit = 10; // 한 화면에 보여지는 페이지 수 (보통 5,10개져)
int maxPage; //가장 마지막 페이지
int startPage // 한 화면에서의 첫번째 페이지 번호
int endPage // 위와 반대.
int boardLimit=10 // 한 페이지에 보여질 게시물에 최대 갯수

currentPage = 1;
if(request.getParameter("currentPage") != null){
	currentPage=Integer.parseInt(request.getParameter("currentPage"));
}

maxPage = (int)Math.ceil((double)n/boardLimit);

startPage = (currentPage - 1)/ pageLimit) * pageLimit + 1;


endPage = startPage + pageLimit - 1;
if(maxPage<endPage){
endPage=maxPage
}

사용할 sql문= SELECT COUNT(*) FROM TB WHERE절


</body>
</html>