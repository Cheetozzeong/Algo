import java.io.*;
import java.util.*;

public class Main {
	public static void main (String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		int K = Integer.parseInt(br.readLine());

		System.out.println(N+M-K);

		sb.append(N);
		sb.append(M);

		int a = Integer.parseInt(sb.toString());
		System.out.println(a-K);

	}
}