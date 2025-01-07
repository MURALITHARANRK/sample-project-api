package com.example.carbooking.service;

import com.example.carbooking.entities.RegisterEntity;
import com.example.carbooking.entities.UserEntity;

import java.util.List;

public interface AdminService {
    List<UserEntity> getAllUsers();
    List<RegisterEntity> getAllDrivers();
}
