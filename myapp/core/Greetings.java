package myapp.core;

import java.io.*;

public class Greetings {

    //write entry point
    public static void main (String[] args) {
        //get console
        Console cons = System.console();
        //read from input

        String name = cons.readLine("What's your name?");
        System.out.printf("Hello %s, Nice To Meet You.\n", name.toUpperCase());
    


    }
    
}
