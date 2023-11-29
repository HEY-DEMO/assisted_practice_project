package practice_project3;
/* While loop is used to repeat selected statements until
 * the condition fails (it will exit the loop)
 */
public class While_loop { 
	public static void main(String[] args) {
		arr a = new arr();
		a.loop();
	}

}
class arr{
	int array[]= {3,5,6,7,4,45,542}; //initialize and give values in an array
	int i=0;
	public void loop() {
		while(i<7) { //condition to repeat the statements
			//print the elements in given array
			System.out.println("Element in position"+i+"is: "+array[i]);
			i++;//increment the array
		}
	}
}