package bd.edu.diu.substitution;

import java.util.Scanner;

public class MultipleSubstitutionBasic {

    // encryption process round 1
    public String substitute(String normalText) {
        String encryptedText = "";
        for (int i = 0; i < normalText.length(); i++) {
            encryptedText += (char) (normalText.charAt(i) + 5);
        }
        return encryptedText;
    }

    //encryption process round 2
    public String substitute2(String normalText) {
        String encryptedText = "";
        for (int i = 0; i < normalText.length(); i++) {
            encryptedText += (char) (normalText.charAt(i) + 10);
        }
        return encryptedText;
    }

    // decryption process round 1
    public String unsubstitute(String encryptedText) {
        String decryptedText = "";
        for (int i = 0; i < encryptedText.length(); i++) {
            decryptedText += (char) (encryptedText.charAt(i) - 5);
        }

        return decryptedText;
    }

    // decryption process round 2
    public String unsubstitute2(String encryptedText) {
        String decryptedText = "";
        for (int i = 0; i < encryptedText.length(); i++) {
            decryptedText += (char) (encryptedText.charAt(i) - 10);
        }

        return decryptedText;
    }

    // Display the result
    public void show(String userText, String encrypted, String encrypted2, String decrypted, String decrypted2) {
        System.out.println("\n===== After process =====");
        System.out.println("=== Encryption ===");
        System.out.println("User Text: " + userText);
        System.out.println("Encrypted 1 Text: " + encrypted);
        System.out.println("Encrypted 2 Text: " + encrypted2);
        System.out.println("\n=== Decryption ===");
        System.out.println("Decrypted 1 Text: " + decrypted);
        System.out.println("Decrypted 2 Text: " + decrypted2);
    }

    public static void main(String args[]) {
        MultipleSubstitutionBasic multipleSubstitution = new MultipleSubstitutionBasic();

        System.out.print("Please enter the text to encrypted: ");
        Scanner scanner = new Scanner(System.in);
        String userText = scanner.nextLine();

        // Performing encryption
        String encrypted = multipleSubstitution.substitute(userText);
        String encrypted2 = multipleSubstitution.substitute2(encrypted);

        // Performing decryption
        String decrypted = multipleSubstitution.unsubstitute2(encrypted2);
        String decrypted2 = multipleSubstitution.unsubstitute(decrypted);

        multipleSubstitution.show(userText, encrypted, encrypted2, decrypted, decrypted2);
    }

}
