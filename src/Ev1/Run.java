package Ev1;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		//Declaracion de variables
		Scanner text = new Scanner(System.in);
		Scanner number = new Scanner(System.in);
		Scanner number2 = new Scanner(System.in);
		
		System.out.println("Ingresa tu nombre: ");
		String name;
		name = text.nextLine();
		
		System.out.println("Ingresa un número entero: ");
		double decimal;
		decimal = number.nextInt();
		
		System.out.println("Ingresa un número decimal: ");
		double decimal2;
		decimal2 = number2.nextDouble();
		
		//Operaciones
		double suma;
		suma = decimal + decimal2;

		//Impresión de resultados
		System.out.println("Hola "+name+" La suma de los valores "+decimal+" + "+decimal2+" es: "+suma);
	}
}