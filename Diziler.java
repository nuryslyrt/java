import java.util.Scanner;

public class Diziler {
	private static Scanner scan;
	
	public static void diziyap(String[] args) {
		scan = new Scanner(System.in);
		System.out.print("boyut girsene\n");
		String[] dizi = new String[scan.nextInt()];
		
		for (int i = 1; i <= dizi.length; i++) {
			System.out.println(i + ".elemaný gir ama string olsun :)\n");
			dizi[i-1] = scan.nextLine();
		}
		
	}
	
	private static void buldum(String[] dizi12) {
		String buluncak;
		scan = new Scanner(System.in);
		System.out.print("ne aramak istersin ?");
		buluncak = scan.nextLine();
		for (int j = 0; j <= (dizi12.length)-1; j++) {
			if (buluncak.equals(dizi12[j])) {
				System.out.println(j + ".eleman benim!\n");				
			}	
		}
			
	}
	
	public static void main(String[] args) {
		diziyap(args);
		buldum(args);	
	}

}
