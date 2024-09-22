import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st  = new StringTokenizer(br.readLine());
//		StringBuilder sb = new StringBuilder();

		int K = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());

		int [] length = new int [K];

		long max = 0;
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < K; i++) {
			length[i] = Integer.parseInt(st.nextToken());
			if(max < length[i]) {
				max = length[i];
			}
		}

		long min = 0;
		long mid;
		max += 1;

		while(min < max) {
			mid = min + ((max - min) / 2);

			long tree = 0;

            for (int j : length) {
                if (j > mid) {
                    tree += (j - mid);
                }
            }

			if(tree < N) {
				max = mid;
			} else {
				min = mid+1;
			}

		}

		System.out.println(min - 1);
	}
}