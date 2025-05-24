import java.util.Random;

public class PasswordGenerator {
public static void main(String[] args) {
int passwordLength = 12; // length of the password
String password = generatePassword(passwordLength);
System.out.println("Generated password: " + password);
}

/**
* Generates a random password of the given length
* @param length the length of the password to generate
* @return a random password of the given length
*/
public static String generatePassword(int length) {
String lowercaseLetters = "abcdefghijklmnopqrstuvwxyz";
String uppercaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
String numbers = "0123456789";
String specialCharacters = "!@#$%^&*()-+?_=,<>/";

String allCharacters = lowercaseLetters + uppercaseLetters + numbers + specialCharacters;
Random random = new Random();

StringBuilder password = new StringBuilder(length);

// generate random characters for the password
for (int i = 0; i < length; i++) {
int randomIndex = random.nextInt(allCharacters.length());
password.append(allCharacters.charAt(randomIndex));
}

return password.toString();
}
}