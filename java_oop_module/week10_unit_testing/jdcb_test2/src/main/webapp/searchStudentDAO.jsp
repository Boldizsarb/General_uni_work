<%-- 
    Document   : addStudentDAO
    Created on : 7 Dec 2022, 15:52:36
    Author     : donbo
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="com.mycompany.jdcb_test2.Student"%>
<%@page import="com.mycompany.jdcb_test2.studentDAO"%>
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
        <h1>Add Student</h1>
        
        
        <%
Connection connection = null; // declering the connection! it is null intially to indicate we have not made a connection yet

try
{   
    Class.forName("org.sqlite.JDBC"); // needs to do this al the time 
    // loads a file in a driver / forcing the driver to load 
    
    connection = DriverManager.getConnection("jdbc:sqlite:C:/Users/donbo/Documents/NetBeansProjects/university.db");
    // the place it will create the db fill
    // creating a DAO
    studentDAO dao = new studentDAO(connection,"student"); // "student" is the name of the table
    // find students by name
    ArrayList<Student> students = dao.findStudentbyName(request.getParameter("studentName2"));
    
    // display each student
    for(Student s: students)
    {
        out.print(s.getName()+""+s.getCourse()+""+s.getMark());
    }
    
    
}   
catch(SQLException e)

{
    out.print("<strong> Error with database"+ e+"</strong>");
}
finally
{
        if(connection != null) // if the conncection was made succesfully we close the connection! 
        {
            try
            {
                connection.close(); // the closing itself can throw an excepton so it needs to be put into a try block
           }
           catch(SQLException closeException)
           {
                out.print("<strong> Error with database closing"+ closeException +"</strong>");
            }
            
        }
    
}

%>
    </body>
</html>
