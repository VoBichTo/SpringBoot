package com.infotech.ticket.booking;

import org.springframework.data.repository.CrudRepository;
import com.infotech.ticket.entities.Ticket;

public interface TicketBooking extends CrudRepository<Ticket, Integer> {
}
