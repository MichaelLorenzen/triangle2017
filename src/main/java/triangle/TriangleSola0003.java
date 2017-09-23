package triangle;

public class TriangleSola0003 extends Triangle{

	@Override
	public TriangleResult getTriangleResultForLenghts(int... lengths) {
		if(lengths == null || lengths.length != 3) return TriangleResult.UNKNOWN;
		int a = lengths[0];
		int b = lengths[1];
		int c = lengths[2];
		
		if(a <= 0 || b <= 0 || c <= 0) return TriangleResult.UNKNOWN;
		
		if(a == b && b == c) return TriangleResult.TRIANGLE_EQUILATERAL;
		
		if(a != b && b != c && a != c) return TriangleResult.TRIANGLE_NOT_EQUAL;
		
		return TriangleResult.TRIANGLE_ISOSCELES;
	}

}
