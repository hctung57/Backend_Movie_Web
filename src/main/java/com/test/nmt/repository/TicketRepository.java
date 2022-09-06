package com.test.nmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.nmt.model.ticket.TicketsEntity;

@Repository
public interface TicketRepository extends JpaRepository<TicketsEntity, Long> {
}
