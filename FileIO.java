import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO {

	public static void main(String[] args) {
		
		//BufferedWriter writes to a file
		//FileWriter can be declared in buffered writer object parenthesis to create a file for writing to
		//You MUST .close() the writer or the file will be created but not written to 
		
		String[] names = {"Johnathon", "Dylan", "Alison", "Connor"};
		try { 
			BufferedWriter wr = new BufferedWriter(new FileWriter("output.txt"));
			wr.write("Writing to a file.");
			wr.write("\nSecond file line.");
			for (String name : names) { //special way to iterate through loop
				wr.write("\n" + name);
			}
			wr.close();
			
		} catch (IOException e) {
			System.out.println("File not found");
		}
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("output.txt"));
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			br.close();
		} catch (IOException e) {
			System.out.println("File not found");
		}
	}

}
