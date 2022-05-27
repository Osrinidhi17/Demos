package com.ticketbookingapp;

/**
 * Movie Ticket Booking available ticket is 1
   book tickek we have 2
   ppl booking the ticket (2 ppl ill also send request) 
   movie ticket shld be thread
 * @author srinidhi.obili
 */
public class MovieTicketBookingService implements Runnable{
	
	private int availableTicket=1;
	
	public void run() {
		String name=Thread.currentThread().getName();
		bookTicket(name);
	}
	
  public void bookTicket(String name) {
		System.out.println("Booking availability check by: "+name);
		if(availableTicket>=1) {
			System.out.println("Booking started for:"+name);
			synchronized (this) { 
			availableTicket-=1;
			}
			System.out.println("Booking completed for:"+name);
		}else {
			System.out.println("Ticket is not available for:"+ name);
				
			}
		}
		
	}


