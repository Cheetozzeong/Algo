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
		for(int i = 0; i<M; i++) {
			System.out.println(binarySearch(arr,Integer.parseInt(st.nextToken())));
		}
	}

	public static int binarySearch(int[] arr, int key) {
		int lo = 0;
		int hi = arr.length-1;

		while(lo <= hi) {
			int mid = (lo + hi) / 2;

			// key값이 배열 중간값보다 큼 -> 찾는 값이 오른쪽에 있음
			if(arr[mid] < key) {
				lo = mid + 1;
			} else if(arr[mid] > key) {
				hi = mid - 1;
			} else {
				return 1;
			}
		}
		return 0;
	}
}