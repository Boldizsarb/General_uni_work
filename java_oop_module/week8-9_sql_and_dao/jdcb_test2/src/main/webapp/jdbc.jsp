<%-- 
    Document   : jdbc
    Created on : 23 Nov 2022, 15:19:45
    Author     : donbo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<--<!-- All the classes to be imported -->
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.PreparedStatement"%>

<--<!-- These are all the dependencies to import in case of SQL -->
<%
Connection connection = null;

try
{   
    Class.forName("org.sqlite.JDBC"); // what is this?
    // loads a file in a driver / forcing the driver to load 
    
    connection = DriverManager.getConnection("jdbc:sqlite:C:/Users/donbo/NetBeansProjects/university.db");
    // the place it will create the db file
    
    Statement statement = connection.createStatement();
    // creating table 
    statement.executeUpdate("create table if not exists student (id integer primary key autoincrement, name string, course string, mark integer, type string)");
    // when creating the table, then you specify the data type of the columns! like here above
    PreparedStatement pStmt = connection.prepareStatement("insert into student (id, name, course, mark, type) values (?,?,?,?,?)" );
    // student is not the .db  the university is
    pStmt.setString (1, request.getParameter("studentName"));
    pStmt.setString (1, request.getParameter("studentName"));
}   
catch(SQLException e)
{
    out.print("Error"+ e);
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
        out.println("Close error: " + closeException); // not system just only out .print
        // by out.print directly outputting a statement to the html page. 
    }
}

%>





<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
