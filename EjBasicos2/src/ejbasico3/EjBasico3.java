package ejbasico3;

import java.util.Scanner;

public class EjBasico3 {

	public static void main(String[] args) {
		//Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		//Nombramos las variables
		double numero;
		//Preguntamos por un numero al usuario
		System.out.print("Inserte un numero: ");
		//Captamos la respuesta y la guardamos en una variable
		numero = sc.nextDouble();
		//Si es numero tiene resto 0 será par, por lo que dara como respuesta "True"
		//En otro caso "False"
		System.out.print(numero%2==0);
		sc.close();
	}

}
