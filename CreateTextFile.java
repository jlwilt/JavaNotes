
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CreateTextFile {
	// TODO Send output to a text file
	public static void main(String[] args) throws FileNotFoundException {
			PrintWriter pw = new PrintWriter("output.txt");
		for (int x = 9; x < 100; x += 7) {
			System.out.println(x);
			pw.println(x);
		}
		pw.close();
	}

}
