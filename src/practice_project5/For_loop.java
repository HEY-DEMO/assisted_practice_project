package practice_project5;
public class For_loop { 
	public static void main(String[] args) {
		arr a = new arr();
		a.loop();
	}

}
class arr{
	int array[]= {3,5,6,7,4,45,542}; //initialize and give values in an array
	int i=0;
	public void loop() {
		//initialize, condition and increment in a single line
		for(i=0;i<7;i++) { 
			//print the elements in given array
			System.out.println("Element in position"+i+"is: "+array[i]);
		}
	}
}