package com.bookTicket.repository;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.bookTicket.entity.Passenger;




public interface PassengerRepository extends JpaRepository<Passenger, Serializable>{

}
