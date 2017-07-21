package hello;

public class FactorialGenerator {

	public double nthFactorial(int n) {
		return computeFactorialRecurse(n);
	}
	
	private double computeFactorialRecurse(int n) {
			assert n >= 0 : "Illegal n: " + n;
		
		if(n == 0) {
			return 1; 
		}
		else {
			return n * computeFactorialRecurse(n-1);
		}
	}
	
	public static void main(String[] args) {
		FactorialGenerator f = new FactorialGenerator();
		System.out.println(f.nthFactorial(-1));
		for(int i = 1; i <= 32; i++) {
			System.out.println(f.nthFactorial(i));
		}
	}
}
