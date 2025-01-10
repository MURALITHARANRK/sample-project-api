package com.example.carbooking.service;

import com.example.carbooking.entities.BookingEntity;
import com.example.carbooking.entities.RegisterEntity;
import com.example.carbooking.entities.UserEntity;
import com.example.carbooking.exception.ConflictException;
import com.example.carbooking.repository.BookingRepository;
import com.example.carbooking.repository.CarRepository;
import com.example.carbooking.repository.RegisterRepository;
import com.example.carbooking.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminServiceImpl implements AdminService{
    @Autowired
    private CarRepository carRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RegisterRepository registerRepository;
    @Autowired
    private BookingRepository bookingRepository;

    @Override
    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }
    @Override
    public List<RegisterEntity> getAllDrivers(){
        return registerRepository.findByUsertype("driver");
    }
    @Override
    public List<BookingEntity>getAllBooking(){
        return bookingRepository.findAll();
    }
    @Override
    public List<BookingEntity> getBookingsForUser(int userId) {
        List<BookingEntity> bookings = bookingRepository.findByUserid(userId);
        if (bookings.isEmpty()) {
            throw new ConflictException("No bookings found for the specified user.");
        }
        return bookings;
    }


}
