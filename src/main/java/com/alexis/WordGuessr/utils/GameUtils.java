package com.alexis.WordGuessr.utils;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

import com.alexis.WordGuessr.service.GameService;

@Component
public class GameUtils {
    
    // Number of tries 
    private int MAX_TRIES = 3;
    @Autowired
    //Container
    ConfigurableApplicationContext applicationContext;

    public int reduceTry(){

        MAX_TRIES = MAX_TRIES - 1;
        return MAX_TRIES;
    }

    public void resetTries(){

        MAX_TRIES = 5;
    }

    public int getTriesRemaining(){

        return MAX_TRIES;
    }


    public GameService reload(){

        GameService gameService = applicationContext.getBean(GameService.class);

        return gameService;
    }
}
