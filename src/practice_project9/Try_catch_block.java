package practice_project9;
//This is a simple program to define try catch block

public class Try_catch_block {
static int array[] = {1,2,3,4};
	public static void main(String[] args) {
		try {		//The statements that are need to be tested go into the try block
			System.out.println(array[6]);
		}
		catch(Exception a) {//catch is used to catch the error and print the custom error message
			System.out.print("cant access the element: Array index out of bounds");
		}
	}

}
