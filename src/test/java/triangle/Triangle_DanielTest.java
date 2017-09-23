package triangle;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class Triangle_DanielTest {

	public static final Triangle triangle = new Triangle_Daniel();
	
	// UNKNOWN, TRIANGLE_NOT_EQUAL, TRIANGLE_EQUILATERAL, TRIANGLE_ISOSCELES;
	
	
	@Test
	public void testGetTriangleResultForLenghtsUNKNOWN1() throws Exception {
		int a = 2;
		TriangleResult result = triangle.getTriangleResultForLenghts(a);
		assertThat(result).isEqualTo(TriangleResult.UNKNOWN);
	}
	@Test
	public void testGetTriangleResultForLenghtsUNKNOWN2() throws Exception {
		int a = 2;
		int b = 3;
		TriangleResult result = triangle.getTriangleResultForLenghts(a,b);
		assertThat(result).isEqualTo(TriangleResult.UNKNOWN);
	}
	@Test
	public void testGetTriangleResultForLenghtsUNKNOWN3() throws Exception {
		int a = 2;
		int b = 3;
		int c = -1;
		TriangleResult result = triangle.getTriangleResultForLenghts(a,b,c);
		assertThat(result).isEqualTo(TriangleResult.UNKNOWN);
	}
	
	@Test
	public void testGetTriangleResultForLenghtsUNKNOWN4() throws Exception {
		int a = 2;
		int b = -1;
		int c = 6;
		TriangleResult result = triangle.getTriangleResultForLenghts(a,b,c);
		assertThat(result).isEqualTo(TriangleResult.UNKNOWN);
	}
	
	@Test
	public void testGetTriangleResultForLenghtsUNKNOWN5() throws Exception {
		int a = 2;
		int b = 3;
		int c = 5;
		int d = 2;
		TriangleResult result = triangle.getTriangleResultForLenghts(a,b,c,d);
		assertThat(result).isEqualTo(TriangleResult.UNKNOWN);
	}
	
	@Test
	public void testGetTriangleResultForLenghtsUNKNOWN6() throws Exception {
		int a = 0;
		int b = 0;
		int c = 0;
		TriangleResult result = triangle.getTriangleResultForLenghts(a,b,c);
		assertThat(result).isEqualTo(TriangleResult.UNKNOWN);
	}
	
	@Test
	public void testGetTriangleResultForLenghtsTRIANGLE_NOT_EQUAL() throws Exception {
		int a = 2;
		int b = 3;
		int c = 4;
		TriangleResult result = triangle.getTriangleResultForLenghts(a,b,c);
		assertThat(result).isEqualTo(TriangleResult.TRIANGLE_NOT_EQUAL);
	}
	
	@Test
	public void testGetTriangleResultForLenghtsTRIANGLE_EQUILATERAL() throws Exception {
		int a = 2;
		int b = 2;
		int c = 2;
		TriangleResult result = triangle.getTriangleResultForLenghts(a,b,c);
		assertThat(result).isEqualTo(TriangleResult.TRIANGLE_EQUILATERAL);
	}
	
	@Test
	public void testGetTriangleResultForLenghtsTRIANGLE_ISOSCELES() throws Exception {
		int a = 2;
		int b = 2;
		int c = 4;
		TriangleResult result = triangle.getTriangleResultForLenghts(a,b,c);
		assertThat(result).isEqualTo(TriangleResult.TRIANGLE_ISOSCELES);
	}

}
