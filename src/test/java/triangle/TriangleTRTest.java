package triangle;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class TriangleTRTest {

	public static Triangle triangle = new TriangleTR();
	
	@Test
	public void testNotEqual() throws Exception {
		
		int a = 7;
		int b = 5;
		int c = 10;
		
		TriangleResult result = triangle.getTriangleResultForLenghts(a,b,c);
		assertThat(result.equals(TriangleResult.TRIANGLE_NOT_EQUAL));
	}
	
	@Test
	public void testEquilateral() throws Exception {
		int a = 2;
		int b = 2;
		int c = 2;
		
		TriangleResult result = triangle.getTriangleResultForLenghts(a,b,c);
		assertThat(result.equals(TriangleResult.TRIANGLE_EQUILATERAL));
	}
	
	@Test
	public void testIsosceles() throws Exception {
		int a = 3;
		int b = 3;
		int c = 4;
		
		TriangleResult result = triangle.getTriangleResultForLenghts(a,b,c);
		assertThat(result.equals(TriangleResult.TRIANGLE_ISOSCELES));
	}
	
	@Test
	public void testNegative() throws Exception {
		int a = 2;
		int b = 2;
		int c = -4;
		
		TriangleResult result = triangle.getTriangleResultForLenghts(a,b,c);
		assertThat(result.equals(TriangleResult.UNKNOWN));
	}
	
	@Test
	public void testIsTriangle() throws Exception {
		int a = 2;
		int b = 2;
		int c = 3;
		
		TriangleResult result = triangle.getTriangleResultForLenghts(a,b,c);
		assertThat(result.equals(TriangleResult.UNKNOWN));
	}
	
	@Test
	public void testNull() throws Exception {
		int a = 2;
		int b = 0;
		int c = 3;
		
		TriangleResult result = triangle.getTriangleResultForLenghts(a,b,c);
		assertThat(result.equals(TriangleResult.UNKNOWN));
	}
	
	@Test
	public void testArguments() throws Exception {
		int a = 3;
		int b = 3;
		int c = 4;
		int d = 69;
		
		TriangleResult result = triangle.getTriangleResultForLenghts(a,b,c,d);
		assertThat(result.equals(TriangleResult.UNKNOWN));
	}
	
	@Test
	public void testArguments2() throws Exception {
		int a = 3;
		int b = 3;
		
		TriangleResult result = triangle.getTriangleResultForLenghts(a,b);
		assertThat(result.equals(TriangleResult.UNKNOWN));
	}

}
