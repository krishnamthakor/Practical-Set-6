import java.util.Random;
//odd thread
class Odd extends Thread
{
	//ID - 21CE142
	//Name - Krishna M. Thakor
	//Aim - Generate 15 random numbers from 1 to 100 and store it in an int array. Write a program to display the numbers stored at odd indexes by thread1 and display numbers stored at even indexes by thread2.

	int arr[]= new int[15];
	Odd(int arr[]) //constructor
	{
		this.arr = arr;
	}
	public void run()
	{
		for(int i=0; i<15; i++)
		{
			if(arr[i] % 2==0)
			{
				System.out.println(this.arr[i]+" is even");
			}
		}
	}
}
//even thread
class Even extends Thread
{
	int arr[]= new int[15];


	Even(int arr[]) //constructor
	{
		this.arr = arr;
	}
	public void run()
	{
		for(int i=0; i<15; i++)
		{
			if(arr[i] % 2 != 0)
			{
				System.out.println(this.arr[i]+" is odd");
			}
		}
	}
	
}
class Practical2
{
	public static void main(String args[])
	{
		int i;
		int arr[]= new int[15];
		Random r = new Random(); //use of random class
		for(i=0; i<arr.length; i++)
		{
			arr[i] = r.nextInt(100);
		}
		Odd obj1 = new Odd(arr); //calling constructor
		Even obj2 = new Even(arr); //calling constructor
		obj1.start();
		obj2.start();
			}
}