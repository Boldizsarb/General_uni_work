/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hittastic;
///////////////////////////////////////// Filippe Bastos/////////////////////////////////////////////////
/**
 *
 * @author Pipo-Admin
 */
public class User {
    //variables
    String password, username;
    boolean stats;
    
     //username and password, the bool is used to verrify if the user is admin or not(True for admin and False to normal rights)
    public User(String Username,String Password,Boolean Stats)
    {
        this.username = Username;
        this.password = Password;
        this.stats = Stats;
    }
   
    //check if the user is valid comparing the input to the present username, returning true if the user match
    public boolean Checker_username(String in_username)
    {
        if(in_username.equals(this.username))
            return(true);
        else
            return(false);
    }
    public boolean Checker_password(String in_password)
    {
        if(in_password.equals(this.password))
            return(true);
        else
            return(false);
    }
    
    //change username of a user
    public void modify_username(String in_username)
    {
        this.username = in_username;
    }
    //print the username and password
    @Override
    public String toString()
    {
  
        return ("username: " + this.username +" password: " + this.password);
    }
    
    //get the status of the acount (true is admin and false is standard)
    public boolean getstats()
    {
        return(this.stats);
    }
    public String getPassword()
    {
        return(this.password);
    }
    public String getUsername()
    {
        return(this.username);
    }
}
