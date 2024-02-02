package com.example.bookmyshow.service;

import com.example.bookmyshow.models.ShowSeat;
import com.example.bookmyshow.models.Ticket;
import com.example.bookmyshow.models.User;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface TicketService {
    @Transactional(isolation = Isolation.SERIALIZABLE)
    Ticket bookTicket(List<Integer> showSeatIds, int userId);
}
