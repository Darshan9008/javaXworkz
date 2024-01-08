package learning_programs;

import java.util.Scanner;

public class MessageEncryptor {
	    public static void main(String[] args) {
	        // Read input from the user
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the message to encrypt:");
	        String inputMessage = scanner.nextLine();
	        System.out.println("Enter the encryption key:");
	        String encryptionKey = scanner.nextLine();
	        scanner.close();

	        // Encrypt the message
	        String encryptedMessage = encrypt(inputMessage, encryptionKey);

	        // Display the encrypted message
	        System.out.println("Encrypted Message:");
	        System.out.println(encryptedMessage);
	    }

	    public static String encrypt(String message, String key) {
	        StringBuilder encrypted = new StringBuilder();

	        for (int i = 0; i < message.length(); i++) {
	            char currentChar = message.charAt(i);

	            if (Character.isLetter(currentChar)) {
	                // Encrypt only letters, leave other characters unchanged
	                char encryptedChar = (char) (currentChar + key.length());

	                // Handle 'z' wrapping around to 'a' and 'Z' wrapping around to 'A'
	                if ((Character.isLowerCase(currentChar) && encryptedChar > 'z') ||
	                    (Character.isUpperCase(currentChar) && encryptedChar > 'Z')) {
	                    encryptedChar = (char) (encryptedChar - 26);
	                }

	                encrypted.append(encryptedChar);
	            } else {
	                // Leave non-letter characters unchanged
	                encrypted.append(currentChar);
	            }
	        }

	        return encrypted.toString();
	    }
	}



