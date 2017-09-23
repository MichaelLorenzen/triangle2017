package triangle;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class TriangleSola0003Test {

	public static Triangle triangle = new TriangleSola0003();

	@Test
	public void testToManyValues() {
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;
		
		TriangleResult result = triangle.getTriangleResultForLenghts(a,b,c,d);
		assertThat(result).isEqualTo(TriangleResult.UNKNOWN);
	}
	
	@Test
	public void testToLessValues() {
		int a = 1;
		int b = 2;
		
		TriangleResult result = triangle.getTriangleResultForLenghts(a,b);
		assertThat(result).isEqualTo(TriangleResult.UNKNOWN);
	}
	
	@Test
	public void testNegativeValues() {
		int a = -1;
		int b = 2;
		int c = 3;
		
		TriangleResult result = triangle.getTriangleResultForLenghts(a,b,c);
		assertThat(result).isEqualTo(TriangleResult.UNKNOWN);
	}
	
	@Test
	public void testNegativeValues2() {
		int a = -1;
		int b = -2;
		int c = -3;
		
		TriangleResult result = triangle.getTriangleResultForLenghts(a,b,c);
		assertThat(result).isEqualTo(TriangleResult.UNKNOWN);
	}
	
	@Test
	public void testNullValues() {
		int a = 0;
		int b = 2;
		int c = 3;
		
		TriangleResult result = triangle.getTriangleResultForLenghts(a,b,c);
		assertThat(result).isEqualTo(TriangleResult.UNKNOWN);
	}
	
	@Test
	public void testNullValues2() {
		int a = 2;
		int b = 0;
		int c = 3;
		
		TriangleResult result = triangle.getTriangleResultForLenghts(a,b,c);
		assertThat(result).isEqualTo(TriangleResult.UNKNOWN);
	}
	
	@Test
	public void testNullValues3() {
		int a = 0;
		int b = 0;
		int c = 0;
		
		TriangleResult result = triangle.getTriangleResultForLenghts(a,b,c);
		assertThat(result).isEqualTo(TriangleResult.UNKNOWN);
	}
	
	@Test
	public void testNotEqualTriangle() {
		int a = 1;
		int b = 2;
		int c = 3;
		
		TriangleResult result = triangle.getTriangleResultForLenghts(a,b,c);
		assertThat(result).isEqualTo(TriangleResult.TRIANGLE_NOT_EQUAL);
	}
	
	@Test
	public void testISOSCELESTriangle() {
		int a = 2;
		int b = 2;
		int c = 3;
		
		TriangleResult result = triangle.getTriangleResultForLenghts(a,b,c);
		assertThat(result).isEqualTo(TriangleResult.TRIANGLE_ISOSCELES);
	}
	
	@Test
	public void testISOSCELESTriangle2() {
		int a = 2;
		int b = 4;
		int c = 4;
		
		TriangleResult result = triangle.getTriangleResultForLenghts(a,b,c);
		assertThat(result).isEqualTo(TriangleResult.TRIANGLE_ISOSCELES);
	}
	
	@Test
	public void testISOSCELESTriangle3() {
		int a = 10;
		int b = 4;
		int c = 10;
		
		TriangleResult result = triangle.getTriangleResultForLenghts(a,b,c);
		assertThat(result).isEqualTo(TriangleResult.TRIANGLE_ISOSCELES);
	}
	
	@Test
	public void testEQUILATERALTriangle() {
		int a = 10;
		int b = 10;
		int c = 10;
		
		TriangleResult result = triangle.getTriangleResultForLenghts(a,b,c);
		assertThat(result).isEqualTo(TriangleResult.TRIANGLE_EQUILATERAL);
	}
	
	@Test
	public void testGrenzwertPositiv() {
		int a = Integer.MAX_VALUE;
		int b = Integer.MAX_VALUE;
		int c = Integer.MAX_VALUE;
		
		TriangleResult result = triangle.getTriangleResultForLenghts(a,b,c);
		assertThat(result).isEqualTo(TriangleResult.TRIANGLE_EQUILATERAL);
	}
	
	@Test
	public void testGrenzwertNegativ() {
		int a = Integer.MIN_VALUE;
		int b = Integer.MIN_VALUE;
		int c = Integer.MIN_VALUE;
		
		TriangleResult result = triangle.getTriangleResultForLenghts(a,b,c);
		assertThat(result).isEqualTo(TriangleResult.UNKNOWN);
	}
	
	@Test
	public void testWithoutValues() {
		TriangleResult result = triangle.getTriangleResultForLenghts();
		assertThat(result).isEqualTo(TriangleResult.UNKNOWN);
	}
	
	@Test
	public void testNull() {
		TriangleResult result = triangle.getTriangleResultForLenghts(null);
		assertThat(result).isEqualTo(TriangleResult.UNKNOWN);
	}
	
}
