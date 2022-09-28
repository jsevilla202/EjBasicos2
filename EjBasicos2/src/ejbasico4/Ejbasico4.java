package ejbasico4;

import java.util.Scanner;

public class Ejbasico4 {

	public static void main(String[] args) {
		//Nombramos las variables
		boolean calle, lluvia, tarea, biblioteca;
		//Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		//Preguntamos por la lluvia al usuario
		System.out.print("Está lloviendo? ( True o False ): ");
		//Captamos la respuesta y la guardamos en una variable
		lluvia = sc.nextBoolean();
		//Preguntamos por la tarea al usuario
		System.out.print("Has hecho la tarea? ( True o False ): ");
		//Captamos la respuesta y la guardamos en una variable
		tarea = sc.nextBoolean();
		//Preguntamos por la biblioteca al usuario
		System.out.print("Tienes que ir a la biblioteca? ( True o False ): ");
		//Captamos la respuesta y la guardamos en una variable
		biblioteca = sc.nextBoolean();
		/*Queremos lo negativo de la respuesta de lluvia, ya que es "False", es decir, no llueve
		 * está bien y le damos dominancia con "||" a la biblioteca porque no depende de nada
		 */
		calle = !lluvia&&tarea||biblioteca;
		//Mostramos el resultado
		System.out.print(calle);
		sc.close();
		

	}

}
