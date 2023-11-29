package practice_project2;
// Java program to perform access modifier
/* access modifiers are of 4 types
 * 1.public
 * 2.default
 * 3.private
 * 4.protected
 */
public class access_modifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		access a = new access();
		protect m = new protect();
		a.character();
		a.perform();
		a.p();
		a.year();
		m.game_name();
	}

}
class access{
	String name = "Arthur Morgan"; //Default access modifier
	private String role = "Outlaw"; //Private access modifier 
	public int released_year = 2018; //Public access modifier
	
	void character() { 
		System.out.println("Name of the character: "+this.name );
	}
	void perform() { //private modifier can only be accessed by a public method
		System.out.println("The role of the character: "+this.role);
	}
	String p() {
		return this.role;// cant access private modifier directly
	}
	void year() {
		System.out.println("Game released in the year: " +this.released_year);
	}
}
class protect extends access_modifier{
	protected String game = "Red Dead Redemption 2";
	protected void game_name() { //Protected access modifier can only be used through a subclass in 
								//same package or from different one
		System.out.println("Name of the game: "+this.game);
	}
}
