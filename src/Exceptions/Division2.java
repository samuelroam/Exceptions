package Exceptions;

import java.util.Scanner;

public class Division2 {
	
	String dividendoSt;
	String divisorSt;
	Integer dividendo;
	Integer divisor;
	float division = .0f;
	
	Scanner scan = new Scanner(System.in);
	
	public void dividir () throws ArithmeticException, NullPointerException, NumberFormatException{
		
		System.out.println("Introduce un dividendo");
		dividendoSt = scan.nextLine();
		
		System.out.println("Introduce un divisor");
		divisorSt = scan.nextLine();
		
		dividendo = Integer.parseInt(dividendoSt);
		divisor = Integer.parseInt(divisorSt);
		
		float dividir = dividendo/divisor;
		
		System.out.println(dividir);
	}
}
