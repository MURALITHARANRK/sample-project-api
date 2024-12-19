package com.example.carbooking.service;

import com.example.carbooking.entities.CarEntity;
import com.example.carbooking.entities.UserEntity;

public interface CarService {
    CarEntity create(CarEntity carEntity);
    CarEntity getById(Long id);
    UserEntity getById(int id);
}
