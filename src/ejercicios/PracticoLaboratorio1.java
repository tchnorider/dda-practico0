package ejercicios;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;
import utils.NumberOperations;
import utils.TimeOperations;

/**
 *
 * @author LauraPerez
 */
public class PracticoLaboratorio1 {

	private static ArrayList<Integer> numbers = new ArrayList<Integer>();
	static NumberOperations utils = new NumberOperations();
	static TimeOperations timeOperations = new TimeOperations();
	static Scanner sknr = new Scanner(System.in);

	/**
	 * @param args
	 *            the command line arguments
	 * @classComments 20:00 hrss.. vamos a sacarnos las tela arañas...
	 */
	public static void main(String[] args) {

		System.out.println("Ejercicio 1");
		ejercicio1();

		System.out.println("Ejercicio 2");
		ejercicio2();

		System.out.println("Ejercicio 3");
		ejercicio3();

		System.out.println("Ejercicio 4");
		ejercicio4();

		System.out.println("Ejercicio 5");
		ejercicio5();

		System.out.println("Ejercicio 6");
		ejercicio6();
	}

	private static void ejercicio1() {
		int cantNrs, cantidadNrosPares, cantMultiDe3, promedio;
		System.out.println(" Ingrese cantidad de números..");
		try {
			cantNrs = sknr.nextInt();
			numbers = utils.getNumbers(sknr, cantNrs);
			cantidadNrosPares = utils.cantNumerosPares(numbers);
			cantMultiDe3 = utils.cantMultiplosDe3(numbers);
			promedio = utils.promedioCustom(numbers, cantNrs, false, 0, 0);

			System.out.println(" Cantidad de numeros pares: "
					+ cantidadNrosPares);
			System.out.println(" Cantidad de múltiplos de 3: " + cantMultiDe3);
			System.out.println(" Promedio: " + promedio);
		} catch (Exception e) {
			System.out.println(" Error: " + e.toString());
		}
	}

	private static void ejercicio2() {
		int cantNrs, promedio;
		System.out.println(" Ingrese cantidad de números..");
		try {
			cantNrs = sknr.nextInt();
			numbers = utils.getNumbers(sknr, cantNrs);
			promedio = utils.promedioCustom(numbers, cantNrs, true, 50, 60);
			System.out
					.println(" Promedio custom n > 50 && n < 70: " + promedio);
		} catch (Exception e) {
			System.out.println("Error: " + e.toString());
		}
	}

	private static void ejercicio3() {
		System.out.println(" Ingrese números..");
		try {
			int number = sknr.nextInt();
			while (number != 0) {
				number = sknr.nextInt();
			}
			System.out.println(" fin ej3..");
		} catch (Exception e) {
			System.out.println("Error: " + e.toString());
		}
	}

	private static void ejercicio4() {
		System.out
				.println(" Ingresar número y mostrar sus digitos(de izq a der)");
		System.out.println(" Ingrese número..");
		try {
			int numero = sknr.nextInt();
			String strNumero = String.valueOf(numero);
			System.out.println(" Número " + strNumero);
		} catch (Exception e) {
			System.out.println(" Error: " + e.toString());
		}
	}

	private static void ejercicio5() {

		System.out.println(" Horas y minutos trabajados");
		System.out.println(" Ingrese hora de entrada(hh:mm)");
		String hrEntrada = sknr.next();
		System.out.println(" Ingrese hora de salida(hh:mm)");
		String hrSalida = sknr.next();

		LocalDateTime horaIngreso = timeOperations.getLocalDateTime(hrEntrada);
		LocalDateTime horaSalida = timeOperations.getLocalDateTime(hrSalida);

		TimeOperations.difference(horaIngreso, horaSalida);
	}

	private static void ejercicio6() {
		// TO-DO: terminar ej 6
		throw new UnsupportedOperationException("Not supported yet.");
	}
}
