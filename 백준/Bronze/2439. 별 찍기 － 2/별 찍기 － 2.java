import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N - i; j++) {
				System.out.print(' '); // N-1 ~ 0
			}
			for (int k = 0; k < i; k++) {
				System.out.print('*');
			}
			System.out.println(); // 1 ~ N
		}
	}
}