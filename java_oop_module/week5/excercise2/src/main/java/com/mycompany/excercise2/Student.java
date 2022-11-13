/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.excercise2;

/**
 *
 * @author donbo
 */
public abstract class Student{
        protected String name;
        protected String course;
        protected Double mark;
       
        
        public Student(String nameIn, String courseIn, Double markIn){
            this.name = nameIn;
            this.course = courseIn;
            this.mark = markIn;
       
        }
        public abstract String getGrade(); //abstract method with no code 
         // has to be string since it returns someting 
        
        // every set method comes here othervise the mark variable is not known
        public Boolean didPass(){
            boolean pass = false;
            if(mark<40){
                pass = false;
                System.out.print("Passed:"+ pass);
            } else{
                pass = true;
                System.out.print("Passed:"+ pass);
            }
            return pass;
        }
        public Boolean setMark(Double mark){ // passing through a variable to be reusable in jsp
            if(mark > 100 || mark < 0){
                 //System.out.print("Rejected!Error!");
                 //String temp= ("Rejected!Error!");
                 return false;
                 
            }
            return true;
        }
        // printing fucntion 
        public String toString(){ // 
            
            
            return("Name:" +this.name+ "Course:" +this.course+  "Mark:"+this.mark +" "+ getGrade());
        }
        
    }