package com.infotech.ticket.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infotech.ticket.booking.TicketBooking;
import com.infotech.ticket.entities.Ticket;

@Service
public class TicketService {
	@Autowired
	private TicketBooking ticketBook;
	public Ticket createTicket(Ticket ticket) {
		// TODO Auto-generated method stub
		return ticketBook.save(ticket);
	}

	public Ticket getTicketById(Integer ticketId) {
		// TODO Auto-generated method stub
		return ticketBook.findOne(ticketId);
	}

	public Iterable<Ticket> getAllBookTickets() {
		// TODO Auto-generated method stub
		return ticketBook.findAll();
	}

	public void deleTicket(Integer ticketId) {
		// TODO Auto-generated method stub
		ticketBook.delete(ticketId);
	}
}
