package bd.edu.diu.substitution;

import java.util.Scanner;

public class AssignmentMultipleSubstitution {

    /*
        Substitution process 1
        Using table 1
        | A | B | C | D | E | F | G | H | I | J | K | L | M | N | O | P | Q | R | S | T | U | V | W | X | Y | Z |
        |---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|
        | Y | O | N | Q | Z | H | V | F | J | I | X | P | R | C | B | L | D | M | U | W | S | G | T | K | A | E |
     */
    public String substitutionTable1(String normalText){
        String encrypted = "";
        for(int i = 0; i < normalText.length(); i++) {
            char c = normalText.charAt(i);
            switch(c){
                case 'A':
                    encrypted += "Y";
                    break;
                case 'a':
                    encrypted += "y";
                    break;
                case 'B':
                    encrypted += "O";
                    break;
                case 'b':
                    encrypted += "o";
                    break;
                case 'C':
                    encrypted += "N";
                    break;
                case 'c':
                    encrypted += "n";
                    break;
                case 'D':
                    encrypted += "Q";
                    break;
                case 'd':
                    encrypted += "q";
                    break;
                case 'E':
                    encrypted += "Z";
                    break;
                case 'e':
                    encrypted += "z";
                    break;
                case 'F':
                    encrypted += "H";
                    break;
                case 'f':
                    encrypted += "h";
                    break;
                case 'G':
                    encrypted += "V";
                    break;
                case 'g':
                    encrypted += "v";
                    break;
                case 'H':
                    encrypted += "F";
                    break;
                case 'h':
                    encrypted += "f";
                    break;
                case 'I':
                    encrypted += "J";
                    break;
                case 'i':
                    encrypted += "j";
                    break;
                case 'J':
                    encrypted += "I";
                    break;
                case 'j':
                    encrypted += "i";
                    break;
                case 'K':
                    encrypted += "X";
                    break;
                case 'k':
                    encrypted += "x";
                    break;
                case 'L':
                    encrypted += "P";
                    break;
                case 'l':
                    encrypted += "p";
                    break;
                case 'M':
                    encrypted += "R";
                    break;
                case 'm':
                    encrypted += "r";
                    break;
                case 'N':
                    encrypted += "C";
                    break;
                case 'n':
                    encrypted += "c";
                    break;
                case 'O':
                    encrypted += "B";
                    break;
                case 'o':
                    encrypted += "b";
                    break;
                case 'P':
                    encrypted += "L";
                    break;
                case 'p':
                    encrypted += "l";
                    break;
                case 'Q':
                    encrypted += "D";
                    break;
                case 'q':
                    encrypted += "d";
                    break;
                case 'R':
                    encrypted += "M";
                    break;
                case 'r':
                    encrypted += "m";
                    break;
                case 'S':
                    encrypted += "U";
                    break;
                case 's':
                    encrypted += "u";
                    break;
                case 'T':
                    encrypted += "W";
                    break;
                case 't':
                    encrypted += "w";
                    break;
                case 'U':
                    encrypted += "S";
                    break;
                case 'u':
                    encrypted += "s";
                    break;
                case 'V':
                    encrypted += "G";
                    break;
                case 'v':
                    encrypted += "g";
                    break;
                case 'W':
                    encrypted += "T";
                    break;
                case 'w':
                    encrypted += "t";
                    break;
                case 'X':
                    encrypted += "K";
                    break;
                case 'x':
                    encrypted += "k";
                    break;
                case 'Y':
                    encrypted += "A";
                    break;
                case 'y':
                    encrypted += "a";
                    break;
                case 'Z':
                    encrypted += "E";
                    break;
                case 'z':
                    encrypted += "e";
                    break;
                default:
                    encrypted += c;
            }
        }

        return encrypted;
    }

