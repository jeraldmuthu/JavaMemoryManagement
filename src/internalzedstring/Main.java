package internalzedstring;

public class Main {

	public static void main(String[] args) {

		String one = "hello";
		
		String two = "hello";
		
		if (one == two) {
			System.out.println("They are same object");
		} else {
			System.out.println("They are different object");
		}
		
		String three = new Integer(76).toString();
		
		String four = "76";
		
		if (three == four) {
			System.out.println("They are same object");
		} else {
			System.out.println("They are different object");
		}
		
	}

}
