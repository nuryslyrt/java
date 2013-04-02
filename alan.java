import javax.swing.*;

class alan {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double sonuc;
		String yrcp = JOptionPane.showInputDialog(null, "Cemberin yaricapini giriniz:");
		String mesaj = yrcp + "yaricapli cemberim alani" + sonuc;
		
		System.exit(0);
		// TODO Auto-generated method stub

	}
	
	public static double alanhesapla(double yaricap) {
		double alan = Math.pow(yaricap, 2) * 3.14;
		return alan;
	}

}
