import java.io.*;
import java.util.*;

public class Main {
	public static void main (String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int M = Integer.parseInt(br.readLine());
		int set = 0;
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine()," ");
			String command = st.nextToken();
			int x;

			switch (command) {
				case "add" :
					x = Integer.parseInt(st.nextToken());
					set |= (1 << (x-1));
					break;
				case "remove" :
					x = Integer.parseInt(st.nextToken());
					set &= ~(1 << (x-1));
					break;
				case "check" :
					x = Integer.parseInt(st.nextToken());
					if((set & (1 << (x-1))) != 0) sb.append("1\n");
					else sb.append("0\n");
					break;
				case "toggle" :
					x = Integer.parseInt(st.nextToken());
					set ^= (1 << (x-1));
					break;
				case "all" :
					set |= (~0);
					break;
				case "empty" :
					set &= 0;
					break;
			}
		}
		System.out.print(sb);
	}
}