package EjercicioVocal;

import java.util.Scanner;

import Adibideak.AdibideSalbuespenak;

public class MirarSiTieneVocalCatch {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Boolean bucle=true;
		System.out.println("Introduce una frase.Si NO tiene vocal dara error ");
		do {
			String Frase ="";
			int contador=0;
			Frase= entrada.nextLine(); 
			try {
				datuaBalidatu(Frase);
			}catch (VocalSalbuespena e) {
				System.out.println(e.getMessage());
			}
		}while(bucle==true);

	}



	public static void datuaBalidatu (String Frase) throws VocalSalbuespena {
		int contadorVocales=0;
		int contadorCaracteres=0;
		int contadorMayusculas=0;
		for(int i=0;i<Frase.length();i++) {
			if ((Frase.charAt(i)=='a') || (Frase.charAt(i)=='e') || (Frase.charAt(i)=='i') || (Frase.charAt(i)=='o') || (Frase.charAt(i)=='u') || (Frase.charAt(i)=='A') || (Frase.charAt(i)=='E') || (Frase.charAt(i)=='I') || (Frase.charAt(i)=='O') || (Frase.charAt(i)=='U')){
				contadorVocales++;
			}
			if(!(Frase.charAt(i)==' ')) {
				contadorCaracteres++;
			}
			if (Character.isUpperCase(Frase.charAt(i))) {
				contadorMayusculas++;
			}
			//			else if(!(Frase.charAt(i)=='a') || !(Frase.charAt(i)=='e') || !(Frase.charAt(i)=='i') || !(Frase.charAt(i)=='o') || !(Frase.charAt(i)=='u')) {
			//				throw new VocalSalbuespena();
			//			}
		}
		if(contadorVocales == 0) {
			throw new VocalSalbuespena();
		}
		System.out.println("Vocales Totales: "+contadorVocales+"\n"+"El total de caracteres: "+contadorCaracteres+"\n"+"El total de mayusculas: "+contadorMayusculas+"\n"+"Longitud de la frase (con espacios): "+Frase.length());
	}


}
