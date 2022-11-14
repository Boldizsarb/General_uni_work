<%-- 
    Document   : session
    Created on : 13 Nov 2022, 01:55:04
    Author     : donbo
--%>
<-<!-- This is a self submitting port!  -->

<%@page import="java.util.ArrayList"%> <-<!-- the way of importing array list in jsp -->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
     <%
    
    
    // Does the session variable "names" exist? If not, create it and set it to an empty array list.
    if(session.getAttribute("names") == null) 
    {
        session.setAttribute("names", new ArrayList<String>());
    }

    
    // Make an alias of the session variable, using a regular variable called "sessionNames. 
    ArrayList<String> sessionNames = (ArrayList<String>) session.getAttribute("names");
  
    // Read in the parameter from the form
    String fName = request.getParameter("firstName");

    // Was a parameter submitted? If so, the parameter will be non-null
    if (fName != null)
    {
          // Add the name to the list of names
          sessionNames.add(fName);
    }
    // In this example, we ALWAYS display the form, whether the parameter was
    // submitted or not
   
    %>
    <!-- an empty action means we send the data to the current JSP -->
    <form action="" method="get">
    <p>Please enter your name:
    <input type="text" name="firstName" value="" />
    <input type="submit" value="Send to JSP!" />
    </form> 
    <br />
    <h2>Names so far..</h2>
    <%
    // Loop through all the names in the array list
    for(String currentName: sessionNames) 
    {
        %>
        <%=currentName%><br />
        <%
    }
%>
        
        
        
        
        
        
        
    </body>
</html>
