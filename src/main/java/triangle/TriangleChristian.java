package triangle;

public class TriangleChristian extends Triangle {

	int a;
	int b;
	int c;

	@Override
	public TriangleResult getTriangleResultForLenghts(int... lengths) {

		if (lengths.length != 3) {
			return TriangleResult.UNKNOWN;
		}

		a = lengths[0];
		b = lengths[1];
		c = lengths[2];
		
		for (int i : lengths) {
			if (i <= 0) {
				return TriangleResult.UNKNOWN;
			}
		}

		if ((a == b) & (a == c)) {
			return TriangleResult.TRIANGLE_EQUILATERAL;
		} else if ((a == c) & !(b == c)) {
			return TriangleResult.TRIANGLE_ISOSCELES;
		} else if ((a == b) & !(a == c)) {
			return TriangleResult.TRIANGLE_ISOSCELES;
		} else if (!(a == b) & !(a == c) & !(b == c)) {
			return TriangleResult.TRIANGLE_NOT_EQUAL;
		} else {
			return TriangleResult.UNKNOWN;
		}

	}

}
