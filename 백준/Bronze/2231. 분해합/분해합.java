import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main (String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(br.readLine());
		int result = 0;

		for (int i = 0; i < N; i++) {
			int number = i;
			int sum = 0;

			while(number != 0) {
				sum += number%10;
				number /= 10;
			}

			if(sum + i == N) {
				result = i;
				break;
			}
		}
		System.out.print(result);
	}
}
