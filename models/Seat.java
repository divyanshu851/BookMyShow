package com.example.bookmyshow.models;

import com.example.bookmyshow.models.constant.BaseModel;
import com.example.bookmyshow.models.constant.SeatType;
import com.example.bookmyshow.models.constant.Status;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Seat extends BaseModel {
    private String seatNumber;
    @Enumerated(EnumType.STRING)
    private SeatType seatType;
    @Enumerated(EnumType.STRING)
    private Status status;
}
