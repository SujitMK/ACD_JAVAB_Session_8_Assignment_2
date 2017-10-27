package primeNumberPKG;   // declared package

// this program checks and prints non prime number

//Imported lang, io and util interfaces

class PrimeNumber extends Thread             // Declared and defined a class which extends Thread class
{
	public void run()          // overridden run method of Thread class
	{
		try                   // using try block to handle the exception
		{
			for(int i=1;i<=10;i++)         // for loop to print prime number
			{
				if(i==2||i==3||i==5||i==7)        // if condition to check prime number
				{
					System.out.println ("Prime Number is     : "+i);  // Printing the prime numbers
				}
				Thread.sleep(500);           // sleeping Thread for Prime numbers for 500ms
			}
		}
		catch (Exception e)                    // handling exception using catch
		{
		    e.printStackTrace();             // printing defualt error log
		}
	}
}