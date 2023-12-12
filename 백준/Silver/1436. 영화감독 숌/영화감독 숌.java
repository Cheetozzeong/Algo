import java.io.*;
import java.util.*;

public class Main {
	public static void main (String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());
		int cnt = 0;

		for(int i = 1; i<10000666; i++) {
			if(String.valueOf(i).contains("666")) {
				cnt++;
			}
			if(cnt == N) {
				System.out.print(i);
				break;
			}
		}

	}
}
