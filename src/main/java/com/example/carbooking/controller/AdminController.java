package com.example.carbooking.controller;

import com.example.carbooking.entities.CarEntity;
import com.example.carbooking.entities.RegisterEntity;
import com.example.carbooking.entities.UserEntity;
import com.example.carbooking.service.AdminServiceImpl;
import com.example.carbooking.service.CarService;
import com.example.carbooking.service.CarServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin")
public class AdminController {
    @Autowired
    private CarServiceImpl carService;
    private AdminServiceImpl adminService;

    @GetMapping("user/{user}")
    public List<RegisterEntity> getAllUsers(@PathVariable String user){
        return adminService.getAllUsers(user);
    }
    @GetMapping("driver/{driver}")
    public List<RegisterEntity> getallDrivers(@PathVariable String driver){
        return adminService.getAllUsers(driver);
    }

    @PostMapping("/create")
    public CarEntity createCar(@RequestBody CarEntity carEntity) {
        return carService.create(carEntity);
    }
}
