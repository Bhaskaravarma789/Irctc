package com.bookTicket.sevice;

import java.util.List;

import com.bookTicket.entity.Passenger;
import com.bookTicket.entity.Ticket;

public interface TicketService {
	
	List<Ticket> getAllTickets();
}
