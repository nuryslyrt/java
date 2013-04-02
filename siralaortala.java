
public class siralaortala {

	/**
	 * @param args
	 */
	static int[] BuyuktenKucuge(int[] arr) {
		int i, j, yenideger;
		for (i = 1; i < arr.length; i++) {
			yenideger = arr [i];
			j = i;
			while (j > 0 && arr[j-1] < yenideger) {
				arr[j] = arr[j-1];
				j--;
			}
			arr[j] = yenideger;
		}
		return arr;
	}
	
	static int[] SelectionSort(int[] arr) {
		int i, j, min, temp;
		for(i = 1; i < arr.length; i++) {
			min = arr.length -1;
			for(j = i; j < arr.length; j++){
				if(arr[j] < arr[min]) {
					min = j;
				}
				temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			}
		}
		return arr;
	}
	

	static int[] KucuktenBuyuge(int[] arr) {
		int i, j, temp;
		for (i = 0; i <= arr.length - 1; i++) {
			for (j = 1; j <= arr.length - 1; j++) {
				if(arr[j - 1] > arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
		
	}
	
	static void EnBuyukKim(int[] arr) {
		BuyuktenKucuge(arr);
		System.out.println(arr[0]);
	}
	
	static void EnKucukKim(int[] arr) {
		KucuktenBuyuge(arr);
		System.out.println(arr[0]);
	}
	
	static void Ortalama(int[] arr) {
		int i, temp, ortaladim;
		temp = 0;
		for(i = 0; i <= arr.length - 1; i++) {
			temp = temp + arr[i];	
		}
		System.out.println(ortaladim = temp / arr.length);
	}
	
	
	public static void main(String[] args) {
		int dizi[] = {3, 7, 51, 48, 9, 5, 1, 13, 11, 88};
		
		System.out.println("büyükten küçüðe sýralý hali:\n");
		for(int i = 0; i < dizi.length; i++ ) {
			System.out.println(BuyuktenKucuge(dizi)[i]);
		}
		
		System.out.println("Küçükten büyüðe sýralý hali:\n");
		for(int i = 0; i < dizi.length; i++ ) {
			System.out.println(KucuktenBuyuge(dizi)[i]);
		}
		
		System.out.print("Dizinin ortalamasý :\n");
		Ortalama(dizi);
		
		System.out.print("Dizinin en büyük elemaný: \n");
		EnBuyukKim(dizi);
		
		System.out.print("Dizinin en küçük elemaný: \n");
		EnKucukKim(dizi);
		// TODO Auto-generated method stub

	}

}
