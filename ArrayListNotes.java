import java.util.ArrayList;

public class ArrayListNotes {
	//ArrayLists are great for manipulating values, adding, removing, sorting
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(1);
		arrayList.add(2);
		if (arrayList.contains(1)) {
			System.out.println("It contains a " + arrayList.get(0)); //you cannot just specify an index like an array, you must use .get
		}

	}

}
