package com.mandarin.petching.service;

import com.mandarin.petching.domain.Reservation;
import com.mandarin.petching.repository.ReservationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReservationService {

    private final ReservationRepository reservationRepository;

    public void createReservation(Reservation reservation) {
        reservationRepository.save(reservation);
    }

    public Reservation findReservationById(Long reservationId) {
        return reservationRepository.findById(reservationId).get();
    }
}
