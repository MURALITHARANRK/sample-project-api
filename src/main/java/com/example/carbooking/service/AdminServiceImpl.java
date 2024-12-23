package com.example.carbooking.service;

import com.example.carbooking.entities.RegisterEntity;
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
    public List<RegisterEntity> getAllUsers(String Users) {
        return registerRepository.findByUsertype("user");
    }
    @Override
    public List<RegisterEntity> getAllDrivers(String Driver){
        return registerRepository.findByUsertype("driver");
    }
}
