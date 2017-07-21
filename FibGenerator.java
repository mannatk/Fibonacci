package hello;

public class FibGenerator {
	private int[] callCounter;

	public int nthFib(int n) {
		callCounter = new int[n+1];
		return computeFibRecurse(n);
	}
	
	private int computeFibRecurse(int n) {
		if(n == 1 || n == 2) {
			return 1;
		}
		callCounter[n]++;
		return computeFibRecurse(n-1) + computeFibRecurse(n-2);
	}

	public void printCallCounter() {
		for(int i= 1; i < callCounter.length; i++) {
			System.out.println(callCounter[i] + " calls to fib(" + i + ")");
		}
	}
	public static void main(String[] args) {
		FibGenerator f = new FibGenerator();
		for(int i = 1; i <= 60; i++) {
			System.out.println(f.nthFib(i));
		}
		f.nthFib(20);
		f.printCallCounter();
	}
	
	
}
