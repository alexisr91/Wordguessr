package com.alexis.WordGuessr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.alexis.WordGuessr.service.GameService;
import com.alexis.WordGuessr.utils.GameUtils;



@Controller
public class GameController {
    
    @Autowired
    private GameService gameService;
    
    @Autowired
    private GameUtils  gameUtils;


    @GetMapping("/game-home")
    public String showGameHomePage(@RequestParam(value ="guessedChar", required = false) String guessedChar ,Model model){
        // extract query parameters, form parameters, and even files from the request.
        // required is by default true, if it's false so NULL that means guessedChar will be present in the request to avoid an exception
        String randomWord = gameService.toString();
        
        if(guessedChar != null){
            // Exception null avoided with a null checked 
            boolean isGuessCorrect = gameService.addGuess(guessedChar.charAt(0));
            randomWord = gameService.toString();

            if(isGuessCorrect == false){
                gameUtils.reduceTry();
            }
        }
        model.addAttribute("wordToDisplay", randomWord);
        // The attribute's name will be picked in the template part with Thymeleaf, the second parameter is the array that includes the random word 

        model.addAttribute("triesLeft", gameUtils.getTriesRemaining());
        // AddAttribute will be the method that will interact with the controller to the view
        return "game-home-page";
    }
    
}
