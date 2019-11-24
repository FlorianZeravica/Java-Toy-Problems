import java.util.Scanner;

public class Main {
	public static void main(String argsp[]) {

		int sum = 0;
		String userInput;
		Scanner s = new Scanner(System.in);
		System.out.print("Bitte Zahl zwischen 0 und 10000 eingeben: ");

		do {
			userInput = String.valueOf(s.next());
			if (tryParseInt(userInput)) {

				if (Integer.parseInt(userInput) > 0 && Integer.parseInt(userInput) < 10000) {
					System.out.print("Quersumme: ");

					for (int i = 0; i < userInput.length(); i++) {
						System.out.print(userInput.charAt(i));
						sum += (int) (userInput.charAt(i) - '0');

						if (i < userInput.length() - 1) {
							System.out.print(" + ");
						}
					}
					System.out.println(" = " + sum);
					s.close();
				} else {
					System.out.println("Dies ist keine gültige Eingabe, bitte eine gültige Zahl eingeben:");
				}
			} else {
				System.out.println("Dies ist keine gültige Eingabe, bitte eine gültige Zahl eingeben:");
			}

		} while (!tryParseInt(userInput) || Integer.parseInt(userInput) <= 0 || Integer.parseInt(userInput) >= 10000);
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