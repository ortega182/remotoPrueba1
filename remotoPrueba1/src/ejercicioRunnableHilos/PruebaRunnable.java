package ejercicioRunnableHilos;

public class PruebaRunnable implements Runnable 
{
	
	int tiempoDormido;
	
	
	public PruebaRunnable(int tiempoDormido) 
	{
		this.tiempoDormido = tiempoDormido;
	}


	@Override
	public void run() 
	{
		try {
			Thread.sleep(tiempoDormido);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+ ": Acabo");
	}

}
