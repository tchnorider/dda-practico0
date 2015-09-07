package utils;

import java.util.ArrayList;
import java.util.Scanner;

public class NumberOperations {

	public ArrayList<Integer> getNumbers(Scanner sknr, int cantNrs) {
		ArrayList<Integer> numbers = new ArrayList<>();
		for (int i = 0; i < cantNrs; i++) {
			int cont = i + 1;
			System.out.println(" Ingrese número " + cont);
			numbers.add(sknr.nextInt());
		}
		return numbers;
	}

	public int promedioCustom(ArrayList<Integer> lst, int cantNrs,
			boolean rangoOn, int rangoC, int rangoF) {
		int prom = 0, sum = 0;
		try {
			for (int i = 0; i < lst.size(); i++) {
				int n = lst.get(i);
				if (rangoOn) {
					if (n > rangoC && n < rangoF) {
						sum = sum + n;
					}
				} else {
					sum = sum + n;
				}
			}
			prom = sum / cantNrs;
		} catch (Exception e) {
			System.out.println("Error: " + e.toString());
		}
		return prom;
	}

	public int cantMultiplosDe3(ArrayList<Integer> lst) {
		int parCont = 0;
		for (int i = 0; i < lst.size(); i++) {
			int nmbr = lst.get(i);
			if (nmbr % 3 == 0) {
				parCont++;
			}
		}
		return parCont;
	}

	public int cantNumerosPares(ArrayList<Integer> lst) {
		int parCont = 0;
		for (int i = 0; i < lst.size(); i++) {
			int nmbr = lst.get(i);
			if (nmbr % 2 == 0) {
				parCont++;
			}
		}
		return parCont;
	}
}
