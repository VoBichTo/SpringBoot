package com.infotech.ticket;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.infotech.ticket.entities.Ticket;
import com.infotech.ticket.service.TicketService;

@SpringBootApplication
public class TicketBookManagementAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication
				.run(TicketBookManagementAppApplication.class, args);
		
		TicketService ticketService = applicationContext.getBean("ticketService", TicketService.class);
		Ticket ticket = new Ticket();
		ticket.setPassengerName("Peter");
		ticket.setBookingDate(new Date());
		ticket.setSourceStation("VIP");
		ticket.setDesStation("P13");
		ticket.setEmail("pet@gmail.com");
		
		ticketService.createTicket(ticket);
	}

}
