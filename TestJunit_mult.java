/*
 * Name: TestJunit_mult.java
 * Date: 07-May-2-19
 * Comments: Addapted from an example in "JUnit Quick Guide"
 * 	Test class to test multible assert methods.
 */
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class TestJunit_mult {

	TestJunit_same object1 = new TestJunit_same(4, 5, 6);
	TestJunit_same object2 = new TestJunit_same(4, 5, 6);
	TestJunit_same object3 = object2;
	int Three = 3;
	@Test
	public void testAdd() {
		//test data
		int num = 5;
		String temp = null;
		String str = "Junit Test String";
		String array1[] = {"First","Second","Third"};

		// check for equality
		System.out.println("Test Equals");
		assertEquals("Junit Test String",str);
		
		// check for false condition
		System.out.println("Test False");
		assertFalse(num > 6);

		// check for true condition
		System.out.println("Test True");
		assertTrue(num < 6);

		// check for not null value
		System.out.println("Test not null");
		assertNotNull(str);

		// check for null value
		System.out.println("Test for null");
		assertNull(temp);

		// check for Array Equals 
		System.out.println("Test for Array Equal");
		assertArrayEquals(array1, new String[]{"First","Second","Third"});

		// check for Same  
		System.out.println("Test for Same object");
		assertSame(object2, object3);


		// check for NotSame  
		System.out.println("Test for NotSame object");
		assertNotSame(object1, object2);

		// check for assertThat  
		// 	more intuative way of doing asertEquals
		System.out.println("Test for asertThat");
		assertThat(Three, is(equalTo(3)));
		assertThat(Arrays.asList(array1), hasItem("Second"));
	}
}
