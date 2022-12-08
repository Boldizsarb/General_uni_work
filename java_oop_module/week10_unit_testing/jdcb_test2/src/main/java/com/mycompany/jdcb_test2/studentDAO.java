/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jdcb_test2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

       

/**
 *
 * @author donbo
 */
public class studentDAO {
    private Connection connection; // jdbc connection 
    private String table;
    
    public studentDAO(Connection connection, String table)
    {
        this.connection = connection;
        this.table = table;
    }
    public Student findStudentById(String id)throws SQLException
    {
        PreparedStatement pStmt = connection.prepareStatement("select * from " + table + " where id=?");
        pStmt.setString(1,id);
        ResultSet rs = pStmt.executeQuery();
        // is there a row? if so next() will return true 
        if(rs.next())
        {               // error: the student class is abstract! 
           Student s =  new Undergraduate( // creating an object with the results 
                    ""+rs.getInt("id"), //  converting a string into int
                    rs.getString("name"),
                    rs.getString("course")
                    //rs.getInt("mark"),
            );
           s.setMark(rs.getInt("mark")); // 
           return s;
        }
        return null;  // if there is no match, it returns null 
    }
    public ArrayList<Student> findStudentbyName(String name)throws SQLException
    {
        ArrayList<Student> students = new ArrayList<>(); // for the found students
        PreparedStatement pStmt = connection.prepareStatement("select * from "+ table+" where name=?");
        pStmt.setString(1,name);
        ResultSet rs = pStmt.executeQuery();
        
        while(rs.next())
        {
            Student s = new Undergraduate( // new object
                    ""+rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("course")
            );
            s.setMark(rs.getInt("mark")); // setting the mark, since undergraduate has only 3 attributes
            students.add(s);
            
        }
        return students;
        
    }
    
    // Adding a student 
    public long addStudent(Student student)throws SQLException
    {
         PreparedStatement pStmt = connection.prepareStatement ("insert into " + table + "(id,name,course,mark) values (?, ?, ?, ?)");
         pStmt.setString (2, student.getName());  
         pStmt.setString (3, student.getCourse());
         pStmt.setDouble (4, student.getMark()); // this is double in the clas but int in the database, will it work?
        // pStmt.setString (5, student.getType());           // there is no type in the class#
        int rowsAdded = pStmt.executeUpdate();
        long allocatedId = 0L;
        if(rowsAdded == 1) 
        {
            // If so, get the keys added
            ResultSet rs = pStmt.getGeneratedKeys();

            // next() should return true, but check just in case
            if(rs.next()) 
            {
                // get the allocated primary key
                allocatedId = rs.getLong(1);
            }
        }

        // Add the allocated ID to the event object and return the ID
        student.setId(allocatedId);
        return allocatedId;
    }
    
}
