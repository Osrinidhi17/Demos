package com.ticketbookingapp;

public class TicketBookingTest {

	public static void main(String[] args) {
		MovieTicketBookingService target= new MovieTicketBookingService();
		Thread thread1=new Thread(target);
		Thread thread2=new Thread(target);
	    thread1.setName("srinidhi");
	    thread2.setName("bhargava");
	    thread1.start();
	    thread2.start();

	}
}
