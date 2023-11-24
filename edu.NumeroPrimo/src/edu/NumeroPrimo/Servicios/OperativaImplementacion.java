package edu.NumeroPrimo.Servicios;

public class OperativaImplementacion implements OperativaInterfaz{

	
	public boolean esPrimo(long numeroAComprobar) {
		
		boolean esPrimo = true;
		
		for(int i = 2; i <numeroAComprobar; i++) {

			if(numeroAComprobar%i==0) {
				esPrimo = false;
				break;
				
				
			}
			
		}
		
		return esPrimo;
		
	}
}
