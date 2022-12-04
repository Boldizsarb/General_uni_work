<%-- 
    Document   : search
    Created on : 4 Dec 2022, 00:43:26
    Author     : donbo
--%>

<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.PreparedStatement"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Found Students:</h1>
        <%
        
        
        Connection connection = null;
try
{
    Class.forName("org.sqlite.JDBC"); // forcing the driver  
    connection = DriverManager.getConnection("jdbc:sqlite:C:/Users/donbo/Documents/NetBeansProjects/university.db");
    // connecting to the database
    
    PreparedStatement pStmt = connection.prepareStatement("select * from student where name=?");
    pStmt.setString(1, request.getParameter("studentName2"));
    ResultSet rs = pStmt.executeQuery();
    while(rs.next())
    {
        out.println("Student Id:"+ rs.getInt("id")+ "Name: " + rs.getString("name") + " Course: " + rs.getString("course") + " Mark: " + rs.getInt("mark") + " Type"+ rs.getString("type")+ "<br />");
    }

    
   
    // Send your SQL queries (see below)
}
catch(SQLException sqlException)
{
    out.println("Error: " + sqlException);
}
finally
{
    try
    {
        if(connection != null)
        {
            connection.close();
        }
    }
    catch (SQLException closeException)
    {
        out.println("Close error: " + closeException);
    }
}
        %>
        
        
        
        
    </body>
</html>
