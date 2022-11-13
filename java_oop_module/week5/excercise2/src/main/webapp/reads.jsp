<%-- 
    Document   : reads
    Created on : 4 Nov 2022, 05:16:54
    Author     : donbo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add a student</title>
    </head>
    <body>
        <h1>Add a student record</h1>

        <%@page import="com.mycompany.excercise2.Student" %> 
        <%@page import="com.mycompany.excercise2.Undergraduate" %>


<% String sName = request.getParameter("studentName");
 String sCourse = request.getParameter("studentCourse");
 String sMark = request.getParameter("studentMark");

 
    if(sName != null || sCourse != null || sMark!= null ){
     double mark= Double.parseDouble(sMark); // after the if statement, if its not null othervise it throws an error
      
      Undergraduate student = new Undergraduate(sName, sCourse, mark);
      boolean success = student.setMark(mark);
      if (success == false)
      {
        %>
        <p>Error</p>
        
        <%
      } 
      
 %>
 
    
    <p> Student details: <%=student%></p>
   
   <p><a href="./read.jsp">Back to the form</a></p>
    
<%
    }
    else
    {
%>

        <form action="./reads.jsp" method="post">
            <p>Student name:<input type="text" name="studentName" value="" /></p>
            <p>Student course:<input type="text" name="studentCourse" value="" /></p>
            <p>Student mark:<input type="text" name="studentMark" value="" /></p>
            <p>Student type:
            <select name='studentType'>
            <option>Undergraduate</option>
            <option>Masters</option>
            </select>
            </p>
            <input type="submit" value="Register student!" />
        </form> 
        <br />
<%
    }
%>

    </body>
</html>