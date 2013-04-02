
public class Kisi {
	private static String ad, soyad, dogumtarihi;
	
	public static void uyur() {
		System.out.print("Ben uyuyorum!!!");
	}
	public static void gezer() {
		System.out.print("Gezmeye çýktým gidiyorum !!!");
	}
	
	public static class Ogrenci {
		private static String tcno;
		private static String memleket;
		
		public static void dersegirer() {
			System.out.print("dersteyim rahatsýz etme !\n");
		}
		
		public static void kantinegider() {
			System.out.print("kantindeyim geyik yapýyorum.");
		}

		public static String getTcno() {
			return tcno;
		}

		public static void setTcno(String tcno) {
			Ogrenci.tcno = tcno;
		}

		public static String getMemleket() {
			return memleket;
		}

		public void setMemleket(String memleket) {
			Ogrenci.memleket = memleket;
		}

		public String ad;
		public String soyad;
		public String dogumtarihi;

		public void uyur() {
			// TODO Auto-generated method stub
			
		}

		public void gezer() {
			// TODO Auto-generated method stub
			
		}
	}
	
	public static class Hoca {
		private static int sicilno;
		public static class OgretimUyesi {
			private static String unvan;
			
			public static void dersegirer() {
				System.out.print("dersteyim rahatsýz etme !");
			}
			
			public static void sinavyapar() {
				System.out.print("Nihahahhaaaa býrakcam hepinizi !!!");
			}

			public static String getUnvan() {
				return unvan;
			}

			public static void setUnvan(String unvan) {
				OgretimUyesi.unvan = unvan;
			} 
		}
		public static int getSicilno() {
			return sicilno;
		}
		public static void setSicilno(int sicilno) {
			Hoca.sicilno = sicilno;
		}
	}
	
	public static class Memur {
		private static int sicilno;
		private static String birim;
		
		public static void evrakgotur() {
			System.out.print("Evrak götürüyorum.");
		}
		
		public static void evrakgetir() {
			System.out.print("Evrak getiriyorum.");
		}

		public static int getSicilno() {
			return sicilno;
		}

		public static void setSicilno(int sicilno) {
			Memur.sicilno = sicilno;
		}

		public static String getBirim() {
			return birim;
		}

		public static void setBirim(String birim) {
			Memur.birim = birim;
		}
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Ogrenci ogrenciyim = new Kisi.Ogrenci();
		ogrenciyim.ad = "Zinnur";
		ogrenciyim.soyad = "Yeþilyurt";
		ogrenciyim.dogumtarihi = "13.11.1992";
		Ogrenci.setTcno("14767143610");
		ogrenciyim.setMemleket("Ankara");
		
		System.out.println(ogrenciyim.ad);
		System.out.println(ogrenciyim.soyad);
		System.out.println(ogrenciyim.dogumtarihi);
		System.out.println(Ogrenci.getTcno());
		System.out.println(Ogrenci.getMemleket());
		
		((Kisi.Ogrenci) ogrenciyim).uyur();
		((Kisi.Ogrenci) ogrenciyim).gezer();
		Ogrenci.dersegirer();
		Ogrenci.kantinegider();
		
		
		
		// TODO Auto-generated method stub

	}
	public static String getSoyad() {
		return soyad;
	}
	public static void setSoyad(String soyad) {
		Kisi.soyad = soyad;
	}
	public static String getAd() {
		return ad;
	}
	public static void setAd(String ad) {
		Kisi.ad = ad;
	}
	public static String getDogumtarihi() {
		return dogumtarihi;
	}
	public static void setDogumtarihi(String dogumtarihi) {
		Kisi.dogumtarihi = dogumtarihi;
	}

}
