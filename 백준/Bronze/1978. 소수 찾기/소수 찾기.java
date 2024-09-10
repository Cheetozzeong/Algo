import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main (String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int cnt = 0;

		for(int i = 1; i <= N; i++) {
			int n = Integer.parseInt(st.nextToken());
			int m = 2;
			while(true) {
				if(n == 1) break;
				if(m >= n) {
					cnt++;
					break;
				}

				if(n%m == 0) break;
				m++;
			}
		}

		System.out.print(cnt);
	}
}