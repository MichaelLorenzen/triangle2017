package triangle;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class TriangleUnknownTest {

	public static final Triangle triangle = new TriangleUnknown(); 
	
	@Test
	public void testGetTriangleResultForLenghts() throws Exception {
		int a = 2;
		int b = 3;
		int c = 4;
		TriangleResult result = triangle.getTriangleResultForLenghts(a,b,c);
		assertThat(result).isEqualTo(TriangleResult.TRIANGLE_NOT_EQUAL);
	}

}
