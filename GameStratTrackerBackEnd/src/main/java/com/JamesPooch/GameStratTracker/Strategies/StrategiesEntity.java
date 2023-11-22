package com.JamesPooch.GameStratTracker.Strategies;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class StrategiesEntity {
    
    @Id
    @GeneratedValue
    @Column(name = "strategies_id")
    private Integer strategiesId;
    private String strategyName;
    private String strategyDescription;
    private Integer wins;
    private Integer loses;

    

    public String getStrategyName() {
        return strategyName;
    }
    public void setStrategyName(String strategyName) {
        this.strategyName = strategyName;
    }
    public String getStrategyDescription() {
        return strategyDescription;
    }
    public void setStrategyDescription(String strategyDescription) {
        this.strategyDescription = strategyDescription;
    }
    public Integer getWins() {
        return wins;
    }
    public void setWins(Integer wins) {
        this.wins = wins;
    }
    public Integer getLoses() {
        return loses;
    }
    public void setLoses(Integer loses) {
        this.loses = loses;
    }
    public Integer getStrategiesId() {
        return strategiesId;
    }

    
}
