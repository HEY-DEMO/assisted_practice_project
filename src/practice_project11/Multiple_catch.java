package practice_project11;
import java.util.Scanner;
/*A simple program to explain multiple catch blocks
 * 
 */
public class Multiple_catch {

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
			System.out.println(array[2]);//throws array index out of bounds exception 
		}
		catch(ArrayIndexOutOfBoundsException a) {//used to catch and print the exception
			System.out.println("can't store element in that index");
		}
		catch(ArithmeticException a) {
			System.out.println("Can't divide by zero");
		}
		finally {
			s.close();//Scanner is closed to prevent leaks
		}
		System.out.println("End of the code");
	}

}
