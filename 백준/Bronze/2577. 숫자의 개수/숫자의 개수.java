import java.io.*;
import java.util.*;

public class Main {
	public static void main (String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		int K = Integer.parseInt(br.readLine());

		String all = Integer.toString(N*M*K);

		for(int i =0; i<10; i++) {
			int cnt =0;
			for (int j = 0; j < all.length(); j++) {
				if((all.charAt(j) - '0') == i) cnt++;
			}
			System.out.println(cnt);
		}
	}
}