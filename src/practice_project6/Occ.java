package practice_project6;
/*we will define objects classes and constructors with a simple
 * program
 */
public class Occ {// we define class using a class keyword and a name to it
	Occ(){}//This is a constructor 
	/*We do not need to define a constructor because it will be created
	 * by default whenever a class is created
	 */
	int x = 15;
	public static void main(String[] args) {
		//We define objects to access data from same class or other class
		//In java everything is structured in the form of objects
		//defining objects using new
		Occ a= new Occ();
		s s =new s();
		System.out.println(a.x);//accessing objects from same class
		s.d();// accessing objects from different class

	}

}
class s{
	int r = 19;
	public void d() {
		System.out.println(this.r);
	}
}
















