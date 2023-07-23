package com.bookTicket.sevice.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookTicket.entity.Passenger;
import com.bookTicket.entity.Ticket;
import com.bookTicket.repository.PassengerRepository;
import com.bookTicket.repository.TicketRepository;
import com.bookTicket.sevice.TicketService;

@Service
public class TicketServiceImpl implements TicketService {
	
	@Autowired
	private TicketRepository ticketRepository;
	
	@Autowired
	private PassengerRepository passengerRepository;
	
	private Map<String, Ticket> ticketsMap = new HashMap<String, Ticket>();

	@Override
	public List<Ticket> getAllTickets() {
		
		return ticketRepository.findAll();
	}


	
	
}
