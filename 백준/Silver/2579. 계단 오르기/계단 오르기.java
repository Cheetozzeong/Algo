import java.io.*;

public class Main{
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		long[] DP = new long[N+1];
		long[] arr = new long[N+1];

		for (int i = 1; i <= N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		DP[1] = arr[1];
		if (N >= 2) {
			DP[2] = arr[1] + arr[2];
		}

		for (int i = 3; i <= N; i++) {
			DP[i] = Math.max(DP[i-2], DP[i-3]+arr[i-1])+arr[i];
		}

		System.out.print(DP[N]);
	}
}