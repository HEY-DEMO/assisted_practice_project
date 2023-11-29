package practice_project1;
/* This the program to perform implicit and explicit
 * type casting
 */
public class type_casting {

	public static void main(String[] args) {
		casting c = new casting();
		c.implicit_typecast();
		c.explicit_typecast();
	}

}


class casting{

	public  void explicit_typecast() {
		// EXPLICIT TYPE CASTING
		/* Explicit type casting focuses on changing large data type to small data type
		 * 
		 */
		// Initializing variables and performing explicit type casting
		
		double savings = 35648.45345d; 
		
		float sub = (float)savings;
		
		long current = (long) savings; // Narrowing => double -> long
		
		int balance = (int) savings; // Narrowing => double -> int
		
		short money = (short) current;  // Narrowing => long -> short
		
		byte change = (byte) current; // Narrowing => double -> byte
		
		// Printing all the converted values
		System.out.println("---------------------------------");
		System.out.println("Print Explicit type casting");
		System.out.println("savings (double) : "+ savings);
		System.out.println("savings (float) : "+ sub);
		System.out.println("savings (long) : "+ current);
		System.out.println("savings (int) : "+ balance);
		System.out.println("savings (short) : "+ money);
		System.out.println("savings (byte) : "+ change);
		
	}
	public void implicit_typecast(){
		// IMPLICIT TYPE CASTING
		/* Implicit type casting focuses on changing small data type to big data type
		 * 
		 */

		// Initializing variables and performing implicit type casting
		
		byte money = 100 ;  
		
		short dollar = money ;  // Implicit Type cast
		
		int ruppee = dollar ;      // Implicit Type cast
		
		long yan = ruppee ;      // Implicit Type cast -> int => long
		
		float bing = yan;    // Implicit Type cast -> long => float
		
		double trupe = bing; // Implicit Type cast -> long => double
		
		double group = trupe; // Implicit Type cast -> float => double
		
		//Printing all the converted values
		
		System.out.println("Print Implicit type casting");
		System.out.println("Byte count : "+ money);
		System.out.println("Integer count : "+ ruppee);
		System.out.println("Short count : "+ dollar);
		System.out.println("Long count : "+ yan);
		System.out.println("Float count : "+ bing);
		System.out.println("Doube count 1 : "+ trupe);
		System.out.println("Double count 2 : "+ group);
		System.out.println("---------------------------------");
	}
}
