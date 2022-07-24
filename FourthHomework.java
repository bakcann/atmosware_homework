package homework4;

public class FourthHomework {
	
	public static void main(String[] args) {
		System.out.println(siraliAltKumeVarMi(new int[] { 1, 3, 1, 4, 13 }, 7));
	}
	
	public static boolean siraliAltKumeVarMi(int[] sayilar, int ulasilacakToplam) {
		int toplam;
		if (sayilar.length <= 1) {
			return false;
		}
		for (int i = 0; i < sayilar.length; i++) {
			toplam = sayilar[i];
			for (int j = 0; i + j < sayilar.length; j++) {
				toplam += sayilar[j];
				if (toplam == ulasilacakToplam) {
					return true;
				}
				
			}
			
		}
		return false;
	}
}
