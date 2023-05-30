package bd.edu.diu.transposition;

import java.util.Scanner;
public class BasicTransposition {
	public static void main(String[] args){
		String txt = "Hello this is NS lab class";
		String transposedTxt = transpose(txt);

		System.out.println("Transposed text is: "+transposedTxt);
		System.out.println("Untransposed Text is: "+untranspose(transposedTxt));
	}

	public static String transpose(String txt){

		char[] transPosedTxt = new char[txt.length()];
		int i = 0, j = txt.length();
		for(int k=0;k<txt.length();k++){
			if(k%2 == 0){
				transPosedTxt[k] = txt.charAt(i);
				i=i+1;
			}else{
				transPosedTxt[k] = txt.charAt(j-1);
				j=j-1;
			}
//                transPosedTxt[k]=txt.charAt(k%2==0?i++:--j);
		}

		return new String(transPosedTxt);
	}

	public static String untranspose(String transTxt){

		char[] untTxt = new char[transTxt.length()];
		int i=0, j=transTxt.length();

		for(int k=0; k<transTxt.length();k++){
//            if(k % 2 == 0){
//               untTxt[i] = transTxt.charAt(k);
//               i = i +1;
//            }else{
//                untTxt[j-1] = transTxt.charAt(k);
//                j = j-1;
//            }
			untTxt[k%2==0?i++:--j]=transTxt.charAt(k);
		}
		return new String(untTxt);
	}
}