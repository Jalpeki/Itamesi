<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ログイン</title>
</head>
<body>
<div align=center><h1>イタ飯</h1>
    <s:form action="LoginAction">
       メールアドレス<s:textfield name="email"/><br>
       パスワード <s:password name="password"/><br>
       <s:submit value="送信"/>
       </s:form>

</div>
</body>
</html>