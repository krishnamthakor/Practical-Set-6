public class Practical4Main
{
	public static void main(String args[])
	{
		Practical4 pobj1 = new Practical4();
		Practical4 pobj2 = new Practical4();
		Practical4 pobj3 = new Practical4();
		
		Thread First = new Thread(pobj1, "Thread 1");
		Thread Second = new Thread(pobj2, "Thread 2");
		Thread Third = new Thread(pobj3, "Thread 3");
		
		System.out.println("Priority of Thread 1 : " + First.getPriority());
		System.out.println("Priority of Thread 2 : " + Second.getPriority());
		System.out.println("Priority of Thread 3 : " + Third.getPriority());
		
		First.setPriority(3);
		Second.setPriority(5);
		Third.setPriority(7);
		
		System.out.println();
		
		System.out.println("Priority of Thread 1 : " + First.getPriority());
		System.out.println("Priority of Thread 2 : " + Second.getPriority());
		System.out.println("Priority of Thread 3 : " + Third.getPriority());
		
		System.out.println();
		
		First.start();
		Second.start();
		Third.start();
	}
}
