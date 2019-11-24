import java.util.Scanner;

public class Main {
	public static void main(String argsp[]) {

		float geldbetrag;
		float zinssatz;
		int laufzeit;

		Scanner s = new Scanner(System.in);

		System.out.print("Bitte Geldbetrag eingeben: ");
		geldbetrag = s.nextFloat();

		System.out.print("Bitte Zinssatz eingeben (0,05 = 5%): ");
		zinssatz = s.nextFloat();

		System.out.print("Bitte Jahreslaufzeit eingeben: ");
		laufzeit = s.nextInt();
		s.close();

		for (int i = 0; i < laufzeit; i++) {
			geldbetrag += geldbetrag * zinssatz;
			System.out.println("Wert nach Jahr" + (i + 1) + ": " + geldbetrag);
		}
	}
}