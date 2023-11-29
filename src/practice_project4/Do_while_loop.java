package practice_project4;
/*Do while loop is used to iterate the statements atleast once
 * 
 */
public class Do_while_loop { 
	public static void main(String[] args) {
		arr a = new arr();
		a.loop();
	}

}
class arr{
	int array[]= {3,5,6,7,4,45,542}; //initialize and give values in an array
	int i=0;
	public void loop() {
		do { 
			//print the elements in given array
			System.out.println("Element in position"+i+"is: "+array[i]);
			i++;//increment the array
		}while(i<7);//condition to repeat the statements
	}
}