package substitution;
// This is a basic substitution table 1, 2, & 3 program
// Author: Francis Rudra D Cruze
// Email: rudra16-563@diu.edu.bd

public class AssignmentSubstitutionTable {

    public String substitutionTable1(String normalText){
        String output = "";
        for(int i=0; i<normalText.length(); i++){
            char c = normalText.charAt(i);
            switch(c){
                case 'A':
                    output += "Y";
                    break;
                case 'a':
                    output += "y";
                    break;
                case 'B':
                    output += "O";
                    break;
                case 'b':
                    output += "o";
                    break;
                case 'C':
                    output += "N";
                    break;
                case 'c':
                    output += "n";
                    break;
                case 'D':
                    output += "Q";
                    break;
                case 'd':
                    output += "q";
                    break;
                case 'E':
                    output += "Z";
                    break;
                case 'e':
                    output += "z";
                    break;
                case 'F':
                    output += "H";
                    break;
                case 'f':
                    output += "h";
                    break;
                case 'G':
                    output += "V";
                    break;
                case 'g':
                    output += "v";
                    break;
                case 'H':
                    output += "F";
                    break;
                case 'h':
                    output += "f";
                    break;
                case 'I':
                    output += "J";
                    break;
                case 'i':
                    output += "j";
                    break;
                case 'J':
                    output += "I";
                    break;
                case 'j':
                    output += "i";
                    break;
                case 'K':
                    output += "X";
                    break;
                case 'k':
                    output += "x";
                    break;
                case 'L':
                    output += "P";
                    break;
                case 'l':
                    output += "p";
                    break;
                case 'M':
                    output += "R";
                    break;
                case 'm':
                    output += "r";
                    break;
                case 'N':
                    output += "C";
                    break;
                case 'n':
                    output += "c";
                    break;
                case 'O':
                    output += "B";
                    break;
                case 'o':
                    output += "b";
                    break;
                case 'P':
                    output += "L";
                    break;
                case 'p':
                    output += "l";
                    break;
                case 'Q':
                    output += "D";
                    break;
                case 'q':
                    output += "d";
                    break;
                case 'R':
                    output += "M";
                    break;
                case 'r':
                    output += "m";
                    break;
                case 'S':
                    output += "U";
                    break;
                case 's':
                    output += "u";
                    break;
                case 'T':
                    output += "W";
                    break;
                case 't':
                    output += "w";
                    break;
                case 'U':
                    output += "S";
                    break;
                case 'u':
                    output += "s";
                    break;
                case 'V':
                    output += "G";
                    break;
                case 'v':
                    output += "g";
                    break;
                case 'W':
                    output += "T";
                    break;
                case 'w':
                    output += "t";
                    break;
                case 'X':
                    output += "K";
                    break;
                case 'x':
                    output += "k";
                    break;
                case 'Y':
                    output += "A";
                    break;
                case 'y':
                    output += "a";
                    break;
                case 'Z':
                    output += "E";
                    break;
                case 'z':
                    output += "e";
                    break;
                default:
                    output += c;
            }
        }
        return output;
    }

