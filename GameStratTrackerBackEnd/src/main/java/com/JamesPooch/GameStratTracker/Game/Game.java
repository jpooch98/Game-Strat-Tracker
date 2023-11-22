package com.JamesPooch.GameStratTracker.Game;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;


@Entity
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "game_id")
    private Integer gameId;
    @Size(min=2, max = 100, message = "Game name must be between 2 and 100 characters")
    @Column(name = "game_name")
    private String gameName;
    @Column(name = "game_description")
    private String gameDescription;

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getGameDescription() {
        return gameDescription;
    }

    public void setGameDescription(String gameDescription) {
        this.gameDescription = gameDescription;
    }

    public Integer getGameId() {
        return gameId;
    }

    
}
