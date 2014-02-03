package String;

import java.util.Scanner;

public class EjercicioString1 {

	public static void main(String[] args) {
		
		Scanner teclado= new Scanner(System.in);
		String cadena="En mi próxima vida, creeré en la reencarnación";
		int x;
		System.out.println("la longitud es: "+cadena.length());
		System.out.println("caracter asociado al indice 7 :"+cadena.substring(7, 8));
		System.out.println("caracter asociado al indice 7 :"+cadena.charAt(7));//te muestra el caracter de la posicion q metas
		System.out.println("indice de creere: "+cadena.substring(20, 27));
		System.out.println("Dime q posicion de cadena quieres descubrir; ");
		x=teclado.nextInt();
		System.out.println("indice de x: "+cadena.charAt(x));
		System.out.println("mayusculas: "+cadena.toUpperCase());
		if (cadena.startsWith("E"))
			System.out.println("Empieza por E!!");
		for (int i = 0; i < cadena.length(); i++) {
			System.out.println(cadena.charAt(i));		
		}
	}

}
