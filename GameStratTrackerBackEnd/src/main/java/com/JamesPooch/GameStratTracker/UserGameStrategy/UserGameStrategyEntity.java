package com.JamesPooch.GameStratTracker.UserGameStrategy;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class UserGameStrategyEntity {
    @Id
    @GeneratedValue
    @Column(name = "user_game_strategy_id")
    private Integer userGameStrategyId;

    
    
}
