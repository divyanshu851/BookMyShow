package com.example.bookmyshow.service;

import com.example.bookmyshow.models.ShowSeat;
import com.example.bookmyshow.models.Ticket;
import com.example.bookmyshow.models.User;
import com.example.bookmyshow.models.constant.ShowSeatStatus;
import com.example.bookmyshow.repository.ShowSeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TicketServiceImpl implements TicketService{

    @Autowired
    private ShowSeatRepository showSeatRepository;
    @Override
    @Transactional(isolation = Isolation.SERIALIZABLE)
    public Ticket bookTicket(List<Integer> showSeatIds, int userId) {
        //locked the seat
        for(Integer showSeatId : showSeatIds){
            ShowSeat seat = showSeatRepository.findById(showSeatId).get();
           seat.setShowSeatStatus(ShowSeatStatus.LOCKED);
           showSeatRepository.save(seat);

        }

        return new Ticket();
    }

    public List<Ticket> getAllTicket(){
        return null; 
    }
}
