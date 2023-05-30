package bd.edu.diu.assignment;

import java.util.Scanner;

public class SubstitutionCipher {

    // Keys
    public static final String KEY_SEQUENCE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String SUB_KEY_1 = "YONQZHVFJIXPRCBLDMUWSGTKAE";
    public static final String SUB_KEY_2 = "MPKNWJTOUFCVADHBYXZGILERQS";

    // Encryption Each Round ->
    public static StringBuilder round(String text, String key_sequence, String key) {
        StringBuilder cypherText = new StringBuilder();

        for(char c : text.toUpperCase().toCharArray()) {
            if (Character.isLetter(c)) {
                int index = key_sequence.indexOf(c);
                cypherText.append(key.charAt(index));
            } else {
                cypherText.append(c);
            }
        }
        System.out.println("Encryption: " + cypherText);
        return cypherText;
    }

    // Multiple Encryption -> Using two keys.
    public static String encrypt(String plainText) {

        StringBuilder cypherText1 = round(plainText, KEY_SEQUENCE, SUB_KEY_1);
        StringBuilder cypherText2 = round(cypherText1.toString(), KEY_SEQUENCE, SUB_KEY_2);

        return cypherText2.toString();
    }

    // Multiple decryption -> Using two keys.
    public static String decrypt(String plainText) {

        StringBuilder cypherText1 = round(plainText, SUB_KEY_2, KEY_SEQUENCE);
        StringBuilder cypherText2 = round(cypherText1.toString(), SUB_KEY_1, KEY_SEQUENCE);

        return cypherText2.toString();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the text to encryption: ");
        String plainText = scanner.nextLine();
        String encrypt = encrypt(plainText); // encrypt the plain text -> two times
        System.out.println("\n ------ \n");
        String decrypt = decrypt(encrypt); // decrypt the cipher text -> two times

    }
}
