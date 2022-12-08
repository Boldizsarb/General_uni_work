/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hittastic;
/////////////////////////////// Boldizsar Banfia/////////////////////////////////////////
/**
 *
 * @author Pipo-Admin
 */
// changed
import com.mycompany.hittastic.Song;
import java.util.ArrayList;
public class Order_history {
      String name;
    private ArrayList<Song>order_history_list; // the order history to be printed in case 2. 
    
    public Order_history(String Name) // initiating the array list
    {
        name = Name;
        order_history_list = new ArrayList<>();
    }
    
     public void print_basket() // independent displaying method for the order history!
    {
        for (int count=0; count < order_history_list.size(); count++)
        {
            Song currentId = order_history_list.get(count);
            currentId.display(); // each song gets printed 
        }
        if(order_history_list.isEmpty()) // if there is no song was purchased it will print an apropriate massage! 
        {
             System.out.println("You did not order anything just yet!");
        }
    }
    
    public void add_basket(Song song)
    {
        order_history_list.add(song); // adding song to order history 
    }
}
