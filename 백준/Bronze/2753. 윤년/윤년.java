import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		boolean isYoon = false;

		if((N%4 == 0 && N%100 != 0) || (N%4 == 0 && N%400 == 0)) isYoon = true;
		
		if (isYoon) System.out.print(1);
		else System.out.print(0);
	}
}