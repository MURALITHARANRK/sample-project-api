package com.example.carbooking.repository;

import com.example.carbooking.entities.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.Optional;


public interface CarRepository extends JpaRepository<CarEntity, Long> {
    Optional<CarEntity> findByRegistrationNumber(String registrationNumber);
}

