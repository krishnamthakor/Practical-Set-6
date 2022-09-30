public class Practical1Implements implements Runnable
{
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

