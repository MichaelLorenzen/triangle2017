package triangle;

public class TriangleTR extends Triangle {

	@Override
	public TriangleResult getTriangleResultForLenghts(int... lengths) {
		// TODO Auto-generated method stub

		TriangleResult result = TriangleResult.UNKNOWN;

		// assert lengths.length == 3;
		if (lengths.length != 3) {
			return result;
		}

		for (int i = 0; i < lengths.length; i++) {
			if (lengths[i] <= 0) {
				return result;
			}
		}

		int a = lengths[0];
		int b = lengths[1];
		int c = lengths[2];
		
		result = isTriangle(a, b, c);
		if(result.equals(TriangleResult.UNKNOWN)) {
			return result;
		}
		
		result = isEquilateral(a, b, c);
		if (result.equals(TriangleResult.UNKNOWN)) {
			result = isNotEqual(a, b, c);
			if (result.equals(TriangleResult.UNKNOWN)) {
				result = isIsosceles(a, b, c);
			}
		}

		return result;
	}

	private TriangleResult isEquilateral(int a, int b, int c) {
		if (a == b && b == c) {
			return TriangleResult.TRIANGLE_EQUILATERAL;
		} else {
			return TriangleResult.UNKNOWN;
		}
	}

	private TriangleResult isNotEqual(int a, int b, int c) {
		if (a != b && b != c && c != a) {
			return TriangleResult.TRIANGLE_NOT_EQUAL;
		} else {
			return TriangleResult.UNKNOWN;
		}
	}

	private TriangleResult isIsosceles(int a, int b, int c) {
		if ((a == b && b != c) || (b == c && c != a) || (a == c && c != b)) {
			return TriangleResult.TRIANGLE_ISOSCELES;
		} else {
			return TriangleResult.UNKNOWN;
		}
	}
	
	private TriangleResult isTriangle(int a, int b, int c) {
		if((a+b)>c && (a+c)>b && (b+c)>a) {
			return TriangleResult.TRIANGLE_NOT_EQUAL;
		}
		return TriangleResult.UNKNOWN;
	}

	public static void main(String[] args) {
		TriangleTR tr = new TriangleTR();

		System.out.println(tr.getTriangleResultForLenghts(2, 3, -4));
		System.out.println(tr.getTriangleResultForLenghts(2, 2, 2));
		System.out.println(tr.getTriangleResultForLenghts(5, 3, 8));
		System.out.println(tr.getTriangleResultForLenghts(2, 3, 4));
		System.out.println(tr.getTriangleResultForLenghts(3, 3, 4));
	}

}
