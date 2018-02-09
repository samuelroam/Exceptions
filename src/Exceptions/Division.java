package Exceptions;

import java.util.Scanner;

public class Division {
	
	String dividendoSt;
	String divisorSt;
	Integer dividendoInt;
	Integer divisorInt;
	float division = .0f;
	
	Scanner scan = new Scanner(System.in);
	
	/*
	 * Pide por teclado el dividendo y divisor y lo convierte a Int
	 */
	public void numeros (String dividendoSt, String divisorSt){
		// pide por teclado dividendo
		System.out.println("Introduce un dividendo");
		dividendoSt = scan.nextLine();
		
		// pide por teclado divisor
		System.out.println("Introduce un divisor");
		divisorSt = scan.nextLine();
		
		// convierte los string en int
		dividendoInt = Integer.parseInt(dividendoSt);
		divisorInt = Integer.parseInt(divisorSt);
	}
	
	public void division(Integer dividendoInt, Integer divisorInt){
		division = dividendoInt / divisorInt;
	}
	
	public void plasmar(){
		System.out.println("el resultado de la division de " + dividendoInt + " entre " + divisorInt + " es igual a " + division);
	}

}
