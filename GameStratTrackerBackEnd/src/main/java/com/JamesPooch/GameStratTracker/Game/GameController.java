package com.JamesPooch.GameStratTracker.Game;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.JamesPooch.GameStratTracker.User.UserRepository;

import jakarta.validation.Valid;


@RestController
public class GameController {
    
    private GameRepository gameRepository;

    GameController(GameRepository gameRepository, UserRepository userRepository){
        this.gameRepository = gameRepository;
    }

    @GetMapping("/games")
    public List<Game> getAllGames(){
        return gameRepository.findAll();
    }

    @PostMapping("/game")
    public void createGame(@Valid @RequestBody Game game){
        gameRepository.save(game);
    }
}
