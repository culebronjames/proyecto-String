package String;

public class ejercicio2String {


	public static void main(String[] args) {
		
		String cadena="Ma�ana es s�bado y voy a irme a tomar unas copillas por Madrid";
		int numero=0;
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i)=='a')
				numero=numero+1;
		}
		System.out.println("Tenemos "+numero+" a�s");
	}

}
