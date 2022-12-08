<%-- 
    Document   : addStudent
    Created on : 3 Dec 2022, 03:56:52
    Author     : donbo
--%>

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
    // the place it will create the db file
    
    Statement statement = connection.createStatement();
    // creating table 
    statement.executeUpdate("create table if not exists student (id integer primary key autoincrement, name string, course string, mark integer, type string)");
    // when creating the table, then you specify the data type of the columns! like here above
    PreparedStatement pStmt = connection.prepareStatement("insert into student (id, name, course, mark, type) values (?,?,?,?,?)" );
    // student is not the .db  the university is
    
    // the first parameter does not need to be clarified since it is the priamary key on AUTOINCREMENT!!!
    pStmt.setString (2, request.getParameter("studentName"));
    pStmt.setString (3, request.getParameter("studentCourse"));
    pStmt.setInt (4, Integer.parseInt(request.getParameter("studentMark"))); // reading in an integer like this! 
    pStmt.setString (5, request.getParameter("studentType"));
    
    //feedback if the row was added 
    int rowsAdded = pStmt.executeUpdate();
    if(rowsAdded == 1)
    {
        out.println("Succesfully added");
    }
    else
    {
        out.println("Could not add");
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
