<%-- 
    Document   : newjsp
    Created on : 23 Nov 2022, 15:13:39
    Author     : donbo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add a student</title>
    </head>
    <body>
        <h1>Add a student record</h1>
        


        <form action="./FILL_THIS_IN" method="post">
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
    </body>
</html>