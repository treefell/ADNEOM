import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Integer> listNb = Arrays.asList(1,2,3,4,5,6,7,8);
		List<List<Integer>> listTest = new ArrayList<List<Integer>>(8);
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		ArrayList<Integer> a1 = new ArrayList<Integer>(List.of(1));
		ArrayList<Integer> a2 = new ArrayList<Integer>(List.of(2));
		ArrayList<Integer> a3 = new ArrayList<Integer>(List.of(3));
		ArrayList<Integer> a4 = new ArrayList<Integer>(List.of(4));
		ArrayList<Integer> a5 = new ArrayList<Integer>(List.of(5));
		ArrayList<Integer> a6 = new ArrayList<Integer>(List.of(6));
		ArrayList<Integer> a7 = new ArrayList<Integer>(List.of(7));
		ArrayList<Integer> a8 = new ArrayList<Integer>(List.of(8));
		listTest.add(a1);
		listTest.add(a2);
		listTest.add(a3);
		listTest.add(a4);
		listTest.add(a5);
		listTest.add(a6);
		listTest.add(a7);
		listTest.add(a8);
		System.out.println(listTest.toString());
		/*try {
			result = Library.partition(listNb, -1);
		} catch (NombreNegatifException e) {
			e.printStackTrace();
		}*/
		result = Library.partition(listNb, -1);
		System.out.println();
		if (result.isEmpty() && listTest.equals(result))
			System.out.println("OK");
		System.out.println("Test");
	}
}
