import java.io.*;
import java.util.*;

public class Main {
	public static void main (String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr);

		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i<M; i++) {
			int current = Integer.parseInt(st.nextToken());
			sb.append(upper(arr,current)-lower(arr,current)+" ");
		}

		System.out.println(sb);

	}

	public static int lower(int[] arr, int key) { // 1 3 3 4 4 4 5 면 4의 Lower는 첫 4가 나오는 인덱스 3번임
		int lo = 0;
		int hi = arr.length;

		while (lo < hi) {
			int mid = lo+((hi-lo) / 2);
			if (key <= arr[mid]) {
				hi = mid;
			} else {
				lo = mid + 1;
			}
		}
		return lo;
	}
	public static int upper(int[] arr, int key) { // 1 3 3 4 4 4 5 면 4의 Upper는 첫 5가 나오는 인덱스 6번임
		int lo = 0;
		int hi = arr.length;

		while(lo < hi) {
			int mid = lo+((hi-lo)/2);
			if(key < arr[mid]) {
				hi = mid;
			} else {
				lo = mid+1;
			}
		}
		return lo;
	}
}