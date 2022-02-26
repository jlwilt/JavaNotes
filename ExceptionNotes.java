
public class ExceptionNotes {

	public static void getInt() {
		int myint = Integer.parseInt("pants");
	}
	
	public static void main(String[] args) {
		try {
			getInt();
			
		} catch (Exception e) { //| NullPointerException) You can use the or thing to add multiple types of exceptions
			System.out.println("You can't turn pants into an int, dummy");
		}
		
	}
	
}
