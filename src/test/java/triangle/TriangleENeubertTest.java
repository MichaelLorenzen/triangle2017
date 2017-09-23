package triangle;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class TriangleENeubertTest {

	public static Triangle triangle = new TriangleENeubert();

	@Test
	public void testGetTriangleResultForLenghts1() throws Exception {
		int a = 4;
		int b = 5;
		int c = 5;

		TriangleResult result = triangle.getTriangleResultForLenghts(a, b, c);
		assertThat(result).isEqualTo(TriangleResult.TRIANGLE_ISOSCELES);
	}

	@Test
	public void testGetTriangleResultForLenghts2() throws Exception {
		int a = 5;
		int b = 4;
		int c = 5;

		TriangleResult result = triangle.getTriangleResultForLenghts(a, b, c);
		assertThat(result).isEqualTo(TriangleResult.TRIANGLE_ISOSCELES);
	}

	@Test
	public void testGetTriangleResultForLenghts3() throws Exception {
		int a = 5;
		int b = 5;
		int c = 4;

		TriangleResult result = triangle.getTriangleResultForLenghts(a, b, c);
		assertThat(result).isEqualTo(TriangleResult.TRIANGLE_ISOSCELES);
	}

	@Test
	public void testGetTriangleResultForLenghts4() throws Exception {
		int a = 1;
		int b = 2;
		int c = 3;

		TriangleResult result = triangle.getTriangleResultForLenghts(a, b, c);
		assertThat(result).isEqualTo(TriangleResult.TRIANGLE_NOT_EQUAL);
	}

	@Test
	public void testGetTriangleResultForLenghts5() throws Exception {
		int a = 5;
		int b = 5;
		int c = 5;

		TriangleResult result = triangle.getTriangleResultForLenghts(a, b, c);
		assertThat(result).isEqualTo(TriangleResult.TRIANGLE_EQUILATERAL);
	}

	@Test
	public void testGetTriangleResultForLenghts6() throws Exception {
		int a = 5;
		int b = 5;

		TriangleResult result = triangle.getTriangleResultForLenghts(a, b);
		assertThat(result).isEqualTo(TriangleResult.UNKNOWN);
	}

}
