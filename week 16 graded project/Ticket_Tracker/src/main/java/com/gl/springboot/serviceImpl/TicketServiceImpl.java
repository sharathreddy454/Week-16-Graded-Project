package com.gl.springboot.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.springboot.entiry.Ticket;
import com.gl.springboot.repository.TicketRepository;
import com.gl.springboot.service.TicketService;

@Service
public class TicketServiceImpl implements TicketService{
	
	@Autowired
	TicketRepository ticketRepository;

	@Override
	public List<Ticket> ticketsList() {
		List<Ticket> listOfTickets = (List<Ticket>) ticketRepository.findAll();
		
		return listOfTickets;
	}

	@Override
	public Ticket addTicket(Ticket ticket) {
		
		return ticketRepository.save(ticket);
	}

	@Override
	public Ticket updateTicketById(int slNo) {
		
		Optional<Ticket> optional = ticketRepository.findById(slNo);
		Ticket ticket = null;
		if(optional.isPresent()) {
			ticket = optional.get();
		}else {
			throw new RuntimeException("Ticket not found for id : " + slNo);
		}
		
		return ticket;
	}

	@Override
	public void deleteTicketById(int slNo) {
		
		ticketRepository.deleteById(slNo);
	}

	@Override
	public Ticket viewTicketById(int slNo) {
		Optional<Ticket> optional = ticketRepository.findById(slNo);
		Ticket ticket = optional.get();
		return ticket;
	}
	
	@Override
	public List<Ticket> searchTicketsByTitle(String title) {
	    return ticketRepository.findByTicketTitleContainingIgnoreCase(title);
	}

	
}
