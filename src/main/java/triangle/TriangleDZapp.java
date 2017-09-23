package triangle;

public class TriangleDZapp extends Triangle {

	@Override
	public TriangleResult getTriangleResultForLenghts(int... lengths) {

		if (lengths.length == 3) {
			int a = lengths[0];
			int b = lengths[1];
			int c = lengths[2];
			
			TriangleResult result = TriangleResult.UNKNOWN;
			
			if ((a != b) && (a != c) && (b != c)) {
				result =  TriangleResult.TRIANGLE_NOT_EQUAL;
			} else if ((a == b) && (a == c) && (b == c)) {
				result =  TriangleResult.TRIANGLE_EQUILATERAL;
			} else if ((a == b) && (b != c) && (a != c) || (a == c) && (a != b) && (b != c)
					|| (b == c) && (b != a) && (a != c)) {
				result =  TriangleResult.TRIANGLE_ISOSCELES;
			}
			return result;
			
		} else {
			return TriangleResult.UNKNOWN;
		}
	}

}
