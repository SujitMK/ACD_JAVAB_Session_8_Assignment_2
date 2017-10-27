package primeNumberPKG;             // declared package

//this program checks the prime number and prints

public class PrimeAndNotPrimeUsingThread            // Declared and defined a class
{
	public static void main(String args[])              // main method
	{
		PrimeNumber Th1 = new PrimeNumber();                // creating an oobject of prime number class
		Th1.start();                          // calling a thread for prime numbers
		
		NotPrimeNumber Th2 = new NotPrimeNumber();            // creating an oobject of non prime number class
		Th2.start();                          // calling a thread for non prime numbers
	}
}