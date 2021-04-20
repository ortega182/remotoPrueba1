package ejercicioRunnableHilos;

public class LanzadorHilos {

	public static void main(String[] args) 
	{
		int numeroHilosRunnables=5;
		PruebaRunnable[] arrayRunnables=new PruebaRunnable[numeroHilosRunnables];
		Thread[] arrayHilos=new Thread[numeroHilosRunnables];
		
		for(int i=0;i<arrayRunnables.length;i++) 
		{
			arrayRunnables[i]=new PruebaRunnable(100*(i+1));
			arrayHilos[i]=new Thread(arrayRunnables[i]);
			arrayHilos[i].start();
		}
		
		for(int i=0;i<arrayRunnables.length;i++) 
		{
			try {
				arrayHilos[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println(Thread.currentThread().getName()+ ": Acabo");
	}

}
