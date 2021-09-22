package Asharaf;

import java.util.concurrent.TimeUnit;

public class TicketBooking implements Runnable
{
	int TicketAvailable=1;
	@Override
	public void run() {
		
		System.out.println("Waiting to book Ticket="+Thread.currentThread().getName());
		
		synchronized (this) {
		
		if(TicketAvailable>0)
		{
			System.out.println("Booking Ticket="+Thread.currentThread().getName());
			
			try {
				//Thread.sleep(1000);
				TimeUnit.SECONDS.sleep(2);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			TicketAvailable--;
			
			System.out.println("Your Ticket is Booked="+Thread.currentThread().getName());
			
			System.out.println("Currently Ticket available="+TicketAvailable);
		}
		else
		{
			System.out.println("Ticket Not Booked="+Thread.currentThread().getName());
		}
	  }
	}

}
