<%@page import="project.ConnectionProviderClass"%>
<%@page import="java.sql.*"%>
<%
String id=request.getParameter("id");
String name=request.getParameter("name");
String category=request.getParameter("category");
String price=request.getParameter("price");
String active=request.getParameter("active");


try{
	Connection con=ConnectionProviderClass.getcon();
	Statement st=con.createStatement();
	st.executeUpdate("update prod set name='"+name+"',category='"+category+"',price='"+price+"',active='"+active+"'where id='"+id+"'");
    if(active.equals("No"))
    {
    	st.executeUpdate("delete from cart where product id='"+id+"' and address is NULL");
    }
    response.sendRedirect("allProductEditProduct.jsp?msg=done");
}

catch(Exception ex){
	System.out.println(ex);
	response.sendRedirect("allProductEditProduct.jsp?msg=wrong");
}
%>