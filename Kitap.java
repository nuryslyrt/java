
public class Kitap {

	String kitap_adi;
	String yazar_adi;
	int sayfa_sayisi;
	
	public int sayfaSayisiniVer() {
		return sayfa_sayisi;
	}
	public void kitabiGoruntule() {
		System.out.println("\nRapor");
		System.out.println("********");
		System.out.println("Kitap Adi: " + kitap_adi);
		System.out.println("Yazari: " + yazar_adi);
		System.out.println("Sayfa Sayisi: " + sayfa_sayisi);
		System.out.println("\n");
	}
	public static void main(String[] args) {
		Kitap kitap1 = new Kitap();
		Kitap kitap2 = new Kitap();
		kitap1.kitap_adi = "Puslu Kitalar Atlasi";
		kitap1.sayfa_sayisi = 238;
		kitap1.yazar_adi = "Ihsan Oktay Anar";
		kitap2.kitap_adi = "Vadideki Zambak";
		kitap2.sayfa_sayisi = 307;
		kitap2.yazar_adi = "Balzac";
		kitap1.kitabiGoruntule();
		kitap2.kitabiGoruntule();
	}

}
