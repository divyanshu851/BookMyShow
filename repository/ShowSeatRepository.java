package com.example.bookmyshow.repository;

import com.example.bookmyshow.models.ShowSeat;
import jakarta.persistence.LockModeType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.stereotype.Repository;

@Repository
public interface ShowSeatRepository extends JpaRepository<ShowSeat, Integer> {
    @Lock(LockModeType.PESSIMISTIC_WRITE)
    ShowSeat save(ShowSeat seat);
}
