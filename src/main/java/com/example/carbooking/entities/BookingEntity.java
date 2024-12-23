package com.example.carbooking.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Booking")
public class BookingEntity {
@Id
    private int bookingid;
    private Long carid;
    private int userid;
    private String starttime;
    private String endtime;
    private String source;
    private String destination;

    public String getLongitude() {
        return source;
    }

    public void setLongitude(String longitude) {
        this.source = source;
    }

    public String getLatitude() {
        return destination;
    }

    public void setLatitude(String latitude) {
        this.destination = destination;
    }

    public int getBookingid() {
        return bookingid;
    }

    public void setBookingid(int bookingid) {
        this.bookingid = bookingid;
    }

    public Long getCarid() {
        return carid;
    }

    public void setCarid(Long carid) {
        this.carid = carid;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }
}
