<%@page import="project.ConnectionProviderClass"%>
<%@page import="java.sql.*"%>
<%
String id=request.getParameter("id");
String email=request.getParameter("email");
String status="Delivered";
try{
	Connection con=ConnectionProviderClass.getcon();
	Statement st=con.createStatement();
	st.executeUpdate("update cart set status='"+status+"' where product_id='"+id+"' and address is not NULL");
	response.sendRedirect("ordersReceived.jsp?msg=delivered");
	}
catch(Exception ex){
	System.out.println(ex);
	response.sendRedirect("ordersReceived.jsp?msg=wrong");
}
	%>