package com.JamesPooch.GameStratTracker.Strategies;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class StrategiesController {


    private StrategiesRepository repository;

    StrategiesController(StrategiesRepository repository){
        this.repository = repository;
    }

    @GetMapping("/strategies/{id}")
    public StrategiesEntity getStrategy(@PathVariable Integer id){
        return repository.findById(id).get();
    }

    @GetMapping("/strategies")
    public List<StrategiesEntity> getAllStrategies(){
        return repository.findAll();
    }

    @PostMapping("/strategy")
    public void createStrategy(@RequestBody StrategiesEntity strat){
        repository.save(strat);
    }


}
