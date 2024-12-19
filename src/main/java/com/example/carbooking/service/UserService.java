package com.example.carbooking.service;

import com.example.carbooking.entities.UserEntity;

public interface UserService {
    UserEntity create(UserEntity userEntity);
    UserEntity getById(int id);
    boolean updateCarAvailability(Long carid, String endTime);
}
