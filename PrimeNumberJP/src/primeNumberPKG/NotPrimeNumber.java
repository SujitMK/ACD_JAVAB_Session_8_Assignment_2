package primeNumberPKG;                // declared package

// this program checks and prints prime number

class NotPrimeNumber extends Thread             // Declared and defined a class  which extends Thread class
{
	public void run()              // overridden run method of Thread class
	{
		try                          // using try block to handle the exception
		{ 
			for(int i=1;i<=10;i++)            // for loop to print non prime number
			{
				if(i==4||i==6||i==8||i==9||i==10)            // if condition to check prime number
				{
					System.out.println ("Non-Prime Number is : "+i);      // Printing the non  prime numbers
				}
				Thread.sleep(500);             // sleeping Thread for Non Prime numbers for 500ms
			}
		}
		catch (Exception e)                   // handling exception using catch   
		{
		    e.printStackTrace();                 // printing defualt error log
		}
	}
}