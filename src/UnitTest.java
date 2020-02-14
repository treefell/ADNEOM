import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hamcrest.core.IsEqual;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;

import org.junit.Test;
/*import org.junit.Rule;
import org.junit.rules.ExpectedException;
*/

public class UnitTest {

	public static List<Integer> listNb = Arrays.asList(1,2,3,4,5,6,7,8);
	@Before
	public void debutTest()
	{
		System.out.println("------------");
		System.out.println("Début test");
	}
	
	@After
	public void finTest()
	{
		System.out.println("Fin test");
		System.out.println("------------");
	}
	
	@Test(timeout=1000)
	public void testPartition0() {
		System.out.println("Test partition avec 0");
		Assert.assertThat(Arrays.asList(), IsEqual.equalTo(Library.partition(listNb, 0)));
		/*try {
			Assert.assertThat(Arrays.asList(), IsEqual.equalTo(Library.partition(listNb, 0)));
		} catch (NombreNegatifException e) {
			e.printStackTrace();
		}*/
	}
	@Test(timeout=1000)
	public void testPartition1() {
;
		List<List<Integer>> listTest = new ArrayList<List<Integer>>(8);
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
		System.out.println("Test partition avec 1");
		Assert.assertEquals(listTest, Library.partition(listNb, 1));
		/*try {
			Assert.assertEquals(listTest, Library.partition(listNb, 1));
		} catch (NombreNegatifException e) {
			e.printStackTrace();
		}*/
	}
	@Test(timeout=1000)
	public void testPartition2() {
		List<List<Integer>> listTest = new ArrayList<List<Integer>>(8);
		ArrayList<Integer> a1 = new ArrayList<Integer>(List.of(1,2));
		ArrayList<Integer> a2 = new ArrayList<Integer>(List.of(3,4));
		ArrayList<Integer> a3 = new ArrayList<Integer>(List.of(5,6));
		ArrayList<Integer> a4 = new ArrayList<Integer>(List.of(7,8));
		listTest.add(a1);
		listTest.add(a2);
		listTest.add(a3);
		listTest.add(a4);
		System.out.println("Test partition avec 2");
		Assert.assertEquals(listTest, Library.partition(listNb,2));
		/*try {
			Assert.assertEquals(listTest, Library.partition(listNb,2));
		} catch (NombreNegatifException e) {
			e.printStackTrace();
		}*/
	}
	@Test(timeout=1000)
	public void testPartition3() {
		List<List<Integer>> listTest = new ArrayList<List<Integer>>(8);
		ArrayList<Integer> a1 = new ArrayList<Integer>(List.of(1,2,3));
		ArrayList<Integer> a2 = new ArrayList<Integer>(List.of(4,5,6));
		ArrayList<Integer> a3 = new ArrayList<Integer>(List.of(7,8));
		listTest.add(a1);
		listTest.add(a2);
		listTest.add(a3);
		System.out.println("Test partition avec 3");
		Assert.assertEquals(listTest, Library.partition(listNb,3));
		/*try {
			Assert.assertEquals(listTest, Library.partition(listNb,3));
		} catch (NombreNegatifException e) {
			e.printStackTrace();
		}*/
	}
	@Test(timeout=1000)
	public void testPartition4() {
		List<List<Integer>> listTest = new ArrayList<List<Integer>>(8);
		ArrayList<Integer> a1 = new ArrayList<Integer>(List.of(1,2,3,4));
		ArrayList<Integer> a2 = new ArrayList<Integer>(List.of(5,6,7,8));
		listTest.add(a1);
		listTest.add(a2);
		System.out.println("Test partition avec 4");
		Assert.assertEquals(listTest, Library.partition(listNb,4));
		/*try {
			Assert.assertEquals(listTest, Library.partition(listNb,4));
		} catch (NombreNegatifException e) {
			e.printStackTrace();
		}*/
	}
	
	@Test(timeout=1000)
	public void testPartition8() {
		List<List<Integer>> listTest = new ArrayList<List<Integer>>(8);
		ArrayList<Integer> a1 = new ArrayList<Integer>(List.of(1,2,3,4,5,6,7,8));
		listTest.add(a1);
		System.out.println("Test partition avec 8");
		Assert.assertEquals(listTest, Library.partition(listNb,8));
		/*try {
			Assert.assertEquals(listTest, Library.partition(listNb,8));
		} catch (NombreNegatifException e) {
			e.printStackTrace();
		}*/
	}
	
	@Test(timeout=1000)
	public void testPartition9() {
		List<List<Integer>> listTest = new ArrayList<List<Integer>>(8);
		ArrayList<Integer> a1 = new ArrayList<Integer>(List.of(1,2,3,4,5,6,7,8));
		listTest.add(a1);
		System.out.println("Test partition avec 9");
		Assert.assertEquals(listTest, Library.partition(listNb,9));
		/*try {
			Assert.assertEquals(listTest, Library.partition(listNb,9));
		} catch (NombreNegatifException e) {
			e.printStackTrace();
		}*/
	}
	
/*
 	@Rule 
	public ExpectedException expectedEx = ExpectedException.none();
*/
	
	@Test//(expected = NombreNegatifException.class)
	public void testPartitionNegatif() throws Exception {
		System.out.println("Test partition avec -1");
		Assert.assertThat(Arrays.asList(), IsEqual.equalTo(Library.partition(listNb, -1)));
		/*
		expectedEx.expect(NombreNegatifException.class);
		expectedEx.expectMessage("Vous essayez de partitionner avec un nombre négatif !");
		Library.partition(listNb, -1);
		System.out.println("=======Starting Exception process=======");
		throw new NullPointerException("Vous essayez de partitionner avec un nombre négatif !");
		*/
		/*
		try {
				Library.partition(listNb, -1);
		}catch (NombreNegatifException e) {
			e.printStackTrace();
		}*/
	}
	
}
