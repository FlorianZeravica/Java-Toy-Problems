import java.util.Scanner;

public class Main {

	public static void main(String argsp[]) {

		String userInput;
		Scanner s = new Scanner(System.in);
		System.out.println("Bitte das zu überprüfende Jahr eingeben:");

		do {
			userInput = String.valueOf(s.next());
			if (tryParseInt(userInput)) {
				int userNumber = Integer.parseInt(userInput);
				isSchaltjahr(userNumber);
				s.close();
			} else {
				System.out.println("Dies ist keine gültige Eingabe, bitte ein Jahr eingeben:");
			}
		} while (!tryParseInt(userInput));
	}

	static boolean isSchaltjahr(int year) {
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
			System.out.println("Das Jahr " + year + " ist ein Schaltjahr");
			return true;
		} else {
			System.out.println("Das Jahr " + year + " ist kein Schaltjahr");
			return false;
		}
	}

	static boolean tryParseInt(String userInput) {
		try {
			Integer.parseInt(userInput);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}