public class DivisibleAPP {

	public static void main(String[] args) {
							
		for(int valorDivisible = 1; valorDivisible <= 100; valorDivisible++) {
			
			if((valorDivisible % 2 == 0)) {
				System.out.println("El número " + valorDivisible + " es divisible de 2.");
			}else if ((valorDivisible % 3) == 0){
				System.out.println("El número " + valorDivisible + " es divisible de 3.");	
			}else {
				System.out.println("El número " + valorDivisible + " no es divisible de 2 y 3");
			}
		}
			
		
	}
}
