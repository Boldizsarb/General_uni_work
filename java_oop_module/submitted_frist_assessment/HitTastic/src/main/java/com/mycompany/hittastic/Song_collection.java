/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hittastic;
////////////////////////////////////// Banfia Boldizsar////////////////////////////////////////////
/**
 *
 * @author Pipo-Admin
 */
import com.mycompany.hittastic.Song;
import java.util.ArrayList;

public class Song_collection {

    private ArrayList<Song> songs; // the main song list

    String name;

    public Song_collection(String Name) {
        name = Name;
        songs = new ArrayList<>();
    }

    //adding song to the array list
    public void add_song(Song temp) {
        songs.add(temp);
    }
  

    public boolean Search_title(String title) // case 1, searching by title
    {                  // requiring the name of the song and passing it through as parameter
        ArrayList<Song> found_songs = new ArrayList<>();// ArrayList for the found songs
        for (int count = 0; count < songs.size(); count++) {
            Song currentSong = songs.get(count);

            if (title.equals(currentSong.getName())) // checking the matched titles in the list
            {
                found_songs.add(currentSong); // the temporary array list will be populated with the results 
                currentSong.display(); // and displayed
            }

        } // returning true if there is one or more song founded
        if (found_songs.size() == 0) {
            return (false);
        }
        return (true);
    }

    public boolean id_checker(int id) { // chechking if the user input id exist or not! if not in the main there will be an apppropriate massage and stops the code! 
        for (int count = 0; count < songs.size(); count++) {
            Song currentSong = songs.get(count);
            if (id == currentSong.getId()) {
                return true;
            }
        }
        return false;
    }
    //same thing for the Artists

    public boolean Search_artist(String Artist) {   // Identical aproach like the one above
        ArrayList<Song> found_songs = new ArrayList<>(); // temp array list
        for (int count = 0; count < songs.size(); count++) {
            Song currentArtist = songs.get(count);

            if (Artist.equals(currentArtist.getArtist())) {
                found_songs.add(currentArtist);
                currentArtist.display();
            }  // it is going to be displayed for the user to see tha id number too for the purchasing purposes
        }
        if (found_songs.size() == 0) {
            return (false);
        }
        return (true);
    }

    public Song buy_song(int id, int number_records) { // two parameter being read, id to indentify the music and nubmer for increasing the number of purchased songs or physical copy
        for (int count = 0; count < songs.size(); count++) {
            Song currentId = songs.get(count);
            if (id == currentId.getId()) {  // if the id mathces, the purchased song atribute will be increased with the input number
                currentId.incrementrecords(number_records);
                currentId.toString();
                return currentId;
            }
        }
        return (null); // if the id doesnt match, it wont return anything

    }

    public double total_price(Integer number, Integer id) // calculating the total cost of the hard copy per transaction 
    {
        double totalcost = 0;
        double cost = 0;

        for (int count = 0; count < songs.size(); count++) {
            Song currentId = songs.get(count);
            if (id == currentId.getId()) {  // if the id mathces, the purchased song atribute will be increased with the input number
                cost += currentId.getPrice();
                totalcost = number * cost;
            }
        }
        return (totalcost);
    }
////////////////////////////////////////////////// Filippe Bastos///////////////////////////////////////////////////////
    //using the same logic as in the Checker funcrtion in the class User
    public boolean Song_Checker(String song, String artist) {
        for (int count = 0; count < songs.size(); count++) {
            Song currentSong = songs.get(count);
            //returning the result of the function SongChecker
            return (currentSong.addSong_Checker(song, artist));
        }
        return false;
    }
}

//////////////////////////////// Olah////////////////////////




// delete or modify? ---> if satement or case statement 


// please enter the id of the chosen song
// print song this is the song you have thought of
// whaet do you want to delete/modify
// title/name...... artist...... price...... 
// song has been modified/deleted.




// print out all the songs that was ever purcshassed by whom