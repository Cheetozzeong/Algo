import java.io.*;
import java.util.*;

public class Main {
	public static void main (String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");

		int first = Integer.parseInt(st.nextToken());

		if(first == 1) {
			while(first < 8) {
				first++;
				if(Integer.parseInt(st.nextToken()) != first) {
					System.out.println("mixed");
					break;
				}
			}
		} else if(first == 8) {
			while(first > 1) {
				first--;
				if(Integer.parseInt(st.nextToken()) != first) {
					System.out.println("mixed");
					break;
				}
			}
		} else {
			System.out.println("mixed");
		}

		if (first == 8) {
			System.out.println("ascending");
		} else if (first == 1) {
			System.out.println("descending");
		}
	}
}