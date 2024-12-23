package com.example.carbooking.service;

import com.example.carbooking.entities.RegisterEntity;

import java.util.List;

public interface AdminService {
    List<RegisterEntity> getAllUsers(String Users);
    List<RegisterEntity> getAllDrivers(String Driver);
}