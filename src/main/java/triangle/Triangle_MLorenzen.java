package triangle;

public class Triangle_MLorenzen extends Triangle {

	@Override
	public TriangleResult getTriangleResultForLenghts(int... lengths) {
		
		// Argumente falsch
		if (lengths.length != 3) {
			return TriangleResult.UNKNOWN;
		}
		
		int a = lengths[0];
		int b = lengths[1];
		int c = lengths[2];
	
		//Ausnahmen
		if (a + b < c | b + c < a | c + a < b ){       // kein Dreieck
			return TriangleResult.UNKNOWN;
		}
		for (int i : lengths){                         // negative Länge
			if (i <= 0) return TriangleResult.UNKNOWN;
		}
		
		
		if ((a == b) & (b == c)) { 						// equilateral = gleichschenklig
			return TriangleResult.TRIANGLE_EQUILATERAL;
		} else if (a == b | b == c | a == c ) { 		// isosceles = gleichseitig
			return TriangleResult.TRIANGLE_ISOSCELES;
		} else { 										// not equal = nicht gleich
			return TriangleResult.TRIANGLE_NOT_EQUAL;
		}
		
		//return null;
	}

}
