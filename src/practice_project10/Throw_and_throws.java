package practice_project10;
import java.util.Scanner;
/*Let us see how the throw and throws keyword perform
 * with a simple java program
 */
public class Throw_and_throws {

	
	//throws keyword is used as a signature to show that the method may throw an exception
	//In this case the main method tells us that ArrayIndexOutOfBounds exception may occur
	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number from 1 to 100: ");
		int a =s.nextInt();
		if(a>=50) {
			/*throw keyword is used to throw an exception
			 * 
			 */
			throw new ArrayIndexOutOfBoundsException("Element is greater than 50");
		}
		}


	}

