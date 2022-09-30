public class Practical3Main
{
	public static void main(String args[])
	{
		Practical3 pobj = new Practical3();
		Thread t1 = new Thread(pobj, "Thread 1");
		t1.start();
	}
}