    /*
        Substitution process 2
        Using table 2
        | A | B | C | D | E | F | G | H | I | J | K | L | M | N | O | P | Q | R | S | T | U | V | W | X | Y | Z |
        |---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|
        | M | P | K | N | W | J | T | O | U | F | C | V | A | D | H | B | Y | X | Z | G | I | L | E | R | Q | S |
     */
    public String substitutionTable2(String normalText) {
        String encrypted = "";
        for(int i = 0; i < normalText.length(); i++) {
            char c = normalText.charAt(i);
            switch(c){
                case 'A':
                    encrypted += "M";
                    break;
                case 'a':
                    encrypted += "m";
                    break;
                case 'B':
                    encrypted += "P";
                    break;
                case 'b':
                    encrypted += "p";
                    break;
                case 'C':
                    encrypted += "K";
                    break;
                case 'c':
                    encrypted += "k";
                    break;
                case 'D':
                    encrypted += "N";
                    break;
                case 'd':
                    encrypted += "n";
                    break;
                case 'E':
                    encrypted += "W";
                    break;
                case 'e':
                    encrypted += "w";
                    break;
                case 'F':
                    encrypted += "J";
                    break;
                case 'f':
                    encrypted += "j";
                    break;
                case 'G':
                    encrypted += "T";
                    break;
                case 'g':
                    encrypted += "t";
                    break;
                case 'H':
                    encrypted += "O";
                    break;
                case 'h':
                    encrypted += "o";
                    break;
                case 'I':
                    encrypted += "U";
                    break;
                case 'i':
                    encrypted += "u";
                    break;
                case 'J':
                    encrypted += "F";
                    break;
                case 'j':
                    encrypted += "f";
                    break;
                case 'K':
                    encrypted += "C";
                    break;
                case 'k':
                    encrypted += "c";
                    break;
                case 'L':
                    encrypted += "V";
                    break;
                case 'l':
                    encrypted += "v";
                    break;
                case 'M':
                    encrypted += "A";
                    break;
                case 'm':
                    encrypted += "a";
                    break;
                case 'N':
                    encrypted += "D";
                    break;
                case 'n':
                    encrypted += "d";
                    break;
                case 'O':
                    encrypted += "H";
                    break;
                case 'o':
                    encrypted += "h";
                    break;
                case 'P':
                    encrypted += "B";
                    break;
                case 'p':
                    encrypted += "b";
                    break;
                case 'Q':
                    encrypted += "Y";
                    break;
                case 'q':
                    encrypted += "y";
                    break;
                case 'R':
                    encrypted += "X";
                    break;
                case 'r':
                    encrypted += "x";
                    break;
                case 'S':
                    encrypted += "Z";
                    break;
                case 's':
                    encrypted += "z";
                    break;
                case 'T':
                    encrypted += "G";
                    break;
                case 't':
                    encrypted += "g";
                    break;
                case 'U':
                    encrypted += "I";
                    break;
                case 'u':
                    encrypted += "i";
                    break;
                case 'V':
                    encrypted += "L";
                    break;
                case 'v':
                    encrypted += "l";
                    break;
                case 'W':
                    encrypted += "E";
                    break;
                case 'w':
                    encrypted += "e";
                    break;
                case 'X':
                    encrypted += "R";
                    break;
                case 'x':
                    encrypted += "r";
                    break;
                case 'Y':
                    encrypted += "Q";
                    break;
                case 'y':
                    encrypted += "q";
                    break;
                case 'Z':
                    encrypted += "S";
                    break;
                case 'z':
                    encrypted += "s";
                    break;
                default:
                    encrypted += c;
            }
        }
        return encrypted;
    }

