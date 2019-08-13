<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>기업서비스 메뉴바</title>
<style>
  .osMenubar li{
        color: plum;
        cursor: pointer;
        width: 15%;
        height: 100%;
        margin-right: 0;
        padding-right: 0;
		size:30px;        
        
    }

    .osMenubar span{
        color: purple;
        font-weight: bold;
    }
   	
   	.space{
   		height: 30px;
   	}
</style>
</head>
<body>

<div class="osMenubar">
    <div>
        <span>공고</span>
       	<div class="osLink" onclick="location.href='<%=request.getContextPath()%>/';">공고 등록</div>
        <div class="osLink" onclick="location.href='<%=request.getContextPath()%>/';">게제중인 공고</div>
        <div class="osLink" onclick="location.href='<%=request.getContextPath()%>/';">마감된 공고</div>
        <div class="osLink" onclick="location.href='<%=request.getContextPath()%>/';">지원자 관리</div>
    </div>
    <div class="space"></div>
    <div>
        <span>인재 관리</span>
        <div class="osLink" onclick="location.href='<%=request.getContextPath()%>/';">이력서 검색</div>
        <div class="osLink" onclick="location.href='<%=request.getContextPath()%>/';">스크랩 이력서</div>
    </div>
    <div class="space"></div>
    <div>
        <span>기업 상품</span>
        <div class="osLink" onclick="location.href='<%=request.getContextPath()%>/';">공고 상품</div>
        <div class="osLink" onclick="location.href='<%=request.getContextPath()%>/';">공고 상품</div>
    </div>
    <div class="space"></div>
    <div>
        <span>회원 정보 관리</span>
        <ul>
            <li>회원 정보 변경</li>
        </ul>
    </div>

</div>
    
</body>
</html>