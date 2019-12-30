package sword2offer;

import java.util.concurrent.TimeUnit;

import com.google.common.base.Stopwatch;

public class Fabonacci_10 {

	public static void main(String[] args) {
		Stopwatch watch = Stopwatch.createStarted();
		System.out.println(fibonacci2(50));
		System.out.println(watch.elapsed(TimeUnit.SECONDS));
		
		/*  System.out.println(fibonacci2(100));
		  watch.elapsed(TimeUnit.SECONDS);*/
		 
	}
	
	public static long fibonacci(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		return fibonacci(n-2) + fibonacci(n-1);
	}
	
	public static long fibonacci2(int n) {
		int[] result = {0, 1};
		if (n < 2) {
			return result[n];
		}
		long one = 0;
		long two = 1;
		long N = 0;
		for (int i=2; i<=n; i++) {
			N = one + two;
			one = two;
			two = N;
		}
		return N;
	}

	
}
