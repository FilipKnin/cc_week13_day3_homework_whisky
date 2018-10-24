package com.codeclan.example.WhiskyTracker.controllers;

import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository.WhiskyRepository;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/whiskies")
public class WhiskyController {

    @Autowired
    WhiskyRepository whiskyRepository;


    @GetMapping(value = "/year/{year}")
    public List<Whisky> findAllWhiskiesForParticularYear(@PathVariable int year) {
        return whiskyRepository.findAllWhiskiesForParticularYear(year);
    }

    @GetMapping(value = "/region/{region}")
    public List <Whisky> getWhiskiesFromRegion(@PathVariable String region) {
        return whiskyRepository.getWhiskiesFromRegion(region);
    }

    @GetMapping(value = "/ng/{distilleryName}/{age}")
    public List <Whisky> getByDistilleryAndAge(@PathVariable String distilleryName, @PathVariable int age) {
        return whiskyRepository.getByDistilleryAndAge(distilleryName, age);
    }



}
