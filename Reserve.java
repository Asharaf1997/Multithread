package Asharaf;

public class Reserve
{

	public static void main(String[] args) {
		
		Reservation r= new Reservation();
		
	
		Thread t1 =new Thread(r);
		
		Thread t2 = new Thread(r);
		
		t1.setName("Frist Person");
		
		t2.setName("Second Person");
		
		t1.start();
		
		t2.start();
	}

}