import java.util.HashMap;

public class HashMapNotes {

	public static void main(String[] args) {
		HashMap<String, Integer> mymap = new HashMap<>(); //defining what data type the key and value combination will be 
		mymap.put("John", 16); //similar to arraylist.add method
		mymap.put("Dylan", 14); //the .put method adds the key pair to the BEGINNING of HashMap, not the end
		System.out.println(mymap);
		System.out.println(mymap.size());
		
		if (mymap.containsKey("John")) {
			System.out.println(mymap.get("John"));
		}
		if (mymap.containsValue(16)) {
			System.out.println("It contains a 16!");
		}
		
		mymap.replace("John", 17); //replaces a key with a different value
		System.out.println(mymap);
		mymap.putIfAbsent("Alison", 11); //inserts a key value pair if one doesnt exist, might as well use .put method
		System.out.println(mymap);
		mymap.remove("John"); //removes specified key value pair
		System.out.println(mymap);
		mymap.clear();
		System.out.println(mymap); //empties out the hashmap
	}

}
