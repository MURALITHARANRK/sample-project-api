package com.example.carbooking.service;

import com.example.carbooking.entities.RegisterEntity;
import com.example.carbooking.entities.UserEntity;
import com.example.carbooking.repository.CarRepository;
import com.example.carbooking.repository.RegisterRepository;
import com.example.carbooking.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AdminServiceImpl implements AdminService{
    @Autowired
    private CarRepository carRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RegisterRepository registerRepository;

    @Override
    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }
    @Override
    public List<RegisterEntity> getAllDrivers(){
        return registerRepository.findByUsertype("driver");
    }
}
