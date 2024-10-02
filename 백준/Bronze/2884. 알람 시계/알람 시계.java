import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int H = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		if(M < 45) {
			M = 60 - (45 - M);
			if(H <= 0) H = 23;
			else H--;
		} else {
			M -= 45;
		}

		System.out.println(H+" "+M);
	}
}