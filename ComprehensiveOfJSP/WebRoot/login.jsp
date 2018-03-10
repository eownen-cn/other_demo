<%@ include file="title.jsp" %>
<%@ page pageEncoding="utf8" %>
<!DOCTYPE html>
<html>
<head>
<title>登陸</title>
</head>
<body>
	<h2>用戶登陸</h2>
	<form action="${pageContext.request.contextPath }/LoginServlet" method="POST">
		<input type="text" name="loginName" placeholder="登錄名" /><br>
		<input type="password" name="loginPass" placeholder="密碼" /><br>
		<button type="submit">登錄</button>
	</form>
	<font color="gray">還沒賬號?</font><a href="${pageContext.request.contextPath }/toRegisterServlet">注册</a>
</body>
</html>