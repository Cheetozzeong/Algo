import java.io.*;
import java.util.*;

public class Main {
	public static void main (String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine()," ");

		int[] times = new int[N];
		for (int i = 0; i < N; i++) {
			times[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(times);

		int sumTime = 0;

		for (int i = 0; i < N; i++) {
            int current = i;
			while (current >= 0) {
				sumTime += times[current];
                current--;
            }
		}
		System.out.println(sumTime);
	}
}