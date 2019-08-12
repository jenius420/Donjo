<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<style>
    #login{
        height: 100px;
    }

    #userId, #userPwd{
        height: 30px;
    }

    #joinMember, #findId, #findPwd{
        width: 100px;
        height: 40px;
        text-align: center;
    }

</style>

</head>
<body>

    <form action="">
        <table>
            <tr>
                <td rowspan="2"><input type="text" name="userId" id="userId" placeholder="아이디"></td>
                <td rowspan="3"><input type="submit" id="login" value="로그인"></td>
                <td><input type="submit" id="joinMember" value="회원가입"></td>
            </tr>
            <tr>
                <th><input type="submit" id="findId" value="아이디 찾기"></th>
            </tr>
            <tr>
                <td><input type="password" name="userPwd" id="userPwd" placeholder="비밀번호"></td>
                <th><input type="submit" id="findPwd" value="비밀번호 찾기"></th>
            </tr>
            <tr>
                <th></th>
            </tr>
        </table>   
    </form>
  

</body>
</html>