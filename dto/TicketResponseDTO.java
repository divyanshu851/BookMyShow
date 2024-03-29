package com.example.bookmyshow.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;


@Getter
@Setter
public class TicketResponseDTO {
    private double totalAmount;
    private LocalDateTime timeOfShow;
    private List<String> seatNumbers;
    private String movieName;
    private String auditoriumName;
}
