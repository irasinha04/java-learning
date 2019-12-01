package geeksForGeeks;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//Given an unsorted array A of size N of non-negative integers, find a continuous 
//sub-array which adds to a given number S.	

public class SubarrayWithGivenSum {

	public static void main(String args[]) throws Exception {

		// Write code here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// T is test case
		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			// N is size of array
			String s[] = br.readLine().split(" ");
			// N is size of array
			int N = Integer.parseInt(s[0]);

			// S is sum
			int S = Integer.parseInt(s[1]);

			int arr[] = new int[N];
			String line[] = br.readLine().split(" ");

			for (int j = 0; j < N; j++) {
				arr[j] = Integer.parseInt(line[j]);
			}
			Integer index[] = getStartAndEndIndex(arr, S);
			if (index == null) {
				System.out.println("");
			} else {
				System.out.println(index[0] + " " + index[1]);
			}

		}
	}

	private static Integer[] getStartAndEndIndex(int[] arr, int s) {

		// Stores start and end index
		Integer index[] = null;

		int startIndex = 0;
		int endIndex = arr.length;
		int arrSum = 0;
		boolean flag = false;

		while (!flag) {
			arrSum = 0;
			for (int i = startIndex; i < endIndex; i++) {
				arrSum = arrSum + arr[i];
				if (arrSum == s) {
					flag = true;
					index = new Integer[2];
					index[0] = startIndex + 1;
					index[1] = i + 1;
					break;
				} else if (arrSum > s) {
					if ((startIndex + 1) > endIndex) {
						flag = true;
					}
					startIndex = (startIndex + 1);
					break;
				} else {
					continue;
				}
			}
		}
		return index;
	}
}