    public String substitutionTable2(String normalText){
        String output = "";
        for(int i=0; i<normalText.length(); i++){
            char c = normalText.charAt(i);
            switch(c){
                case 'A':
                    output += "M";
                    break;
                case 'a':
                    output += "m";
                    break;
                case 'B':
                    output += "P";
                    break;
                case 'b':
                    output += "p";
                    break;
                case 'C':
                    output += "K";
                    break;
                case 'c':
                    output += "k";
                    break;
                case 'D':
                    output += "N";
                    break;
                case 'd':
                    output += "n";
                    break;
                case 'E':
                    output += "W";
                    break;
                case 'e':
                    output += "w";
                    break;
                case 'F':
                    output += "J";
                    break;
                case 'f':
                    output += "j";
                    break;
                case 'G':
                    output += "T";
                    break;
                case 'g':
                    output += "t";
                    break;
                case 'H':
                    output += "O";
                    break;
                case 'h':
                    output += "o";
                    break;
                case 'I':
                    output += "U";
                    break;
                case 'i':
                    output += "u";
                    break;
                case 'J':
                    output += "F";
                    break;
                case 'j':
                    output += "f";
                    break;
                case 'K':
                    output += "C";
                    break;
                case 'k':
                    output += "c";
                    break;
                case 'L':
                    output += "V";
                    break;
                case 'l':
                    output += "v";
                    break;
                case 'M':
                    output += "A";
                    break;
                case 'm':
                    output += "a";
                    break;
                case 'N':
                    output += "D";
                    break;
                case 'n':
                    output += "d";
                    break;
                case 'O':
                    output += "H";
                    break;
                case 'o':
                    output += "h";
                    break;
                case 'P':
                    output += "B";
                    break;
                case 'p':
                    output += "b";
                    break;
                case 'Q':
                    output += "Y";
                    break;
                case 'q':
                    output += "y";
                    break;
                case 'R':
                    output += "X";
                    break;
                case 'r':
                    output += "x";
                    break;
                case 'S':
                    output += "Z";
                    break;
                case 's':
                    output += "z";
                    break;
                case 'T':
                    output += "G";
                    break;
                case 't':
                    output += "g";
                    break;
                case 'U':
                    output += "I";
                    break;
                case 'u':
                    output += "i";
                    break;
                case 'V':
                    output += "L";
                    break;
                case 'v':
                    output += "l";
                    break;
                case 'W':
                    output += "E";
                    break;
                case 'w':
                    output += "e";
                    break;
                case 'X':
                    output += "R";
                    break;
                case 'x':
                    output += "r";
                    break;
                case 'Y':
                    output += "Q";
                    break;
                case 'y':
                    output += "q";
                    break;
                case 'Z':
                    output += "S";
                    break;
                case 'z':
                    output += "s";
                    break;
                default:
                    output += c;
            }
        }
        return output;
    }

    public String substitutionTable3(String normalText){
        String output = "";
        for(int i=0; i<normalText.length(); i++){
            char c = normalText.charAt(i);
            switch(c){
                case 'A'    :
                    output += "M";
                    break;
                case 'a':
                    output += "m";
                    break;
                case 'B':
                    output += "P";
                    break;
                case 'b':
                    output += "p";
                    break;
                case 'C':
                    output += "K";
                    break;
                case 'c':
                    output += "k";
                    break;
                case 'D':
                    output += "N";
                    break;
                case 'd':
                    output += "n";
                    break;
                case 'E':
                    output += "W";
                    break;
                case 'e':
                    output += "w";
                    break;
                case 'F':
                    output += "J";
                    break;
                case 'f':
                    output += "j";
                    break;
                case 'G':
                    output += "T";
                    break;
                case 'g':
                    output += "t";
                    break;
                case 'H':
                    output += "O";
                    break;
                case 'h':
                    output += "o";
                    break;
                case 'I':
                    output += "U";
                    break;
                case 'i':
                    output += "u";
                    break;
                case 'J':
                    output += "F";
                    break;
                case 'j':
                    output += "f";
                    break;
                case 'K':
                    output += "C";
                    break;
                case 'k':
                    output += "c";
                    break;
                case 'L':
                    output += "V";
                    break;
                case 'l':
                    output += "v";
                    break;
                case 'M':
                    output += "A";
                    break;
                case 'm':
                    output += "a";
                    break;
                case 'N':
                    output += "D";
                    break;
                case 'n':
                    output += "d";
                    break;
                case 'O':
                    output += "H";
                    break;
                case 'o':
                    output += "h";
                    break;
                case 'P':
                    output += "B";
                    break;
                case 'p':
                    output += "b";
                    break;
                case 'Q':
                    output += "Y";
                    break;
                case 'q':
                    output += "y";
                    break;
                case 'R':
                    output += "X";
                    break;
                case 'r':
                    output += "x";
                    break;
                case 'S':
                    output += "Z";
                    break;
                case 's':
                    output += "z";
                    break;
                case 'T':
                    output += "G";
                    break;
                case 't':
                    output += "g";
                    break;
                case 'U':
                    output += "I";
                    break;
                case 'u':
                    output += "i";
                    break;
                case 'V':
                    output += "L";
                    break;
                case 'v':
                    output += "l";
                    break;
                case 'W':
                    output += "E";
                    break;
                case 'w':
                    output += "e";
                    break;
                case 'X':
                    output += "R";
                    break;
                case 'x':
                    output += "r";
                    break;
                case 'Y':
                    output += "Q";
                    break;
                case 'y':
                    output += "q";
                    break;
                case 'Z':
                    output += "S";
                    break;
                case 'z':
                    output += "s";
                    break;
                default:
                    output += c;
            }
        }
        return output;
    }

}
