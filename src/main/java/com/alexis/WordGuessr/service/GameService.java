package com.alexis.WordGuessr.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Create the object of GameService and store the object inside container ( Application context )
 * Scope is the lifecycle of an instance
 * The scope prototype creates a new bean instance each time when requested
 */
@Service
@Scope("prototype")
public class GameService {

    @Autowired
    //Container
    ConfigurableApplicationContext applicationContext;

    private String randomlyChoosenWord= null;
    Random random = new Random();
    
    private String[] randomWords = {"father", "mother", "sister", "goodbye", "software", "framework", "java", "javascript", "kotlin", "test","junit","kafta","database","grocery"};
    private char[] allCharactersOfTheWord;


    public GameService(){

        randomlyChoosenWord = randomWords[random.nextInt(randomWords.length)];
        System.out.println("randomlyChoosenWord is : " + randomlyChoosenWord);
        allCharactersOfTheWord = new char[randomlyChoosenWord.length()];
    }

    @Override
    public String toString(){
        // Return String 
        String ret = "";

        for(char c:allCharactersOfTheWord){
            if(c == '\u0000'){
                // In unicode \u0000 means null
                // So if null we are returning a blank
                ret = ret + "_";
            }
            else{
                ret = ret + c;
            }
            ret = ret + " ";
            // we return an underscore but also a blank to make space in-between the underscore 
        }

        return ret;
    }

    public boolean addGuess(char guessedChar){


        boolean isGuessCorrect = false;
        // Check if the guessed character does exist if the randonmlyChoosenWord()
        // LINEAR SEARCH choosen to iterate 
        for(int i = 0; i< randomlyChoosenWord.length() ;i++){

            if(guessedChar == randomlyChoosenWord.charAt(i)){

                allCharactersOfTheWord[i] = guessedChar;
                isGuessCorrect = true;
            }
        }
        return isGuessCorrect;
    }
}
