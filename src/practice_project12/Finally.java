package practice_project12;
//A simple java program that explains finally

import java.util.Scanner;

public class Finally {

	public static void main(String[] args) {
		//initializing an array
		int array[]=new int[2];
		//using scanner to take inputs from user
		Scanner s = new Scanner(System.in);
		
		//code inside try block is used to handle the exceptions
		try {
			System.out.println("Enter 2 numbers you want to divide");
			for(int i=0;i<2;i++) {
				array[i]=s.nextInt();//taking input from user
			}
			System.out.println(array[0]/array[1]);//throws arithmetic exception if the first number is divided by zero
		}
		catch(ArithmeticException a) {
			System.out.println("Can't divide by zero");
		}
		finally {//finally block is used to end the exception(to close a file or a connection)
			s.close();//Scanner is closed to prevent leaks
			System.out.println("Statements inside finally always gets executed");
		}
		System.out.println("End of the code");
	}
}
