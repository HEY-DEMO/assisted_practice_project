package practice_project7;
/*Inheritance is a concept in java where a sub class is derived from one class
 * using the keyword extends
 * There are 4 types of inheritance
 * 1.single level inheritance 
 * 2.Multi-level inheritance
 * 3.Hierarchical inheritance
 * 4.Hybrid inheritance
 * we will write a simple program that defines all the above types of inheritance
 */
public class Inheritance {

	public static void main(String[] args) {//parent class
		parent p = new parent();			//		|
											//		|
		p.name();							//		|
	}										//		|
											//		|
}											//		|
class parent extends Inheritance{			//	child class
	String parent="john";					//this class is a sub class to "Inheritance" class 
		public void name() {	
			//This is an example of single level inheritance
			child1 f = new child1();
			child2 g = new child2();
		System.out.println("parent1 name: "+this.parent+" has a child "+f.child1+" and "+g.child2);
	}
}
class child1 extends parent{
	//this is an example of multi-level inheritance
	String child1 = "mia";
	
}
class child2 extends parent{
	String child2 = "aron";
	//this is an example of hierarchical inheritance
}


/*This whole program comes under hybrid inheritance
 *parent class has a sub class (single level inheritance)
 *sub class has a sub class(multi-level inheritance with respect to parent class)
 *sub class has another sub class total of two (hierarchical inheritance)
 *combination of multi-level and hierarchical inheritance is hybrid inheritance
*/