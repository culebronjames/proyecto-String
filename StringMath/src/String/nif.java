package String;

import java.lang.*;
import java.util.*;

public class nif {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nif;
		int i;
		Scanner teclado= new Scanner(System.in);
		System.out.println("Dame nif: ");
		nif=teclado.nextLine();
		if ((nif.length()!=9 || (Character.isLetter(nif.charAt(8)))))
			System.out.println("no es un nif correcto");
		else{
			for(i=0;i<8;i++){
				if(!Character.isDigit(nif.charAt(i)))break;
			}
			if (i==8)System.out.println("es un nif correcto");
			else System.out.println("no es un nif correcto");
			
		}
	teclado.close();
	}

}
