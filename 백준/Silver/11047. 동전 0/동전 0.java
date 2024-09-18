import java.io.*;
import java.util.*;

public class Main {
	public static void main (String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");

		int N = Integer.parseInt(st.nextToken());
		int Goal = Integer.parseInt(st.nextToken());

		int[] coins = new int[N];
		for (int i = 0; i < N; i++) {
			coins[i] = Integer.parseInt(br.readLine());
		}

		int cnt = 0;

		while(Goal > 0) {
			for (int i = N-1; i >= 0; i--) {
				if(coins[i] <= Goal) {
					cnt += Goal/coins[i];
					Goal %= coins[i];
				}
			}
		}

		System.out.println(cnt);
	}
}