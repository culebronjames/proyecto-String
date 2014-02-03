package String;

import java.lang.*;
import java.util.Scanner;

public class clilindro {

	static double radioCilindro,alturaCilindro;
	static double radioEsfera;
	
	public static void main(String[] args) {
		
		Scanner teclado= new Scanner(System.in);
		System.out.println("Dame radio de la esfera");
		radioEsfera=teclado.nextDouble();
		System.out.println("volumen de esfera: "+volumenEsfera());
		System.out.println("Dame altura del cilindro: ");
		alturaCilindro=teclado.nextDouble();
		System.out.println("Dame radio del cilindro: ");
		radioCilindro=teclado.nextDouble();
		System.out.printf("el volumne del cilindro %.2f: "+volumenCilindro());
		teclado.close();
	}
	static double volumenEsfera(){
		return Math.PI*Math.pow(radioEsfera,3);
	}
	static double volumenCilindro(){
		return Math.PI*Math.pow(radioCilindro,2)*alturaCilindro;
	}
}
