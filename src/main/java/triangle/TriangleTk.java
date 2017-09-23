package triangle;

public class TriangleTk extends Triangle
{
	@Override
	public TriangleResult getTriangleResultForLenghts(int... lengths)
	{
		TriangleResult ret = null;
		int a = 0;
		int b = 0;
		int c = 0;
		
		switch (lengths.length)
		{
			case 3:
				a = lengths[0];
				b = lengths[1];
				c = lengths[2];
				
				if(a > 0 && b > 0 && c > 0)
				{
					if(a == b && b == c)
						ret = TriangleResult.TRIANGLE_EQUILATERAL;
					
					if(a != b && a != c && b != c)
						ret = TriangleResult.TRIANGLE_NOT_EQUAL;
					
					if(a == b && a != c)
						ret = TriangleResult.TRIANGLE_ISOSCELES;
					
					if(b == c && b != a)
						ret = TriangleResult.TRIANGLE_ISOSCELES;
					
					if(c == a && c != b)
						ret = TriangleResult.TRIANGLE_ISOSCELES;
				}
				else
				{
					ret = TriangleResult.UNKNOWN;
				}
				
				break;
			
			default:
				ret = TriangleResult.UNKNOWN;
				break;
		}
		
		return ret;
	}
}
