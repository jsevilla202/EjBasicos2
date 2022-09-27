package ejbasico2;

import java.util.Scanner;

public class EjBasico2 {

	public static void main(String[] args) {
		//Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		//Nombramos las variables
		int edad;
		//Preguntamos por la edad del usuario
		System.out.print("Inserte su edad: ");
		//Captamos la respuesta y la guardamos en una variable
		edad = sc.nextInt();
		//Si la edad es mayor o igual a 18 mostrara "True", en otro caso "False"
		System.out.print(edad>=18);

	}

}
