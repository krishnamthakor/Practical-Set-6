public class Practical1 extends Thread
{
	//ID - 21CE142
	//Name - Krishna M. Thakor
	//Aim - Write a program to create thread which display “Hello World” message.

	//A. by extending Thread class
	//B. by using Runnable interface.

	public void run()
	{
		try
		{
			System.out.println("Hello World!");
			Thread.sleep(250);
		}
		catch(Exception e)
		{
			System.out.println("Exception occured!");
		}
	}
}


