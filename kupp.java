
public class kupp {
	static void cikti (int n) {
		String s;
		int i;
		for (i = 1; i <= n; i = i + 1) {
			s = "Kup (" + i + ") = " + kup(i);
			System.out.println(s);
		}
	}
	
	static int kup(int n) {
		return n * n * n;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		cikti(9);
		// TODO Auto-generated method stub

	}

}
