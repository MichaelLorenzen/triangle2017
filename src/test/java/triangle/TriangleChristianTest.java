package triangle;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class TriangleChristianTest {

	public static Triangle triangle = new TriangleChristian();

	@Test
	public void testGetTriangleResultEquilateral() throws Exception {
		int a = 1;
		int b = 1;
		int c = 1;
		TriangleResult result = triangle.getTriangleResultForLenghts(a, b, c);
		assertThat(result).isEqualTo(TriangleResult.TRIANGLE_EQUILATERAL);
	}

	@Test
	public void testGetTriangleResultIsoceles() throws Exception {
		int a = 1;
		int b = 1;
		int c = 3;
		TriangleResult result = triangle.getTriangleResultForLenghts(a, b, c);
		assertThat(result).isEqualTo(TriangleResult.TRIANGLE_ISOSCELES);
	}

	@Test
	public void testGetTriangleResultNotEqual() throws Exception {
		int a = 2;
		int b = 3;
		int c = 4;
		TriangleResult result = triangle.getTriangleResultForLenghts(a, b, c);
		assertThat(result).isEqualTo(TriangleResult.TRIANGLE_NOT_EQUAL);
	}

	@Test
	public void testGetTriangleResultZero() throws Exception {
		int a = 0;
		int b = 0;
		int c = 0;
		TriangleResult result = triangle.getTriangleResultForLenghts(a, b, c);
		assertThat(result).isNotEqualTo(TriangleResult.TRIANGLE_EQUILATERAL);
	}

	@Test
	public void testGetTriangleResultFail() throws Exception {
		int a = 0;
		int b = -2;
		int c = 0;
		TriangleResult result = triangle.getTriangleResultForLenghts(a, b, c);
		assertThat(result).isEqualTo(TriangleResult.UNKNOWN);
	}

	@Test
	public void testGetTriangleResultTest() throws Exception {
		int a = 3;
		int b = 4;
		int c = 5;
		int d = 6;
		TriangleResult result = triangle.getTriangleResultForLenghts(a, b, c, d);
		assertThat(result).isEqualTo(TriangleResult.UNKNOWN);
	}

	@Test
	public void testGetTriangleResultTest2() throws Exception {
		int a = 0;
		int b = 0;
		TriangleResult result = triangle.getTriangleResultForLenghts(a, b);
		assertThat(result).isEqualTo(TriangleResult.UNKNOWN);
	}
	
	@Test
	public void testGetTriangleResultTest3() throws Exception {
		int a = 3;
		int b = 4;
		int c = -5;
		TriangleResult result = triangle.getTriangleResultForLenghts(a, b, c);
		assertThat(result).isEqualTo(TriangleResult.UNKNOWN);
	}
	
	

	
}
