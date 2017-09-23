package triangle;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class TriangleTkTest
{
	public static Triangle triangle = new TriangleTk();
	
	@Test
	public void testGetTriangleResultForLenghtsNotEqual() throws Exception
	{
		int a = 1;
		int b = 2;
		int c = 3;
		TriangleResult result = triangle.getTriangleResultForLenghts(a, b, c);
		assertThat(result).isEqualTo(TriangleResult.TRIANGLE_NOT_EQUAL);
	}
	
	@Test
	public void testGetTriangleResultForLenghtsNotEqual2() throws Exception
	{
		int a = 3;
		int b = 2;
		int c = 1;
		TriangleResult result = triangle.getTriangleResultForLenghts(a, b, c);
		assertThat(result).isEqualTo(TriangleResult.TRIANGLE_NOT_EQUAL);
	}
	
	@Test
	public void testGetTriangleResultForLenghtsNotEqual3() throws Exception
	{
		int a = 3;
		int b = 1;
		int c = 2;
		TriangleResult result = triangle.getTriangleResultForLenghts(a, b, c);
		assertThat(result).isEqualTo(TriangleResult.TRIANGLE_NOT_EQUAL);
	}
	
	@Test
	public void testGetTriangleResultForLenghtsEquilateral() throws Exception
	{
		int a = 1;
		int b = 1;
		int c = 1;
		TriangleResult result = triangle.getTriangleResultForLenghts(a, b, c);
		assertThat(result).isEqualTo(TriangleResult.TRIANGLE_EQUILATERAL);
	}
	
	@Test
	public void testGetTriangleResultForLenghtsIsosceles1() throws Exception
	{
		int a = 1;
		int b = 1;
		int c = 3;
		TriangleResult result = triangle.getTriangleResultForLenghts(a, b, c);
		assertThat(result).isEqualTo(TriangleResult.TRIANGLE_ISOSCELES);
	}
	
	@Test
	public void testGetTriangleResultForLenghtsIsosceles2() throws Exception
	{
		int a = 1;
		int b = 3;
		int c = 1;
		TriangleResult result = triangle.getTriangleResultForLenghts(a, b, c);
		assertThat(result).isEqualTo(TriangleResult.TRIANGLE_ISOSCELES);
	}
	
	@Test
	public void testGetTriangleResultForLenghtsIsosceles3() throws Exception
	{
		int a = 3;
		int b = 1;
		int c = 1;
		TriangleResult result = triangle.getTriangleResultForLenghts(a, b, c);
		assertThat(result).isEqualTo(TriangleResult.TRIANGLE_ISOSCELES);
	}
	
	@Test
	public void testGetTriangleResultForLenghtsUnknown1Negative1() throws Exception
	{
		int a = -1;
		int b = 1;
		int c = 1;
		TriangleResult result = triangle.getTriangleResultForLenghts(a, b, c);
		assertThat(result).isEqualTo(TriangleResult.UNKNOWN);
	}
	
	@Test
	public void testGetTriangleResultForLenghtsUnknown1Negative2() throws Exception
	{
		int a = 1;
		int b = -1;
		int c = 1;
		TriangleResult result = triangle.getTriangleResultForLenghts(a, b, c);
		assertThat(result).isEqualTo(TriangleResult.UNKNOWN);
	}
	
	@Test
	public void testGetTriangleResultForLenghtsUnknown1Negative3() throws Exception
	{
		int a = 1;
		int b = 1;
		int c = -1;
		TriangleResult result = triangle.getTriangleResultForLenghts(a, b, c);
		assertThat(result).isEqualTo(TriangleResult.UNKNOWN);
	}
	
	@Test
	public void testGetTriangleResultForLenghtsUnknown2Negative1() throws Exception
	{
		int a = -1;
		int b = -1;
		int c = 1;
		TriangleResult result = triangle.getTriangleResultForLenghts(a, b, c);
		assertThat(result).isEqualTo(TriangleResult.UNKNOWN);
	}
	
	@Test
	public void testGetTriangleResultForLenghtsUnknown2Negative2() throws Exception
	{
		int a = -1;
		int b = 1;
		int c = -1;
		TriangleResult result = triangle.getTriangleResultForLenghts(a, b, c);
		assertThat(result).isEqualTo(TriangleResult.UNKNOWN);
	}
	
	@Test
	public void testGetTriangleResultForLenghtsUnknown2Negative3() throws Exception
	{
		int a = 1;
		int b = -1;
		int c = -1;
		TriangleResult result = triangle.getTriangleResultForLenghts(a, b, c);
		assertThat(result).isEqualTo(TriangleResult.UNKNOWN);
	}
	
	@Test
	public void testGetTriangleResultForLenghtsUnknown3Negative() throws Exception
	{
		int a = -1;
		int b = -1;
		int c = -1;
		TriangleResult result = triangle.getTriangleResultForLenghts(a, b, c);
		assertThat(result).isEqualTo(TriangleResult.UNKNOWN);
	}
	
	@Test
	public void testGetTriangleResultForLenghtsUnknown1Zero1() throws Exception
	{
		int a = 0;
		int b = 1;
		int c = 1;
		TriangleResult result = triangle.getTriangleResultForLenghts(a, b, c);
		assertThat(result).isEqualTo(TriangleResult.UNKNOWN);
	}
	
	@Test
	public void testGetTriangleResultForLenghtsUnknown1Zero2() throws Exception
	{
		int a = 1;
		int b = 0;
		int c = 1;
		TriangleResult result = triangle.getTriangleResultForLenghts(a, b, c);
		assertThat(result).isEqualTo(TriangleResult.UNKNOWN);
	}
	
	@Test
	public void testGetTriangleResultForLenghtsUnknown1Zero3() throws Exception
	{
		int a = 1;
		int b = 1;
		int c = 0;
		TriangleResult result = triangle.getTriangleResultForLenghts(a, b, c);
		assertThat(result).isEqualTo(TriangleResult.UNKNOWN);
	}
	
	@Test
	public void testGetTriangleResultForLenghtsUnknown2Zero1() throws Exception
	{
		int a = 1;
		int b = 0;
		int c = 0;
		TriangleResult result = triangle.getTriangleResultForLenghts(a, b, c);
		assertThat(result).isEqualTo(TriangleResult.UNKNOWN);
	}
	
	@Test
	public void testGetTriangleResultForLenghtsUnknown2Zero2() throws Exception
	{
		int a = 0;
		int b = 1;
		int c = 0;
		TriangleResult result = triangle.getTriangleResultForLenghts(a, b, c);
		assertThat(result).isEqualTo(TriangleResult.UNKNOWN);
	}
	
	@Test
	public void testGetTriangleResultForLenghtsUnknown2Zero3() throws Exception
	{
		int a = 0;
		int b = 0;
		int c = 1;
		TriangleResult result = triangle.getTriangleResultForLenghts(a, b, c);
		assertThat(result).isEqualTo(TriangleResult.UNKNOWN);
	}
	
	@Test
	public void testGetTriangleResultForLenghtsUnknown3Zero() throws Exception
	{
		int a = 0;
		int b = 0;
		int c = 0;
		TriangleResult result = triangle.getTriangleResultForLenghts(a, b, c);
		assertThat(result).isEqualTo(TriangleResult.UNKNOWN);
	}
	
	@Test
	public void testGetTriangleResultForLenghtsUnknown2Parameter() throws Exception
	{
		int a = 1;
		int b = 1;
		TriangleResult result = triangle.getTriangleResultForLenghts(a, b);
		assertThat(result).isEqualTo(TriangleResult.UNKNOWN);
	}
	
	@Test
	public void testGetTriangleResultForLenghtsUnknown4Parameter() throws Exception
	{
		int a = 1;
		int b = 1;
		int c = 1;
		int d = 1;
		TriangleResult result = triangle.getTriangleResultForLenghts(a, b, c, d);
		assertThat(result).isEqualTo(TriangleResult.UNKNOWN);
	}
}
