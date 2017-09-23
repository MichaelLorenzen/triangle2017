package triangle;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class Triangle_MLorenzenTest {
	
	public static Triangle triangle = new Triangle_MLorenzen();

	@Test
	public void testToFewArguments() throws Exception {
		TriangleResult result1 = triangle.getTriangleResultForLenghts(1, 2);
		TriangleResult result2 = triangle.getTriangleResultForLenghts(2);
		TriangleResult result3 = triangle.getTriangleResultForLenghts();
		assertThat(result1).isEqualTo(TriangleResult.UNKNOWN);
		assertThat(result2).isEqualTo(TriangleResult.UNKNOWN);
		assertThat(result3).isEqualTo(TriangleResult.UNKNOWN);
	}

	@Test
	public void testToManyArguments() throws Exception {
		TriangleResult result = triangle.getTriangleResultForLenghts(1, 2, 3, 5);
		assertThat(result).isEqualTo(TriangleResult.UNKNOWN);
	}
	
	@Test
	public void testIsNoTriangle() throws Exception {
		TriangleResult result1 = triangle.getTriangleResultForLenghts(1, 9, 3);
		assertThat(result1).isEqualTo(TriangleResult.UNKNOWN);
		TriangleResult result2 = triangle.getTriangleResultForLenghts(9, 2, 3);
		assertThat(result2).isEqualTo(TriangleResult.UNKNOWN);
		TriangleResult result3 = triangle.getTriangleResultForLenghts(1, 9, 33);
		assertThat(result3).isEqualTo(TriangleResult.UNKNOWN);
	}

	@Test
	public void testNegativeNumber() throws Exception {
		TriangleResult result = triangle.getTriangleResultForLenghts(1, -2, 3);
		assertThat(result).isEqualTo(TriangleResult.UNKNOWN);
	}
	
	@Test
	public void testIsEquilateral() throws Exception {
		TriangleResult result = triangle.getTriangleResultForLenghts(6, 6, 6);
		assertThat(result).isEqualTo(TriangleResult.TRIANGLE_EQUILATERAL);
	}

	@Test
	public void testIsIsosceles() throws Exception {
		TriangleResult result1 = triangle.getTriangleResultForLenghts(5, 5, 3);
		assertThat(result1).isEqualTo(TriangleResult.TRIANGLE_ISOSCELES);
		TriangleResult result2 = triangle.getTriangleResultForLenghts(9, 5, 5);
		assertThat(result2).isEqualTo(TriangleResult.TRIANGLE_ISOSCELES);
		TriangleResult result3 = triangle.getTriangleResultForLenghts(100, 102, 100);
		assertThat(result3).isEqualTo(TriangleResult.TRIANGLE_ISOSCELES);
	}

	@Test
	public void testIsNotEqual() throws Exception {
		TriangleResult result1 = triangle.getTriangleResultForLenghts(5, 4, 3);
		assertThat(result1).isEqualTo(TriangleResult.TRIANGLE_NOT_EQUAL);
		TriangleResult result2 = triangle.getTriangleResultForLenghts(9, 7, 5);
		assertThat(result2).isEqualTo(TriangleResult.TRIANGLE_NOT_EQUAL);
		TriangleResult result3 = triangle.getTriangleResultForLenghts(101, 102, 100);
		assertThat(result3).isEqualTo(TriangleResult.TRIANGLE_NOT_EQUAL);
	}


	
}
