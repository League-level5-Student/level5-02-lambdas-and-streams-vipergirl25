package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		printCustomMessage((s)->{
			for(int i = s.length()-1; i >-1; i--) {
				System.out.print(s.charAt(i));
			}
		}, "hello");
		
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage((s)->{
			String newthing = "";
			String charc;
			for(int i = 0; i<s.length(); i++) {
				charc = "";
				if (i%2==0) {
					charc = s.substring(i, i+1).toUpperCase();
				}else {
					charc = s.substring(i, i+1).toLowerCase();
				}
				newthing+=charc;
			}
			System.out.println("\n" + newthing);
		}, "OncE UPon a TiME");
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		printCustomMessage((s)->{
			String newthing = "";
			for(int i = 0; i<s.length(); i++) {
				newthing += s.charAt(i) + ".";
			}
			System.out.println(newthing);
		}, "hello");
		
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
		printCustomMessage((s)->{
			String newthing = "";
			for(int i = 0; i<s.length(); i++) {
				boolean truth = isVowel(s.charAt(i));
				if(truth == false) {
					newthing+=s.charAt(i);
				}else {
					
				}
			}
			System.out.println(newthing);
		},"lots of vowels yay");
	
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
	public static boolean isVowel(Character c) {
		String a = Character.toString(c);
		if(a.equalsIgnoreCase("a") | a.equalsIgnoreCase("A") | a.equalsIgnoreCase("e") | a.equalsIgnoreCase("E") | a.equalsIgnoreCase("i")| a.equalsIgnoreCase("I")| a.equalsIgnoreCase("o")| a.equalsIgnoreCase("O")| a.equalsIgnoreCase("u")| a.equalsIgnoreCase("U")) {
			return true;
		}else {
			return false;
		}
	}
}
	
