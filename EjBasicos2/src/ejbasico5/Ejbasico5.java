package ejbasico5;

import java.util.Scanner;

public class Ejbasico5 {

	public static void main(String[] args) {
		//Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		//Nombramos las variables
		int primer,segundo, tercero;
		double expediente;
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
		//Usamos (double) para sacar los decimales
		expediente = (double)(primer+segundo+tercero)/3;
		//Mostramos el resultado
		//Usamos (int) para truncar el resultado y que salga entero
		System.out.println("Su nota final es de un " + (int)expediente);
		System.out.print("Su nota de expediente es de un ");
		//Redondeamos a los 3 digitos
		System.out.format("%.3f", expediente);
		sc.close();
	}

}
