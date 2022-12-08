/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hittastic;
 ////////////////////////////////////// Filippe Bastos///////////////////////////////////
/**
 *
 * @author Pipo-Admin
 */    
import com.mycompany.hittastic.User;
import java.util.ArrayList;
    
public class Users_collection
{
    
    private ArrayList<User>users;
    
    //variables of ths class
     String name;
    
    public Users_collection(String Name)
    {
            name = Name;
            users = new ArrayList<> ();
            
    }
    //finding if the username and password are in the ArrayList and returnig 2 for admin permition, 1 for normal permissions and 0 if the user is not found
    public int login_checker(String username, String password)
    {
        //using the for loop to iterate through the ArrayList
         for(int count=0; count < users.size(); count++)
        {
            //creating a temporrary 
            User currentUser = users.get(count);
            if(currentUser.Checker_username(username) == true && currentUser.Checker_password(password))
            {
                if(currentUser.getstats() == true)
                    return 2;
                return 1;
            }
        }
        return 0;
    }
    //modify name of a user by serching the user to be modifyed, verifing if exists with 
    //the user_checker function iside the class User_creation and modifing the user if the return is true
    public boolean modify_name(String new_username,String username_modify)
    {
        for(int count=0; count < users.size(); count++)
        {
            User currentUser = users.get(count);
            if(currentUser.Checker_username(username_modify) == true)
            {
                currentUser.modify_username(new_username);
                return true;
            }
        }
        return false;
    }
    
    public void add_user(User temp)
    {
        users.add(temp);
    }
 
    public void getuser_array()
    {
        for(int count=0; count < users.size(); count++)
        {
            User currentUser = users.get(count);
            System.out.println(currentUser);
        }
    }
    

}