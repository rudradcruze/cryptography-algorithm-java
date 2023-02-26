package bd.edu.diu.substitution;

import java.sql.Struct;
import java.util.Scanner;

public class SimpleSubstitution {

    // Normal to encryption
    public String substitution(String normalText) {
        String encrypted = "";
        for(int i=0; i<normalText.length(); i++) {
            encrypted += (char)(normalText.charAt(i) + 5);
        }
        return encrypted;
    }

    // encryption to decryption
    public String unSubstitution(String encryptedText) {
        String plainText = "";
        for(int i=0; i<encryptedText.length(); i++) {
            plainText += (char)(encryptedText.charAt(i) - 5);
        }
        return plainText;
    }

    // Display the result
    public void show(String userText, String encrypted, String decrypted) {
        System.out.println("\n===== After process =====");
        System.out.println("User Text: " + userText);
        System.out.println("Encrypted Text: " + encrypted);
        System.out.println("Decrypted Text: " + decrypted);
    }

    public static void main(String[] args) {
        SimpleSubstitution simpleSubstitution = new SimpleSubstitution();

        System.out.print("Please enter the text to encrypted: ");
        Scanner scanner = new Scanner(System.in);
        String userText = scanner.nextLine();

        // Performing encryption
        String encrypted = simpleSubstitution.substitution(userText);
        String decrypted = simpleSubstitution.unSubstitution(encrypted);

        simpleSubstitution.show(userText, encrypted, decrypted);
    }
}
