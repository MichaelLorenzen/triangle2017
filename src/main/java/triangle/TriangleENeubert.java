package triangle;

public class TriangleENeubert extends Triangle {

	/**
	 * This implementation does not really know anything about triangles and always
	 * returns unknown
	 */
	@Override
	public TriangleResult getTriangleResultForLenghts(final int... lengths) {

		if (lengths.length == 3) {

			for (int i = 0; i < lengths.length; i++) {
				if ((lengths[i] == lengths[(i + 1) % 3]) && (lengths[i] != lengths[(i + 2) % 3])
						&& (lengths[(i + 1) % 3] != lengths[(i + 2) % 3])) {
					return TriangleResult.TRIANGLE_ISOSCELES;
				}
			}

			if ((lengths[0] == lengths[1]) || (lengths[0] == lengths[2]) || (lengths[1] == lengths[2])) {
				return TriangleResult.TRIANGLE_EQUILATERAL;
			}
			return TriangleResult.TRIANGLE_NOT_EQUAL;

		} else {
			return TriangleResult.UNKNOWN;
		}

	}

}
