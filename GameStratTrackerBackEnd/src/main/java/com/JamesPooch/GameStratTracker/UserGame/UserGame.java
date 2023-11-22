package com.JamesPooch.GameStratTracker.UserGame;

import java.util.List;

import com.JamesPooch.GameStratTracker.Game.Game;
import com.JamesPooch.GameStratTracker.UserGameStrategy.UserGameStrategyEntity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;


@Entity
public class UserGame {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_game_id")
    private Integer userGameId;

    @JoinColumn(referencedColumnName = "user_game_id")
    @OneToMany(cascade = CascadeType.ALL)
    private List<Game> game;

    @JoinColumn(referencedColumnName = "user_game_id")
    @OneToMany(cascade = CascadeType.ALL)
    private List<UserGameStrategyEntity> userGameStrategies;

    public List<Game> getGame() {
        return game;
    }

    public void setGame(List<Game> game) {
        this.game = game;
    }

    public Integer getUserGameId() {
        return userGameId;
    }
    
    
    
}
