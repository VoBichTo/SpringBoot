package com.infotech.ticket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infotech.ticket.entities.Ticket;
import com.infotech.ticket.service.TicketService;

@RestController
@RequestMapping(value = "/api/tickets")
public class TicketController {
	@Autowired
	private TicketService ticketService;

	@PostMapping(value = "/create")
	public Ticket createTicket(@RequestBody Ticket ticket) {
		return ticketService.createTicket(ticket);
	}

	@GetMapping(value = "/ticket/{ticketId}")
	public Ticket getTicketById(@PathVariable("ticketId") Integer ticketId) {
		return ticketService.getTicketById(ticketId);
	}
	@GetMapping(value= "/ticket/alltickets")
	public Iterable<Ticket> getAllBookTickets(){
		return ticketService.getAllBookTickets();
	}
	@DeleteMapping(value="/ticket/{ticketId}")
	public void deleTicket(@PathVariable("ticketId") Integer ticketId){
		ticketService.deleTicket(ticketId);
	}
}
