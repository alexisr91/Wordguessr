package com.alexis.WordGuessr.service;

import java.util.Random;
import org.springframework.stereotype.Service;

/**
 * Create the object of GameService and store the object inside container ( Application context )
 */
@Service
public class GameService {
    
    private String[] randomWords = {"father", "mother", "sister", "goodbye", "software", "framework"};

    Random random = new Random();

    @Override
    public String toString(){
        return randomWords[random.nextInt(randomWords.length)];
    }
}
