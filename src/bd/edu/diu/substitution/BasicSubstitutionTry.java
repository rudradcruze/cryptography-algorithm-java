package bd.edu.diu.substitution;

import java.util.Scanner;

// This is a basic substitution table 1 program
// Author: Francis Rudra D Cruze
// Email: rudra16-563@diu.edu.bd
public class BasicSubstitutionTry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("PLease enter a text you want to encrypt: ");
        String normalText = scanner.nextLine();
        String encryptedText = substitution(normalText);
        System.out.println(encryptedText);
        String decryptedText = substitution(encryptedText);
        System.out.println(decryptedText);
    }

    public static String substitution(String normalText){
        String output = "";
        for(int i=0;i<normalText.length();i++){
            char c = normalText.charAt(i);
            switch(c){
                case 'A':
                    output = output +"Z";
                    break;
                case 'a':
                    output = output +"z";
                    break;
                case 'B':
                    output += "Y";
                    break;
                case 'b':
                    output += "y";
                    break;
                case 'C':
                    output = output +"X";
                    break;
                case 'c':
                    output = output +"x";
                    break;
                case 'D':
                    output = output +"W";
                    break;
                case 'd':
                    output = output +"w";
                    break;
                case 'E':
                    output = output +"V";
                    break;
                case 'e':
                    output = output +"v";
                    break;
                case 'F':
                    output = output +"U";
                    break;
                case 'f':
                    output = output +"u";
                    break;
                case 'G':
                    output = output +"T";
                    break;
                case 'g':
                    output = output +"t";
                    break;
                case 'H':
                    output = output +"S";
                    break;
                case 'h':
                    output = output +"s";
                    break;
                case 'I':
                    output = output +"R";
                    break;
                case 'i':
                    output = output +"r";
                    break;
                case 'J':
                    output = output +"Q";
                    break;
                case 'j':
                    output = output +"q";
                    break;
                case 'K':
                    output = output +"P";
                    break;
                case 'k':
                    output = output +"p";
                    break;
                case 'L':
                    output = output +"O";
                    break;
                case 'l':
                    output = output +"o";
                    break;
                case 'M':
                    output = output +"n";
                    break;
                case 'm':
                    output = output +"n";
                    break;
                case 'N':
                    output = output +"M";
                    break;
                case 'n':
                    output = output +"m";
                    break;
                case 'O':
                    output = output +"L";
                    break;
                case 'o':
                    output = output +"l";
                    break;
                case 'P':
                    output = output +"K";
                    break;
                case 'p':
                    output = output +"k";
                    break;
                case 'Q':
                    output = output +"J";
                    break;
                case 'q':
                    output = output +"j";
                    break;
                case 'R':
                    output = output +"I";
                    break;
                case 'r':
                    output = output +"i";
                    break;
                case 'S':
                    output = output +"H";
                    break;
                case 's':
                    output = output +"h";
                    break;
                case 'T':
                    output = output +"G";
                    break;
                case 't':
                    output = output +"g";
                    break;
                case 'U':
                    output = output +"F";
                    break;
                case 'u':
                    output = output +"f";
                    break;
                case 'V':
                    output = output +"E";
                    break;
                case 'v':
                    output = output +"e";
                    break;
                case 'W':
                    output = output +"D";
                    break;
                case 'w':
                    output = output +"d";
                    break;
                case 'X':
                    output = output +"C";
                    break;
                case 'x':
                    output = output +"c";
                    break;
                case 'Y':
                    output = output +"B";
                    break;
                case 'y':
                    output = output +"b";
                    break;
                case 'Z':
                    output = output +"A";
                    break;
                case 'z':
                    output = output +"a";
                    break;
                default:
                    output += c;
            }
        }
        return output;
    }
}
