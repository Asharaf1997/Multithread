package Asharaf;

public class Reservation implements Runnable
{
  int available=1;
  
  Thread t;
	@Override
	public void run() 
	
	{
		synchronized (this) 
		{
			
		
		System.out.println("Waiting for Booking="+Thread.currentThread().getName());
		
		if(available>0)
		{
			available--;
			String name=Thread.currentThread().getName();
			System.out.println("Booked= "+Thread.currentThread().getName());
		
		try 
		{
			Thread.sleep(1000);
		} catch (Exception e)
		{
			e.getStackTrace();
		}
	}
		else
		{
			System.out.println("Not Booked="+Thread.currentThread().getName());
		}
	}
}
}