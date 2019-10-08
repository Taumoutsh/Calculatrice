package Calculatrice;

public class Calculatrice implements CalculatriceInterface{
	
	public int sum(int a, int b) {
		
		int result;	
		result = a + b;
		return result;
		
	}
	
	public int restar(int a, int b) {
		int result;	
		result = a - b;
		return result;
	}
	
	public int multiplicar(int a, int b) {
		int result;	
		result = a * b;
		return result;
	}
	
	public boolean esPar(int a) {
		int result;
		boolean bresult;
		result = a%2;
		if(result == 1) bresult = false;
		else bresult = true;
		return bresult;
	}
	
}
