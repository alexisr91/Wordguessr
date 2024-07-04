package com.alexis.WordGuessr.service;

import java.util.Random;
import org.springframework.stereotype.Service;

/**
 * Create the object of GameService and store the object inside container ( Application context )
 */
@Service
public class GameService {

    private String randomlyChoosenWord= null;
    Random random = new Random();
    
    private String[] randomWords = {"father", "mother", "sister", "goodbye", "software", "framework"};

    private char[] allCharactersOfTheWord;


    public GameService(){

        randomlyChoosenWord = randomWords[random.nextInt(randomWords.length)];
        System.out.println("randomlyChoosenWord is : " + randomlyChoosenWord);
        allCharactersOfTheWord = new char[randomlyChoosenWord.length()];
    }

    @Override
    public String toString(){

        String ret = "";

        for(char c:allCharactersOfTheWord){
            if(c == '\u0000'){
                // In unicode \u0000 means null
                ret = ret + " _";
            }

            ret = ret + " ";
            // we return an underscore but also a blank to make space in-between the underscore 
        }

        return ret;
    }
}
