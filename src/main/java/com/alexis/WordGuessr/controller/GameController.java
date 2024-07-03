package com.alexis.WordGuessr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.alexis.WordGuessr.service.GameService;



@Controller
public class GameController {
    
    @Autowired
    GameService gameService;
    
    
    @GetMapping("/game-home")
    public String showGameHomePage(Model model){

        String randomWord = gameService.toString();
        model.addAttribute("wordToDisplay", randomWord);
        // The attribute's name will be picked in the template part with Thymeleaf, the second parameter is the array that includes the random word 
        return "game-home-page";
    }
    
}
