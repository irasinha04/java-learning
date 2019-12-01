package divideAndConquer;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Exponentiation {

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int pow = Integer.parseInt(br.readLine());
		long exp = getExponentResult((long)num,pow);
		System.out.println(exp);
	}
	
	static long getExponentResult(long num, int pow) {
		
		if(pow == 0)
			return 1;
		
		long halfPow = getExponentResult(num, pow/2);
		if(pow %2 == 1) {
			return num * halfPow * halfPow;
		}
		return halfPow * halfPow;
	}
}
