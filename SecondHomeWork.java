package sortWord;

public class SecondHomeWork {
	
	public static char[] newAlphabet = { 'd', 'e', 'f', 'g', 'a', 'u', 'ğ', 'ı', 'v', 'i', 'j', 'ç', 'k', 'l', 'ü', 'm',
			'n', 'o', 'c', 'ö', 'p', 'r', 's', 'y', 'h', 'b', 'ş', 't', 'z' };
	
	public static void main(String[] args) {
		System.out.println(sortControl(words(), newAlphabet));
		
	}
	
	public static String[] words() {
		
		// create string array called names
		String names[] = { "denizli", "dfff", "ddef", "b" };
		
		return names;
		
	}
	
	public static String[] sortControl(String[] names) {
		String temp = "";
		String[] tempArray = new String[names.length];
		for (int i = 0; i < names.length; i++) {
			for (int j = 0; j < names[i].length(); j++) {
				for (int k = 0; k < newAlphabet.length; k++) {
					
					if (newAlphabet[k] == (names[i].charAt(j))) {
						
					}
				}
				
			}
			tempArray[i] = names[i];
		}
		return tempArray;
		
		// print output array
		// System.out.println("The names in alphabetical order are: ");
		// for (int i = 0; i < n; i++) {
		// System.out.println(names[i]);
		// }
		
	}
	
	/*
	 * public static int findIndex(char temp) {
	 * for (int i = 0; i < newAlphabet.length; i++) {
	 * if (newAlphabet[i] == temp) {
	 * return i;
	 * }
	 * }
	 * return 0;
	 * }
	 */
}
