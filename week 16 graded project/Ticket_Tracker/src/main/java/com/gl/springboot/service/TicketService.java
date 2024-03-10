package com.gl.springboot.service;

import java.util.List;

import com.gl.springboot.entiry.Ticket;

public interface TicketService {
	
	List<Ticket> ticketsList();
	
	Ticket addTicket(Ticket ticket);
	
	Ticket updateTicketById(int slNo);
	
	void deleteTicketById(int slNo);
	
	Ticket viewTicketById(int slNo);
	
	List<Ticket> searchTicketsByTitle(String title);

}
