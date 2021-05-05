package com.tasolution.tasquare.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tasolution.tasquare.model.entity.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Integer>  {

}
