package triangle;

public class Triangle_Daniel extends Triangle {

	@Override
	public TriangleResult getTriangleResultForLenghts(int... lengths) {
		
		if (lengths.length != 3 )
		{
			return TriangleResult.UNKNOWN;
		}
		
		int a = lengths[0];
		int b = lengths[1];
		int c = lengths[2];
		
		if ( a <= 0 || b <= 0 || c <= 0)
		{
			return TriangleResult.UNKNOWN;
		}
	
		
		if (a == b && b == c)
		{
			return TriangleResult.TRIANGLE_EQUILATERAL;
		}
		
		if (a == b && a != c || b == c && b != a)
		{
			return TriangleResult.TRIANGLE_ISOSCELES;
		}
		
		if (a != b && b != c)
		{
			return TriangleResult.TRIANGLE_NOT_EQUAL;
		}
		
		return null;
	}

}
