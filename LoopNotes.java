
public class LoopNotes {

	public static void main(String[] args) {
		String[] names = {"Johnathon", "Dylan", "Alison", "Connor"};
		String[] pets = {"Ace", "Miles", "Willow"};
		boolean go = true;
		int loopy = 0;
		
		//Here is your traditional, basic for loop
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
		
		//Different control flow example
		for (loopy = 0; go; loopy++) {
			if (loopy == 12) {
				go = false;
				loopy--;
			}
		}
		System.out.println("The loop was stopped at " + loopy + " times.");
		
		//Here is an ugly way to iterate through a whole array
		for (int i = 0; i < names.length; i++) { 
			System.out.println(names[i]);
		}
		
		//Here is an easy way to iterate through an entire array
		for (String line : pets) {
			System.out.println(line);
		}
		
		
	}

}
