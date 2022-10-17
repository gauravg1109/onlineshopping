<%@page import="project.ConnectionProviderClass"%>
<%@page import="java.sql.*"%>
<%
String email=session.getAttribute("email").toString();
String subject=request.getParameter("subject");
String body=request.getParameter("body");
int check=0;
try{
	Connection con=ConnectionProviderClass.getcon();
	PreparedStatement ps=con.prepareStatement("insert into message(email,subject,body) values(?,?,?)");
	ps.setString(1,email);
	ps.setString(2,subject);
	ps.setString(3,body);

	ps.executeUpdate();
	response.sendRedirect("messageUs.jsp?msg=valid");

}
catch(Exception ex){
System.out.println(ex);
response.sendRedirect("messageUs.jsp?msg=invalid");
}
%>