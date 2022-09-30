public class Practical4 extends Thread
{
	//ID - 21CE142
	//Name - Krishna M. Thakor
	//Aim -Write a program to create three threads ‘FIRST’, ‘SECOND’, ‘THIRD’. Set the priority of the ‘FIRST’ thread to 3, the ‘SECOND’ thread to 5(default) and the ‘THIRD’ thread to 7. 
	
	public void run()
	{
		System.out.println("run() called by " + Thread.currentThread() );
	}
}

