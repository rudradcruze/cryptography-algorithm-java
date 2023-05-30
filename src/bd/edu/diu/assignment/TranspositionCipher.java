package bd.edu.diu.assignment;

import java.util.Scanner;

public class TranspositionCipher {
    public static String encrypt(String txt){

        int length = txt.length();

        char[] transPosedTxt = new char[txt.length()];
        int i = 0, j = length;
        for(int k = 0; k < length; k++){
            transPosedTxt[k]=txt.charAt(k%2==0?i++:--j);
        }

        String cipher1 = new String(transPosedTxt);
        System.out.println("Encryption: " + cipher1);

        StringBuilder cipherTextFinal = new StringBuilder();
        for (i = 0; i < length; i++) {
            cipherTextFinal.append(cipher1.charAt(((i + 4) % length)));
        }
        return cipherTextFinal.toString();
    }

    public static String decrypt(String transTxt){

        int length = transTxt.length();

        StringBuilder plainText = new StringBuilder();
        for (int i=0; i<length; i++) {
            int index = (i-4) % length;
            plainText.append(transTxt.charAt((index) < 0 ? index+length : index));
        }

        String transText1 = plainText.toString();

        System.out.println("Decryption: " + transText1);

        char[] untTxt = new char[length];
        int i=0, j=length;

        for(int k=0; k<length;k++){
            untTxt[k%2==0?i++:--j]=transText1.charAt(k);
        }
        return new String(untTxt);
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the text to encryption: ");
        String plainText = scanner.nextLine();
        String encrypt = encrypt(plainText); // encrypt the plain text -> two times
        System.out.println("Encryption: " + encrypt);
        System.out.println("\n ------ \n");
        String decrypt = decrypt(encrypt); // decrypt the cipher text -> two times
        System.out.println("Decryption: " + decrypt);
    }
}