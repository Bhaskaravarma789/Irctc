package com.bookTicket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookTicket.entity.Passenger;
import com.bookTicket.entity.Ticket;
import com.bookTicket.sevice.TicketService;

@RestController
@RequestMapping("/irctc")
public class TicketController {
	
	@Autowired
	private TicketService ticketService;
	
	@GetMapping("/getAllTickets")
	public ResponseEntity<List<Ticket>> getAllTickets(){
		List<Ticket> allTickets = ticketService.getAllTickets();
		return new ResponseEntity<> (allTickets, HttpStatus.OK);
	}



}
