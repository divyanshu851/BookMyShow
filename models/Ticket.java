package com.example.bookmyshow.models;

import com.example.bookmyshow.models.constant.BaseModel;
import com.example.bookmyshow.models.constant.TicketStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
public class Ticket extends BaseModel {
    private LocalDateTime localDateTime;
    private double totalAmount;

    @ManyToMany
    private List<ShowSeat> showSeats;
    @ManyToOne
    private Show show;
    @Enumerated(EnumType.STRING)
    private TicketStatus ticketStatus;

}
