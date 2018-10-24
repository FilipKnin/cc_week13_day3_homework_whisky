package com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;

import com.codeclan.example.WhiskyTracker.models.Whisky;

import java.util.List;

public interface WhiskyRepositoryCustom {
    List<Whisky> findAllWhiskiesForParticularYear(int year);
    List <Whisky> getWhiskiesFromRegion(String region);
    List<Whisky> getByDistilleryAndAge(String distilleryName, int age);
}
