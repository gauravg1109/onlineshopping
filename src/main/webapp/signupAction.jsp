<%@page import="project.ConnectionProviderClass"%>
<%@page import="java.sql.*"%>
<%
String name=request.getParameter("name");
String email=request.getParameter("email");
String mobileNumber=request.getParameter("mobilenumber");
String securityQuestion=request.getParameter("securityQuestion");
String answer=request.getParameter("answer");
String password=request.getParameter("password");
String address="";
String city="";
String state="";
String country="";
try{
	Connection con=ConnectionProviderClass.getcon();
    PreparedStatement ps=con.prepareStatement("insert into users values(?,?,?,?,?,?,?,?,?,?)");
    ps.setString(1,name);
    ps.setString(2,email);
    ps.setString(3,mobileNumber);
    ps.setString(4,securityQuestion);
    ps.setString(5,answer);
    ps.setString(6,password);
    ps.setString(7,address);
    ps.setString(8,city);
    ps.setString(9,state);
    ps.setString(10,country);
    ps.executeUpdate();
    response.sendRedirect("signup.jsp?msg=valid");
}
catch(Exception ex){
	 System.out.println(ex);
	  response.sendRedirect("signup.jsp?msg=invalid");
	 
}
%>