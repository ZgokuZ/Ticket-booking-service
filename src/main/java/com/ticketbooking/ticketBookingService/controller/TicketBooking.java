package com.ticketbooking.ticketBookingService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/ticket-booking")
public interface TicketBooking {
    @GetMapping("/book")
    String bookTicket();
}
