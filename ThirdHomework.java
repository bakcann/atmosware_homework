package palindromeOfNumberOfTypeString;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ThirdHomework {
	
	public static String scanNumber() {
		Scanner klavye = new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
		String number = klavye.nextLine();
		
		Pattern p = Pattern.compile("[^0-9 ]", Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(number);
		boolean b = m.find();
		
		if (b) {
			System.out.println("Lutfen sayi giriniz");
		}
		// klavye.close();
		return number;
	}
	
	public static String stringNumber = scanNumber();
	
	public static void main(String[] args) {
		
		System.out.println("En yakin palindrom sayi : " + nearestPalindromic(stringNumber));
		numberToBeAdded(stringNumber);
		
		// System.out.println("Eklenmesi gereken sayi : " +
		// numberToBeAdded(scanNumber()) + "En yakin palindrom : "
		// + numberToBeAdded(nearestPalindromic(scanNumber())));
	}
	
	public static String nearestPalindromic(String number) {
		int order = (int) Math.pow(10, number.length() / 2);
		Long ans = Long.valueOf(new String(number));
		Long noChange = mirror(ans);
		Long larger = mirror((ans / order) * order + order + 1);
		Long smaller = mirror((ans / order) * order - 1);
		if (noChange > ans) {
			larger = (long) Math.min(noChange, larger);
		} else if (noChange < ans) {
			smaller = (long) Math.max(noChange, smaller);
		}
		return String.valueOf(ans - smaller >= larger - ans ? smaller : larger);
	}
	
	public static void numberToBeAdded(String numberAdd) {
		
		Integer result = ((Integer.parseInt(nearestPalindromic(numberAdd))) - (Integer.parseInt(stringNumber)));
		numberAdd = String.valueOf(result);
		System.out.println("Eklenmesi gereken rakam = " + numberAdd);
	}
	
	static Long mirror(Long ans) {
		char[] a = String.valueOf(ans).toCharArray();
		int i = 0;
		int j = a.length - 1;
		while (i < j) {
			a[j--] = a[i++];
		}
		return Long.valueOf(new String(a));
	}
	
}
