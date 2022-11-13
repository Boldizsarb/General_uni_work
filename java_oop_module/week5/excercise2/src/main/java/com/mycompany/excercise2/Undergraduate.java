/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.excercise2;

public class Undergraduate extends Student{ // subclass
        
        public Undergraduate(String nameIn, String courseIn, double markIn){
            //
            super(nameIn,courseIn,markIn);
        }
        public String getGrade(){ //the subclass must modify the abstract method
            String grade = "";
            if(mark>= 70){      
            grade = "First";
            //return grade; not sure it is needed
            }
            else if(mark<= 69 && mark>= 60){
                grade= "2/1";
            }
            else if (mark<= 59 && mark>= 50){
                grade = "2/2";
            }
            else if (mark<=49 && mark>= 40){
                grade = "Third";
            }
            else{
                grade = "Fail";
            }
            //System.out.print("Grade:"+ grade);
            return grade;
        }
    }