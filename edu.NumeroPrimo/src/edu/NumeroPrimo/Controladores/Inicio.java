package edu.NumeroPrimo.Controladores;

import edu.NumeroPrimo.Servicios.MenuImplementacion;
import edu.NumeroPrimo.Servicios.MenuInterfaz;
import edu.NumeroPrimo.Servicios.OperativaImplementacion;
import edu.NumeroPrimo.Servicios.OperativaInterfaz;

public class Inicio {

	public static void main(String[] args) {
		
		MenuInterfaz mi01 = new MenuImplementacion();
		
		OperativaInterfaz io = new OperativaImplementacion();
		
		int numeroIntro = mi01.solNum();
	
		
		long numeroControl = 1;
		
		for(long numero =1; numeroControl<numeroIntro; numero++) {
			
			if (io.esPrimo(numero)) {
				
				System.out.println(numero);
				numeroControl++;
			}
			
			
			
		}

	}

}
