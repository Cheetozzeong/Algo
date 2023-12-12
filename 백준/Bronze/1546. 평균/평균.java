import java.io.*;
import java.util.*;

public class Main {
	public static void main (String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());

		st = new StringTokenizer(br.readLine());
		double[] arr = new double[N];
		double max= Integer.MIN_VALUE;
		double sum = 0;
		for(int i =0; i<N; i++) {
			arr[i] = Double.parseDouble(st.nextToken());
			if(arr[i]>max) max = arr[i];
		}

		for(int i=0; i<arr.length; i++) {
			arr[i] = (arr[i]/max) * 100;
			sum += arr[i];
		}

		System.out.print(sum/(double)N);
	}
}
