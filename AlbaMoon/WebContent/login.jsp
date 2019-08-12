<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>로그인창</title>

<style>

    form{
        /* border: 1px solid black; */
        width: 295px;
        resize: none;
        margin-left: auto;
        margin-right: auto;

    }

    table, div{
        padding: 1px;
    }

    #login{
        height: 85px;
        width: 60.5px;
    }

    #userId, #userPwd{
        height: 35px;
        width: 220px
    }

    #joinMember, #findId, #findPwd{
        width: 95px;
        height: 40px;

    }

    #joinMember{
        font-weight: bold;    
    }



</style>

</head>
<body>

    <header>


    </header>

    <section>
        <form action="">
            <table>
                <tr>
                    <td><input type="text" name="userId" id="userId" placeholder="아이디"></td>
                    <td rowspan="2"><input type="submit" id="login" value="로그인"></td>
                </tr>
                <tr>
                    <td><input type="password" name="userPwd" id="userPwd" placeholder="비밀번호"></td>
                </tr>
                <tr>

                </tr>
            </table>
            <hr>
            <div>
                <input type="submit" id="findId" value="아이디 찾기">
                <input type="submit" id="findPwd" value="비밀번호 찾기">
                <input type="submit" id="joinMember" value="회원가입">
                
            </div>
        </form>
    </section>

    <script>
        
    
    
    </script>
  

</body>
</html>