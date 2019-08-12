<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>로그인창</title>

<style>

    form{
        border: 1px solid black;
        width: 310px;
        resize: none;
        margin-left: auto;
        margin-right: auto;

    }

    #login{
        height: 85px;
        width: 60.5px;
    }

    #userId, #userPwd{
        height: 35px;
        width: 235px
    }

    #joinMember, #findId, #findPwd{
        width: 100px;
        height: 40px;
        
    }

    #joinMember{
        font-weight: bold;    
    }



</style>

</head>
<body>

    <div>

    </div>

    <div>
        <form action="">
            <table>
                <tr>
                    <td><input type="text" name="userId" id="userId" minlength="4" maxlength="15" placeholder="아이디"></td>
                    <td rowspan="2"><input type="submit" id="login" value="로그인"></td>
                </tr>
                <tr>
                    <td><input type="password" name="userPwd" id="userPwd" minlength="6" maxlength="16" placeholder="비밀번호"></td>
                </tr>
                <tr>

                </tr>
            </table>
            <hr>
            <div id="btn">
                <button id="findId" onclick="location.href='<%= request.getContextPath() %>/views/common/FindId.jsp'">아이디 찾기</button>
                <button id="findPwd" onclick="location.href='<%= request.getContextPath() %>/views/common/FindPwd.jsp'">비밀번호 찾기</button>
                <button id="joinMember" onclick="location.href='<%= request.getContextPath() %>/views/common/SelectJoinMember.jsp'">회원가입</button>

                
            </div>
        </form>
    </div>

    <script>
        
    
    
    </script>
  

</body>
</html>