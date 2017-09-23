package triangle;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class TriangleDZappTest {
	
	public static Triangle triangle = new TriangleDZapp();
	

	@Test
	public void testGetTriangleResultForLenghts() throws Exception {
		int a = 2;
		int b = 2;
		int c = 2;
		TriangleResult result = triangle.getTriangleResultForLenghts(a, b, c);
		assertThat(result).isEqualTo(TriangleResult.TRIANGLE_EQUILATERAL);				
		}
	@Test
	public void testGetTriangleResultForLenghts2() throws Exception {
		int a = 2;
		int b = 2;
		int c = 3;
		TriangleResult result = triangle.getTriangleResultForLenghts(a, b, c);
		assertThat(result).isEqualTo(TriangleResult.TRIANGLE_ISOSCELES);				
		}
	@Test
	public void testGetTriangleResultForLenghts3() throws Exception {
		int a = 3;
		int b = 2;
		int c = 2;
		TriangleResult result = triangle.getTriangleResultForLenghts(a, b, c);
		assertThat(result).isEqualTo(TriangleResult.TRIANGLE_ISOSCELES);				
		}
	@Test
	public void testGetTriangleResultForLenghts4() throws Exception {
		int a = 2;
		int b = 3;
		int c = 2;
		TriangleResult result = triangle.getTriangleResultForLenghts(a, b, c);
		assertThat(result).isEqualTo(TriangleResult.TRIANGLE_ISOSCELES);				
		}
	
	@Test
	public void testGetTriangleResultForLenghts5() throws Exception {
		int a = 1;
		int b = 2;
		int c = 3;
		TriangleResult result = triangle.getTriangleResultForLenghts(a, b, c);
		assertThat(result).isEqualTo(TriangleResult.TRIANGLE_NOT_EQUAL);				
		}
	
	@Test
	public void testGetTriangleResultForLenghts6() throws Exception {
		int a = 1;
		int b = 2;
		TriangleResult result = triangle.getTriangleResultForLenghts(a, b);
		assertThat(result).isEqualTo(TriangleResult.UNKNOWN);				
		}
	
	@Test
	public void testGetTriangleResultForLenghtsFail() throws Exception {
		int a = 1;
		int b = 2;
		int c = 3;
		TriangleResult result = triangle.getTriangleResultForLenghts(a, b, c);
		assertThat(result).isEqualTo(TriangleResult.TRIANGLE_EQUILATERAL);				
		}
	
	
	
}
