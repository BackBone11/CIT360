/*
 * Name: TestJunit_same.java
 * Date: 07-May-2-19
 * Comments: class to create an object to test Same and NotSame
 */

public class TestJunit_same {
	public int a = 0;
	public int b = 0;
	public int c = 0;

	// constructor
	//
	public TestJunit_same( int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	// setter
	public void setA (int a) {
		this.a = a;
	}

	public void setB (int b) {
		this.b = b;
	}

	public void setC (int c) {
		this.c = c;
	}

	// getter
	public int getSum() {
		return a + b + c;
	}
}
