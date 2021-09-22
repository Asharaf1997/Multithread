package Asharaf;

public class Ticket {

	public static void main(String[] args) throws InterruptedException
	{
		TicketBooking tb = new TicketBooking();
		
		Thread t1 = new Thread(tb,"Asharaf Shaikh");
		Thread t2 = new Thread(tb,"Sharad Saraf");
		
	//	Runnable r1 = ()->System.out.println("Kalyan Dethe");//Lambda Expression
			
		t1.start();
		t2.start();

	//	new Thread(r1).start();
		
	//	Thread.sleep(1000);
		
	//	System.out.println("Booking Stop");
	}

}
