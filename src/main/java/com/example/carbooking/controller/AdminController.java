package com.example.carbooking.controller;

import com.example.carbooking.entities.CarEntity;
import com.example.carbooking.entities.RegisterEntity;
import com.example.carbooking.entities.UserEntity;
import com.example.carbooking.service.AdminServiceImpl;
import com.example.carbooking.service.CarService;
import com.example.carbooking.service.CarServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin")
public class AdminController {
    @Autowired
    private CarServiceImpl carService;
    @Autowired
    private AdminServiceImpl adminService;

    @GetMapping("/users")
    public ResponseEntity<List<RegisterEntity>> getAllUsers() {
        List<RegisterEntity> users = adminService.getAllUsers();
        return ResponseEntity.ok(users); // Return the list of users in the response
    }
    @GetMapping("/driver")
    public ResponseEntity<List<RegisterEntity>> getAllDrivers() {
        List<RegisterEntity> users = adminService.getAllDrivers();
        return ResponseEntity.ok(users);
    }

    @PostMapping("/create")
    public CarEntity createCar(@RequestBody CarEntity carEntity) {
        return carService.create(carEntity);
    }
}
