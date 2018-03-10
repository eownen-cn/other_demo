<%@ include file="title.jsp" %>
<%@ page pageEncoding="utf8" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  </head>
  
  <body>
    <c:if test="${empty sname }">
    	hello <c:out value="未知用戶" /> , 請<a href="<%=basePath %>/login.jsp">登陸</a> / <a href="<%=basePath %>/register.jsp">注冊</a><br>
    </c:if>
    <c:if test="${not empty sname }">
    	hello <c:out value="${sname}" /> , 歡迎使用永凌布羅戈系統<br>
    </c:if>
  </body>
</html>
