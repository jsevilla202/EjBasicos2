package ejbasico5;

import java.util.Scanner;

public class Ejbasico5 {

	public static void main(String[] args) {
		//Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		//Nombramos las variables
		float primer,segundo, tercero, ultimo;
		//Preguntamos por la nota del primer trimestre al usuario
		System.out.print("Cual fue su nota del primer trimestre?: ");
		//Captamos la respuesta y la guardamos en una variable
		primer = sc.nextInt();
		//Preguntamos por la nota del segundo trimestre al usuario
		System.out.print("Cual fue su nota del segundo trimestre?: ");
		//Captamos la respuesta y la guardamos en una variable
		segundo = sc.nextInt();
		//Preguntamos por la nota del tercer trimestre al usuario
		System.out.print("Cual fue su nota del tercer trimestre?: ");
		//Captamos la respuesta y la guardamos en una variable
		tercero = sc.nextInt();
		ultimo = (primer+segundo+tercero)/3;
		//Mostramos el resultado
		System.out.println("Su nota final es de un " + (int)ultimo);
		System.out.print("Su nota de expediente es de un ");
		//Redondeamos a los 3 digitos
		System.out.format("%.3f", ultimo);
		sc.close();
	}

}
