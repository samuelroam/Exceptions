package Exceptions;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class Main {

	public static void Nain(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		String dividendoSt;
		String divisorSt;
		Integer dividendoInt;
		Integer divisorInt;
		float division = .0f;
		
		
		try{
			System.out.println("Inserta numerador --> ");
			dividendoSt = scan.nextLine();
			
			System.out.println("Inserta denominador --> ");
			divisorSt = scan.nextLine();
			
			dividendoInt = Integer.parseInt(dividendoSt);
			divisorInt = Integer.parseInt(divisorSt);
			
			division = (dividendoInt / divisorInt);
			
			
		} catch (ArithmeticException e) {
			//Cuando el divisor es igual a  0
			System.err.println("ERROR --> No se puede dividir entre 0 porque da indeterminación " );  
			
		} catch (NullPointerException ex){
			//Cuando falta un valor
			System.err.println("ERROR --> Tienes que rellenar todo "); 
			
		} catch(NumberFormatException ex){
			// Si introduces letras
			System.err.println("ERROR --> Introduce un numero, por favor "); 
			
		}finally{
			System.out.println("Resultado: " + division);
		}
		
	}

}