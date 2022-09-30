public class Practical3 extends Thread
{
	//ID - 21CE142
	//Name - Krishna M. Thakor
	//Aim - Write a program to increment the value of one variable by one and display it after one second using thread using sleep() method.

	private int Count;

	public int getCount() {
		return Count;
	}

	public void setCount(int count) {
		Count = count;
	}
	
	public void Practical3()
	{
		Count=0;
	}
	
	public void run()
	{
		try
		{
			for(int i=0;i<2;i++)
			{
				System.out.println("The value of Counter : " + (++Count));
				Thread.sleep(1000);
			}
			
			System.out.println("\nID:21CE142 \nName : Krsihna M. Thakor");
			
		}
		catch(Exception e)
		{
			System.out.println("Exception occured!");
		}
	}
}

