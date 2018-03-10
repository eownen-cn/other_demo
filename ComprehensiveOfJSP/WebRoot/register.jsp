<%@ include file="title.jsp" %>
<%@ page pageEncoding="utf8" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注冊</title>
</head>
<body>
	<h2>用戶注冊</h2>
	<form action="${pageContext.request.contextPath }/RegisterServlet" method="POST">
		<input type="text" name="sname" placeholder="用戶名" /><br>
		<input type="text" name="loginName" placeholder="登錄名" /><br>
		<input type="password" name="loginPass" placeholder="密碼" /><br>
		<input type="reset" value="重置" />
		<button type="submit">提交</button>
	</form>
</body>
</html>