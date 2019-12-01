package recursion;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CountElements {

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		String s[] = br.readLine().split(" ");
		int arr[] = new int[t];
		for(int i = 0; i < t; i++) {
			arr[i] = Integer.parseInt(s[i]);
		}
		int count = 0;
		count = getCount(arr, 0, arr.length - 1);
		System.out.println(count);
	}

	private static int getCount(int[] arr, int start, int end) {
		
		if(start == end)
			return 1;
		return 1 + getCount(arr, start+ 1, end);
	}
	
}
