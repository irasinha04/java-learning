package recursion;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PositiveNumbers {

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		String s[] = br.readLine().split(" ");
		int arr[] = new int[t];
		for(int i = 0; i < t; i++) {
			arr[i] = Integer.parseInt(s[i]);
		}
		int count = 0;
		count = getPositiveNumberCount(arr, 0, arr.length - 1, count);
		System.out.println(count);
	}

	private static int getPositiveNumberCount(int[] arr, int start, int end, int count) {
		
		if(start == end)
			if(arr[start] > 0) {
				count ++;
				return count;
			}
			else
				return 0;
		
		count = getPositiveNumberCount(arr, start, end - 1, count) + getPositiveNumberCount(arr, start + 1, end, count);
		return count;
	}
}
