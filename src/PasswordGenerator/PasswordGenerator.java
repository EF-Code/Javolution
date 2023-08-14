import java.security.SecureRandom;
import java.util.Scanner;

public class PasswordGenerator {
	private static final String CHAR_LOWER = "abcdefghijklmnopqrstuvwxyz";
	private static final String CHAR_UPPER = CHAR_LOWER.toUpperCase();
	private static final String DIGIT = "0123456789";
	private static final String SPECIAL = "!@#$%^&*()-_=+[]{}|;:,.<>?";

	private static final String PASSWORD_CHARS = CHAR_LOWER + CHAR_UPPER + DIGIT + SPECIAL;
	private static SecureRandom random = new SecureRandom();

	public static String generateRandomPassword(int length) {
		StringBuilder password = new StringBuilder();
		for (int i = 0; i < length; i++) {
			int randomIndex = random.nextInt(PASSWORD_CHARS.length());
			char randomChar = PASSWORD_CHARS.charAt(randomIndex);
			password.append(randomChar);

		}
		return password.toString();

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int passwordLength;
		System.out.println("Type the password length: ");
		passwordLength = scanner.nextInt();
		String generatedPassword = generateRandomPassword(passwordLength);
		System.out.println("Generated Password: " + generatedPassword);

	}
}