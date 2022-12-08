/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jdcb_test2;

/**
 *
 * @author donbo
 */
public  abstract class Student 
{
    protected String id, name, course;
    protected int mark;
    
    public Student(String idIn, String nameIn, String courseIn) 
    {
        id = idIn;
        name = nameIn;
        course = courseIn;
    }
    
    // ALTERED to return a boolean to indicate success,
    // rather than using a System.out.println()
    //
    // This is to remove dependency on one particular form of output
    // (console output); as a resut the method is usable in both a console
    // application and a JSP application.
    
    public boolean setMark(int newMark) 
    {
        if(newMark >= 0 && newMark <= 100) 
        {
            mark = newMark;
            return true;
        } 
        else 
        {
            return false;
        }
    }
    public void setId(long id)
    {
        this.id = ""+id;
    }
    
    public String getId() 
    {
        return id;
    }
    
    public String getName() 
    {
        return name;
    }
    
    public String getCourse() 
    {
        return course;
    }
    
    public double getMark() 
    {
        return mark;
    }

    public abstract String getGrade();
    
    // ALTERED display() to a String() method to RETURN the details as
    // a String.
    //
    // This is to remove dependency on one particular form of output
    // (console output); as a resut the method is usable in both a console
    // application and a JSP application.
    
    public String toString()
    {
       return "ID: " + id + " Name: " + name + " Course: " + course + " Grade: " + this.getGrade();
    }
    
}