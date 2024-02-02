package com.example.bookmyshow.controller;

import com.example.bookmyshow.dto.BookTicketRequestDTO;
import com.example.bookmyshow.dto.TicketResponseDTO;
import com.example.bookmyshow.models.Ticket;
import com.example.bookmyshow.service.TicketService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
public class TicketController {
    private TicketService ticketService;

    @PostMapping("/ticket")
    public ResponseEntity createTicket(@RequestBody BookTicketRequestDTO bookTicketRequestDTO){
//        Ticket ticket = ticketService.bookTicket(bookTicketRequestDTO.getShowSeatIds(), bookTicketRequestDTO.getUserId());
        TicketResponseDTO ticket = new TicketResponseDTO();
        ticket.setAuditoriumName("AUDI 01");
        ticket.setMovieName("SUPER COMMANDO DHRUV");
        ticket.setTotalAmount(400);
        ticket.setTimeOfShow(LocalDateTime.now());
        ticket.setSeatNumbers(List.of("A01", "A02"));
        return ResponseEntity.ok(ticket);
    }
}
