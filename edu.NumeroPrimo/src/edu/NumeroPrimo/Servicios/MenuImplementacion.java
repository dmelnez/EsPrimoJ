package edu.NumeroPrimo.Servicios;

import java.util.Scanner;

public class MenuImplementacion implements MenuInterfaz{

	public int solNum() {
		
		System.out.println("####################################################");
		System.out.println("# Introduzca el Nº de Primos que se desa calcular  #");
		System.out.println("# [INFO] El numero debera de ser un Numero Entero  #");
		System.out.println("####################################################");
		
		Scanner mi = new Scanner(System.in);
		int numeroIntro = mi.nextInt();
		
		System.out.println(numeroIntro);
		
		return numeroIntro;
	}
	
}
