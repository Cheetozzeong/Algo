import java.io.*;
import java.util.*;

public class Main {
	public static void main (String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        
        for(int i  = 1; i <= 9; i++) {
            sb.append(N+" * "+i+" = "+(N*i)+"\n");
        }
		
		System.out.println(sb);
	}
}