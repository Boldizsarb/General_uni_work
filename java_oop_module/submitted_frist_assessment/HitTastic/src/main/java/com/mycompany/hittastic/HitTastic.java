/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.hittastic;

import java.util.Scanner;
/////////////////////////////////// Joint Effort///////////////////////////////////////////////////////
/////////////////// Group member A -> Boldizsar Banfia, //////// Group member B -> Filippe Bastos////////////
/**
 *
 * @author Pipo-Admin
 */
public class HitTastic {

    public static void main(String[] args) {
        String username = "";
        String password = "";
        
        //this variable is responsable to keep displaing the menu
        boolean loop = true;
        //this variable is responsable to store the number of incorrect attempts  to login
        //if the number of attempts  are bigger than 5 the program will end;
        int attempts = 0;

        //inicialize the scaner
        Scanner my_scanner = new Scanner(System.in);

        //creating user and song objects
        Users_collection users = new Users_collection("all users");
        Song_collection songs = new Song_collection("all songs");
        Order_history order = new Order_history("My basket");

        //crete some users
        users.add_user(new User("Filipe", "admin", true));
        users.add_user(new User("user1", "user", false));
        users.add_user(new User("user2", "user", false));

        //crate some songs
        songs.add_song(new Song("16", "Sam the kid", 120.0));
        songs.add_song(new Song("Tu nao seabes", "Sam the kid", 10.0));
        songs.add_song(new Song("18", "Sam the kid", 190.0));
        songs.add_song(new Song("19", "Sam the kid", 109.0));

/////////////////////////////////////// Filippe Bastos //////////////////////////////////////////////
         //log in selection
        while (true) 
        {
            System.out.println("1 -Login");
            System.out.println("2 -exit");
            String Login_menu = my_scanner.nextLine();
            int Int_Login_menu = 2;
            try 
            {
                 Int_Login_menu = Integer.parseInt(Login_menu);

            } //in case the user does not type a number as an input trow this error msg
            catch (Exception e) 
            {
                System.out.println("Oops, wrong key! Try again!");
            }

            // if option 1 is selected promt the user to enter username and password
            if (Int_Login_menu == 1)
            {


                    //get the username
                    System.out.println("Username:");
                    username = my_scanner.nextLine();
                    //get the password
                    System.out.println("Password");
                    password = my_scanner.nextLine();

                    //got to User class and check the if the user exists 
                    //by lopping the users ArrayList and compare it to the input
                    //
                    int permission = users.login_checker(username, password);
                    //admin menu(permissin is equal to 2)
                    if (permission == 2) 
                    {
                        System.out.println("\nWelcome you have logged in as an admin!!");
                        //use this whille loop  to keep displaing the menu
                        loop = true;
                        while (loop == true) 
                        {
                            //inicializing variable for the second menu
                            int Int_admin_menu = 0;
                            //menu
                            System.out.println("Menu:");
                            System.out.println("    1 - Add a new song");
                            System.out.println("    2 - List of users");
                            System.out.println("    3 - Change user detail(s) by name");
                            System.out.println("    4 - Search for song(s)");
                            System.out.println("    5 - View order history");
                            System.out.println("    6 - Exit menu");
                            // olas menu modify or delete  a song

                            //scan
                            String admin_menu = my_scanner.nextLine();
                            // try to pass char to int
                            try 
                            {
                                Int_admin_menu = Integer.parseInt(admin_menu);

                            } //in case the user does not type a number as an input trow this error msg
                            catch (Exception e) 
                            {
                                System.out.println("Oops wrong key! Try it again!");
                            }
                            //switch case to evoiding use a "forest of if statments"
                            switch (Int_admin_menu) 
                            {

                                case 1:
                                    //geting the name of the song
                                    System.out.println("Enter the name of the song to create:");
                                    String new_title = my_scanner.nextLine();
                                    //geting the name of the artist
                                    System.out.println("Enter the artist of the song: ");
                                    String new_artist = my_scanner.nextLine();
                                    //geting the price of the Song
                                    System.out.println("Enter the price of the song: ");
                                    String new_price = my_scanner.nextLine();
                                    double priceDouble = Double.parseDouble(new_price);
                                    //checking if the song exists
                                    if (songs.Song_Checker(new_title, new_artist) == false) {
                                        songs.add_song(new Song(new_title, new_artist, priceDouble));
                                        System.out.println("song successfully added");
                                    } //displaying an error message in case of the song already exists
                                    else {
                                        System.out.println("This song already exists!");
                                    }
                                    //used to end the switch case
                                    break;

                                case 2:
                                    //displaying the users
                                    users.getuser_array();
                                    break;

                                case 3:
                                    //geting the name of the user to modify
                                    System.out.println("Enter the user to modify: ");
                                    String username_modify = my_scanner.nextLine();
                                    //geting the new name for the user
                                    System.out.println("Enter the new user: ");
                                    String new_username = my_scanner.nextLine();
                                    //checking if the name of the user to modify and the user to created are available
                                    if (users.modify_name(new_username, username_modify) == true) {
                                        System.out.println("Username sucessfuly modified");
                                        users.getuser_array();
                                    } //in case the user to modify is incorrect or the new name for the user alredy exists
                                    else 
                                    {
                                        System.out.println("/n Something went wrong plese verify that the user sellected is correct");
                                        users.getuser_array();
                                    }
                                    break;
                                   
////////////////////////////////////////////////// Boldizsar Banfia //////////////////////////////////////////////
                                case 4: // Search for songs and buy the phisical copy of them 
                                    System.out.println("1- Search by Title:");
                                    System.out.println("2- Search by Artist:");
                                    //scan user option
                                    
                                    String Search_menu = my_scanner.nextLine();
                                    int Int_Search_menu = 0;
                                    try 
                                    {
                                        Int_Search_menu = Integer.parseInt(Search_menu);

                                    } //in case the user does not type a number as an input trow this error msg
                                    catch (Exception e) 
                                    {
                                        System.out.println("Incorrect Input Please Try Again!");
                                    }
                                   
                                    //switch stament to avoid nested if statements

                                    switch (Int_Search_menu) 
                                    {
                                        //case user want to serch by Title
                                        case 1:
                                            System.out.println("Please insert the title of the music");
                                            String title = my_scanner.nextLine(); // reading the input 
                                            if (songs.Search_title(title) == false) // calling the search function
                                            { 
                                                System.out.println("Could not find a song with this title!");
                                                break;
                                            }

                                            System.out.println("Would you like to buy a physical copy?");
                                            System.out.println("y or n");
                                            String option = my_scanner.nextLine();
                                            if (option.equals("y")) {
                                                System.out.println("Plese enter the id of the song:");
                                                String id = my_scanner.nextLine();
                                                int Int_id = Integer.parseInt(id);
                                                if (songs.id_checker(Int_id) == true)
                                                {
                                                    System.out.println("Enter the quantity of copies you would like:");
                                                    String num_copies = my_scanner.nextLine(); // reusing variables not to cloud the project
                                                   int  Int_num_copies = Integer.parseInt(num_copies); // passing it through as parameter
                                                   Song temp_song = songs.buy_song(Int_id, Int_num_copies);
                                                    if (temp_song == null) // if there is no match for the id then appropriate massage:
                                                    {
                                                        System.out.println("No song with this id.");
                                                    } 
                                                    else {
                                                        order.add_basket(temp_song); // othervise it gets added to the order history
                                                    }
                                                    System.out.println("\n" +Int_num_copies  + " Song(s)of hard copy ordered! Total cost: " + songs.total_price(Int_num_copies, Int_id) + "\n");
                                                }else
                                                    {
                                                        System.out.println("There is no song with this id! Try again!");
                                                    }   
                                            }
                                            break;
                                        //case user sech by Artist
                                        case 2: // same as above, difference is the search by artist instead of title.
                                            System.out.println("Please input the Artist you want to search about");
                                            String artist = my_scanner.nextLine(); // keep reusing the vatiables to keep the code neat
                                            songs.Search_artist(artist);
                                            System.out.println("Do you want to buy any song(s)?");
                                            System.out.println("y or n");
                                            option = my_scanner.nextLine();
                                            if (option.equals("y")) {
                                                System.out.println("Plese enter the id of the song:");
                                                String id = my_scanner.nextLine();
                                               int Int_id = Integer.parseInt(id);
                                               if (songs.id_checker(Int_id))
                                                {
                                                    System.out.println("Enter the quantity of copies:");
                                                    String num_copies = my_scanner.nextLine();
                                                    int Int_num_copies = Integer.parseInt(num_copies);

                                                    Song temp_song = songs.buy_song(Int_id , Int_num_copies);
                                                    if (temp_song == null) 
                                                    {
                                                        System.out.println("No song with this id.");
                                                    } else 
                                                    {
                                                        order.add_basket(temp_song);
                                                    }
                                                    //songs.price(number, id);
                                                    System.out.println("\n" + Int_num_copies + " Song(s)of hard copy ordered! Total cost: " + songs.total_price(Int_num_copies, Int_id));
                                                }else
                                                   {
                                                        System.out.println("There is no song with this id! Try again!");
                                                    } 
                                            }
                                            break;
                                        default:
                                            System.out.println("Plese select an option from the menu");
                                            break;
                                    }  // by asking for the id input from the user, we by pass the problem of having the same song title
                                    // or artist! instead the unique id identyfies the exact song and to be able to find it it gets printed out
                                    // before having to input the id. 
                                    break;
                                //case user Views order history, every purchased song gets printed out with all the atributes.
                                case 5:
                                    System.out.println("Order History:");
                                    order.print_basket();
                                    break;
                                case 6:
                                    System.out.println("You will exit the menu.");
                                    loop = false;
                                    break;
                                // in case the user input a number that is not on the menu it will display this error message
                                default:
                                    System.out.println("Plese select an option from the menu");
                            }
                            // case7: modif or delete. 
                        }
                    }


                    /*

 //////////////////////////////////// Boldizsar Banfia//////////////////////////////////////////////////////
                    */
                    //if permission is == 1 it means that the user is a normal user!
                    if (permission == 1)
                    {
                        loop = true;
                        System.out.println("\nYou have loged in as a normal user:");
                        while (loop)
                        {
                            
                            System.out.println("menu:");
                            System.out.println("    1. Serch for Song(s)");
                            System.out.println("    2. View Order Histroy");
                            System.out.println("    3. Quit");

                            int Int_user_menu = 0;
                            String user_menu = my_scanner.nextLine();
                            try 
                            { // catching errors if the input is not integer then it wont throw error and cease the program! 
                                Int_user_menu = Integer.parseInt(user_menu);
                            } 
                            catch (Exception e) 
                            {
                                System.out.println("Oops wrong key! 'Try again.");
                            }
                            switch(Int_user_menu)
                            {
                                case 1: // Search for songs and buy the phisical copy of them 
                                        System.out.println("1- Search by Title:");
                                        System.out.println("2- Search by Artist:");
                                        //scan user option
                                        String Search_menu = my_scanner.nextLine();
                                        int Int_Search_menu = 0;
                                        try 
                                        {
                                            Int_Search_menu = Integer.parseInt(Search_menu);

                                        } //in case the user does not type a number as an input trow this error msg
                                        catch (Exception e) 
                                        {
                                            System.out.println("Oops Wrong key!!");
                                        }
                                        //switch stament to avoid nested if statements

                                        switch (Int_Search_menu) 
                                        {
                                            //case user want to serch by Title
                                            case 1:
                                                System.out.println("Please insert the title of the music");
                                                String title = my_scanner.nextLine(); // reading the input 
                                                if (songs.Search_title(title) == false) // calling the search function
                                                { 
                                                    System.out.println("Could not find a song with this title!");
                                                    break;
                                                }

                                                System.out.println("Would you like to buy a physical copy?");
                                                System.out.println("y or n");
                                                String option = my_scanner.nextLine();
                                                if (option.equals("y")) {
                                                    System.out.println("Plese enter the id of the song:");
                                                    String id = my_scanner.nextLine();
                                                    int Int_id = Integer.parseInt(id);
                                                    if (songs.id_checker(Int_id) == true)
                                                    {
                                                        System.out.println("Enter the quantity of copies:");
                                                        String num_copies = my_scanner.nextLine(); // reusing variables not to cloud the project
                                                       int  Int_num_copies = Integer.parseInt(num_copies); // passing it through as parameter
                                                       Song temp_song = songs.buy_song(Int_id, Int_num_copies);
                                                        if (temp_song == null) // if there is no match for the id then appropriate massage:
                                                        {
                                                            System.out.println("No song with this id.");
                                                        } 
                                                        else {
                                                            order.add_basket(temp_song); // othervise it gets added to the order history
                                                        }
                                                        System.out.println("\n" +Int_num_copies  + " Song(s)of hard copy ordered! Total cost: " + songs.total_price(Int_num_copies, Int_id) + "\n");
                                                    }else
                                                        {
                                                            System.out.println("There is no song with this id! Try again!");
                                                        } 
                                                }
                                                break;
                                            //case user sech by Artist
                                            case 2: // same as above, difference is the search by artist instead of title.
                                                System.out.println("Plese input the Artist you want to search about");
                                                String artist = my_scanner.nextLine(); // keep reusing the vatiables to keep the code neat
                                                songs.Search_artist(artist);
                                                System.out.println("Do you want to buy the song(s)?");
                                                System.out.println("y or n");
                                                option = my_scanner.nextLine();
                                                if (option.equals("y")) {
                                                    System.out.println("Plese enter the id of the song:");
                                                    String id = my_scanner.nextLine();
                                                   int Int_id = Integer.parseInt(id);
                                                   if (songs.id_checker(Int_id))
                                                    {
                                                        System.out.println("Enter the quantity of copies:");
                                                        String num_copies = my_scanner.nextLine();
                                                        int Int_num_copies = Integer.parseInt(num_copies);

                                                        Song temp_song = songs.buy_song(Int_id , Int_num_copies);
                                                        if (temp_song == null) 
                                                        {
                                                            System.out.println("No song with this id.");
                                                        } else 
                                                        {
                                                            order.add_basket(temp_song);
                                                        }
                                                        //songs.price(number, id);
                                                        System.out.println("\n" + Int_num_copies + " Song(s)of hard copy ordered! Total cost: " + songs.total_price(Int_num_copies, Int_id));
                                                    }else
                                                       {
                                                            System.out.println("There is no song with this id! Try again!");
                                                        } 
                                                }
                                                break;
                                            default:
                                                System.out.println("plese select an option from the menu");
                                                break;
                                                        
                                        }  // by asking for the id input from the user, we by pass the problem of having the same song title
                                        // or artist! instead the unique id identyfies the exact song and to be able to find it it gets printed out
                                        // before having to input the id. 
                                        break;
                                    //case user Views order history, every purchased song gets printed out with all the atributes.
                                    case 2:
                                        System.out.println("Order History:");
                                        order.print_basket();
                                        break;
                                    case 3:
                                        System.out.println("You will exit the menu.");
                                        loop = false;
                                        break;
                                    // in case the user input a number that is not on the menu it will display this error message
                                    default:
                                        System.out.println("plese select an option from the menu");
                                        break;
                            }
                            //
                    }
 ///////////////////////////////////// Filippe Bastos /////////////////////////////////////////////////////////////
                    } // basicly if permission is == 0 means that the user is not found
                    //I used an else statement becouse the only return besides 1 and 2 is 0, mening that this option can only be 0
                    else if(permission == 0)
                    {
                        //inform the user that eather the username or tha password are incorrect
                        System.out.println("The username or password are incorrect;");
                        //incresse the number of failed atempts
                        attempts++;
                        //in case of the number of atempts is 5 display error message and end program
                        if (attempts >= 5) {
                            System.out.println("Number of attempts exceeded");
                            return;
                        }
                    }
                }

                else if (Int_Login_menu == 2) 
                {
                    System.out.println("See you later :)");
                    return ;
                }
        }
    }
}
