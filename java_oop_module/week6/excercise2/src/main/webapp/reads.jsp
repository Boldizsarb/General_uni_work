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
        <%@page import="java.util.ArrayList"%>
        <--!<!-- importing the java files! -->
        <%@page import="com.mycompany.excercise2.Student" %> 
        <%@page import="com.mycompany.excercise2.Undergraduate" %>


<% String sName = request.getParameter("studentName"); // requesting the variables. the parameters and on the 
 String sCourse = request.getParameter("studentCourse"); // form, the input name has to be identical! 
 String sMark = request.getParameter("studentMark");
 
    // if there is no session variable "names" exist then create one and set it to an empty array list
    if(session.getAttribute("names")==null){
        session.setAttribute("names",new ArrayList<String>());
    }
    
    // making an allias of the session variables 
    ArrayList<String> sessionNames = (ArrayList<String>)session.getAttribute("names");

 
    if(sName != null || sCourse != null || sMark!= null ){
     double mark= Double.parseDouble(sMark); // turning it into a bouble comes
     //after the if statement, if its not null othervise it throws an error
     
     sessionNames.add(sName); // adding the name to the list
      
      Undergraduate student = new Undergraduate(sName, sCourse, mark); // new object! 
      boolean success = student.setMark(mark); // storing the mark outcome in a boolen 
      if (success == false)
      {
        %>
        <p>Error, mark can not be more then 100 or less then 0!</p>
        
        <%
      }else{
      %>
      <p>Student details: <%=student%></p> <-<!-- had to be withing the if statement! othervise it throws an error -->
      <%
        }
    }
 %>


        <form action="" method="get">
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
        
        
<br><!-- looping through all the names in the list -->
<h3>Previous Students so far: </h3>
 <%
     for(String currentName: sessionNames)
     {
 %>   
 <%= currentName%> <br> 
<%
    }
%>

    </body>
</html> 