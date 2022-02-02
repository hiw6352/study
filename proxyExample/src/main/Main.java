package main;

import factorial.FactorialProxy;
import impl.Calculator;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new FactorialProxy();
		System.out.println("FactorialProxy.factorial : " + cal.factorial(10));
		System.out.println("FactorialProxy.timeFactorial : " + cal.timeFactorial(14));
		System.out.println("FactorialProxy.cacheFactorial : " + cal.cacheFactorial(7));
		System.out.println("FactorialProxy.cacheFactorial : " + cal.cacheFactorial(7));
		System.out.println("FactorialProxy.cacheFactorial : " + cal.cacheFactorial(20));
		System.out.println("FactorialProxy.cacheFactorial : " + cal.cacheFactorial(20));
	}

}
