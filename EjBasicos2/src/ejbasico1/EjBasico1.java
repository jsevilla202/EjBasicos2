package ejbasico1;

import java.util.Scanner;

public class EjBasico1 {

	public static void main(String[] args) {
		//Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		//Nombramos las variables y establecemos las variables constantes
		double manzanas, peras, beneficios;
		final double manzanaprecio = 2.35;
		final double peraprecio = 1.95;
		//Preguntamos por la cantidad de manzanas vendidas
		System.out.print("Cuantos kg de manzanas ha vendido?: ");
		//Captamos la respuesta y la guardamos en una variable
		manzanas = sc.nextDouble();
		//Preguntamos por la cantidad de peras vendidas
		System.out.print("Cuantos kg de peras ha vendido?: ");
		//Captamos la respuesta y la guardamos en una variable
		peras = sc.nextDouble();
		//Calculamos el beneficio total
		beneficios = manzanas*manzanaprecio+peras*peraprecio;
		//Mostramos el resultado
		System.out.print("Tendra un beneficio total de " + beneficios+ "€");
	}

}
