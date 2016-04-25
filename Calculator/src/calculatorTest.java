import junit.framework.TestCase;


public class calculatorTest extends TestCase {
	calculator ca = new calculator();

	public void testAdd() {
		ca.add(2);
	}

	public void testSubstract() {
		ca.substract(2);
	}

	public void testMultiply() {
		ca.multiply(2);
	}

	public void testDivide() {
		ca.divide(2);
	}

	public void testSquare() {
		ca.square(3);
	}

	public void testSquareRoot() {
		//ca.squareRoot(4);
	}

	public void testClear() {
		ca.clear();
	}

	public void testGetResult() {
		ca.getResult();
	}

}
