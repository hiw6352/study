package factorial;

import impl.Calculator;

public class Factorial implements Calculator{

	@Override
	public long factorial(long n) {
		if(n <= 1) {
			return n;
		}else {
			return factorial(n-1) * n; 
		}
	}
	
	@Override
	public long timeFactorial(long n) {
		return 0;
	}

	@Override
	public long cacheFactorial(long n) {
		// TODO Auto-generated method stub
		return 0;
	}

}
