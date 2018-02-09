package Exceptions;

import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void test() {


		try{
			Division2 division = new Division2();
			division.dividir();
		}catch (ArithmeticException e){
			// cuando divisor igual a 0
			System.out.println("Error aritmetico");
			fail("error aritmetico");
		}catch (NullPointerException ex){
			// cuando falta un valor
			System.out.println("tienes que rellenar todo");
			fail("error falta un numero");
		}catch (NumberFormatException ex){
			// si introducimos letras
			System.out.println("introduce un numero");
			fail("formato erroneo");
		}
	}

}
