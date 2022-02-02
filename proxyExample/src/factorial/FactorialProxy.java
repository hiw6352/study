package factorial;

import java.util.HashMap;
import java.util.Map;

import impl.Calculator;

public class FactorialProxy implements Calculator{
	private Calculator realFactorial;
	private Map<Long, Long> cache = new HashMap<>();;
	
	@Override
	public long factorial(long n) {
		realFactorial = new Factorial();
		return realFactorial.factorial(n);
	}
	
	public long timeFactorial(long n) {
		long start = System.nanoTime();
		long result = this.factorial(n);
		long end = System.nanoTime();
		System.out.println(n + " factorial의 실행시간(n/s) : " + (end-start));
		return result;
	}
	
	public long cacheFactorial(long n) {
		if(cache.containsKey(n)) {
			System.out.println("CacheAspect: Cache에서 구함 [" + n+"]");
			return cache.get(n);
		}else {
			long result = factorial(n);
			System.out.println("CacheAspect: Cache에 값이 저장됨 [" + n +"]");
			cache.put(n, result);
			return result;
		}
	}
}
