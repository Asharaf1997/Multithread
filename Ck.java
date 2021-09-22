package Asharaf;


public class Ck {

	public static void main(String[] args) throws InterruptedException
	{
	System.out.println("lets start");
	
	Cake k1=new Cake();
	
	Cake k2=new Cake()
	{
		public void run()
		{
			System.out.println("Making fresh COLA Cake");
		}
	};
	
	Runnable k3=()->System.out.println("Making fresh Orange Cake");


	k1.start();
	k2.start();
	
	new Thread(k3).start();

	Thread.sleep(1000);
	System.out.println("Colse the shop");
	}

}