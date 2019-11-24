public class Main {
	public static void main(String[] args) {
		int userNumber;
		int aiNumber;
		do {
			userNumber = (int) (Math.floor(Math.random() * 6) + 1);
			aiNumber = (int) (Math.floor(Math.random() * 6) + 1);
		} while (userNumber < aiNumber);
	}
}