    /*
        Substitution process 3
        Using table 3
        | A | B | C | D | E | F | G | H | I | J | K | L | M | N | O | P | Q | R | S | T | U | V | W | X | Y | Z |
        |---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|
        | I | O | T | H | P | W | N | D | A | R | V | Y | Q | G | B | E | M | J | X | C | Z | K | F | S | L | U |
     */
    public String substitutionTable3(String normalText) {
        String encrypted = "";
        for(int i = 0; i < normalText.length(); i++) {
            char c = normalText.charAt(i);
            switch(c){
                case 'A'    :
                    encrypted += "I";
                    break;
                case 'a':
                    encrypted += "i";
                    break;
                case 'B':
                    encrypted += "O";
                    break;
                case 'b':
                    encrypted += "o";
                    break;
                case 'C':
                    encrypted += "T";
                    break;
                case 'c':
                    encrypted += "t";
                    break;
                case 'D':
                    encrypted += "H";
                    break;
                case 'd':
                    encrypted += "h";
                    break;
                case 'E':
                    encrypted += "P";
                    break;
                case 'e':
                    encrypted += "p";
                    break;
                case 'F':
                    encrypted += "W";
                    break;
                case 'f':
                    encrypted += "w";
                    break;
                case 'G':
                    encrypted += "N";
                    break;
                case 'g':
                    encrypted += "n";
                    break;
                case 'H':
                    encrypted += "D";
                    break;
                case 'h':
                    encrypted += "d";
                    break;
                case 'I':
                    encrypted += "A";
                    break;
                case 'i':
                    encrypted += "a";
                    break;
                case 'J':
                    encrypted += "R";
                    break;
                case 'j':
                    encrypted += "r";
                    break;
                case 'K':
                    encrypted += "V";
                    break;
                case 'k':
                    encrypted += "v";
                    break;
                case 'L':
                    encrypted += "Y";
                    break;
                case 'l':
                    encrypted += "y";
                    break;
                case 'M':
                    encrypted += "Q";
                    break;
                case 'm':
                    encrypted += "q";
                    break;
                case 'N':
                    encrypted += "G";
                    break;
                case 'n':
                    encrypted += "g";
                    break;
                case 'O':
                    encrypted += "B";
                    break;
                case 'o':
                    encrypted += "b";
                    break;
                case 'P':
                    encrypted += "E";
                    break;
                case 'p':
                    encrypted += "e";
                    break;
                case 'Q':
                    encrypted += "M";
                    break;
                case 'q':
                    encrypted += "m";
                    break;
                case 'R':
                    encrypted += "J";
                    break;
                case 'r':
                    encrypted += "j";
                    break;
                case 'S':
                    encrypted += "X";
                    break;
                case 's':
                    encrypted += "x";
                    break;
                case 'T':
                    encrypted += "C";
                    break;
                case 't':
                    encrypted += "c";
                    break;
                case 'U':
                    encrypted += "Z";
                    break;
                case 'u':
                    encrypted += "z";
                    break;
                case 'V':
                    encrypted += "K";
                    break;
                case 'v':
                    encrypted += "k";
                    break;
                case 'W':
                    encrypted += "F";
                    break;
                case 'w':
                    encrypted += "f";
                    break;
                case 'X':
                    encrypted += "S";
                    break;
                case 'x':
                    encrypted += "s";
                    break;
                case 'Y':
                    encrypted += "L";
                    break;
                case 'y':
                    encrypted += "l";
                    break;
                case 'Z':
                    encrypted += "U";
                    break;
                case 'z':
                    encrypted += "u";
                    break;
                default:
                    encrypted += c;
            }
        }
        return encrypted;
    }

    /*
        Substitution process 4
    */
    public String substitute(String normalText) {
        String encryptedText = "";
        for (int i = 0; i < normalText.length(); i++) {
            encryptedText += (char) (normalText.charAt(i) + 5);
        }
        return encryptedText;
    }

    /*
        Substitution process 5
    */
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

    public void show(String userText, String encrypted, String encrypted2, String encrypted3, String encrypted4, String encrypted5, String decrypted, String decrypted2, String decrypted3, String decrypted4, String decrypted5) {
        System.out.println("\n===== After process =====");
        System.out.println("=== Encryption ===");
        System.out.println("User Text: " + userText);
        System.out.println("Encrypted 1 Text: " + encrypted);
        System.out.println("Encrypted 2 Text: " + encrypted2);
        System.out.println("Encrypted 3 Text: " + encrypted3);
        System.out.println("Encrypted 4 Text: " + encrypted4);
        System.out.println("Encrypted 5 Text: " + encrypted5);
        System.out.println("\n=== Decryption ===");
        System.out.println("Decrypted 1 Text: " + decrypted);
        System.out.println("Decrypted 2 Text: " + decrypted2);
        System.out.println("Decrypted 3 Text: " + decrypted3);
        System.out.println("Decrypted 4 Text: " + decrypted4);
        System.out.println("Decrypted 5 Text: " + decrypted5);
    }

    public static void main(String[] args) {
        AssignmentMultipleSubstitution assmultisub = new AssignmentMultipleSubstitution();

        System.out.print("Please enter the text to encrypted: ");
        Scanner scanner = new Scanner(System.in);
        String userText = scanner.nextLine();

        // Performing Encryption
        String encrypted = assmultisub.substitutionTable1(userText);
        String encrypted2 = assmultisub.substitute(encrypted);
        String encrypted3 = assmultisub.substitutionTable3(encrypted2);
        String encrypted4 = assmultisub.substitute2(encrypted3);
        String encrypted5 = assmultisub.substitutionTable2(encrypted4);

        // Performing Decryption
        String decrypted = assmultisub.substitutionTable2(encrypted5);
        String decrypted2 = assmultisub.unsubstitute2(decrypted);
        String decrypted3 = assmultisub.substitutionTable3(decrypted2);
        String decrypted4 = assmultisub.unsubstitute(decrypted3);
        String decrypted5 = assmultisub.substitutionTable1(decrypted4);

        assmultisub.show(userText, encrypted, encrypted2, encrypted3, encrypted4, encrypted5, decrypted, decrypted2, decrypted3, decrypted4, decrypted5);
    }

}
