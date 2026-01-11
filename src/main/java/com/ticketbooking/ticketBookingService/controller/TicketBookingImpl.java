package com.ticketbooking.ticketBookingService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketBookingImpl implements TicketBooking {

    @Override
    public String bookTicket() {
        return "Ticket booked successfully";
    }
}
