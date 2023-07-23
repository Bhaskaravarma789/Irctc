package com.bookTicket.repository;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.bookTicket.entity.Ticket;




public interface TicketRepository extends JpaRepository<Ticket, Serializable>{

}
