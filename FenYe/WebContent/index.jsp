<%@ page pageEncoding="utf8" contentType="text/html;charset=utf8" import="java.util.List,org.java.fenye.test.Connection,org.java.fenye.test.Users" %>
<%
	
	// 0.接收传入的页码
	String str = request.getParameter("pageNum") ;
	String dir = request.getParameter("dir") ;
	String spage = request.getParameter("s") ;
	Integer pageNow = null ;
	if (str!=null){
		pageNow = Integer.parseInt(str);
	}
	out.print("<h1>分页应用</h1>") ;
	// 1.设置要显示的行数
	Integer pageSize = Connection.PAGESIZE = 20 ;
	
	// 2.设置显示第X页
	Connection.PAGE_NOW = pageNow = (pageNow == null) ? 1 : pageNow ;
	
	out.print("当前的页码是:" + Connection.PAGE_NOW);
	// 3.取出计算后的页数
	Integer pageCount = Connection.PAGECOUNT ;
	
	// 4.页码处理
	// 5.页码处理
	
	int a=1,b=1 ;
	if(dir!=null && dir.equals("p")){
		b = Integer.parseInt(spage) - 1 ;
		if (b<1){
			b = 1 ;
		}
		if(pageNow == 0){
			pageNow = 1 ;
		}
		request.setAttribute("s", b) ;
	}
	if (dir!=null && dir.equals("n")){
		b = Integer.parseInt(spage) + 1 ;
		if (b > pageCount - pageSize ){
			b = pageCount - pageSize ;
		}
		if(pageNow > pageCount){
			pageNow = pageCount ;
		}
		request.setAttribute("s", b) ;
	}
	
	// 5.取出当前页结果集
	List<Users> ulist = Connection.DATASET != null ? Connection.getPagingResult(pageNow) : Connection.DATASET ;
	
	
	%>
		<table border="1">
			<tr><td id="count">共<%=Connection.ROWCOUNT %>条记录</td></tr>
			<tr>
				<td>编号</td>
				<td>姓名</td>
			</tr>
			<%
				for(Users o : ulist){
			%>
			<tr>
				<td><%=o.getUserid() %></td>
				<td><%=o.getUsername() %></td>
			</tr>
			<%	} %>
		</table>
		<style type="text/css">
			#count{
				color:red;
			}
		</style>
		
	<%
		// 显示页码
		%>
		<a href="index.jsp?pageNum=<%=1 %>">首页</a>
		<a href="index.jsp?pageNum=<%=pageNow-1 %>&s=<%=a %>&dir=p">上一页</a>
		
		<%
			
			for( a = b ; a <= b+10  ; a++ ){%>
			<a href="index.jsp?pageNum=<%=a %>"><%=a %></a>
		<%}%>
		<a href="index.jsp?pageNum=<%=pageNow+1 %>&s=<%=a %>&dir=n">下一页</a>
		<a href="index.jsp?pageNum=<%=pageCount %>">尾页</a>
		
		<%
		
	%>