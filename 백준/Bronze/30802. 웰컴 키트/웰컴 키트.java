import java.util.*;
import java.io.*;

public class Main {
	private static int N, T, P; // N: 참가자 수, T: 티셔츠 묶음, P: 펜 묶음 
	private static int[] sizes; // 선택한 티셔츠 사이즈 값을 저장할 배열. index오름차순으로 S, M, L, XL, XXL, XXXL
	private static int minBundleOfT; // output. 최소 티셔츠 묶음 수
	private static int maxBundleOfP, remainP; // output. 최대 펜 묶음 수, 낱개로 주문하는 펜 수
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		N = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		sizes = new int[6];
		for(int i=0;i<6;i++){
			sizes[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		T = Integer.parseInt(st.nextToken());
		P = Integer.parseInt(st.nextToken());

		calculateT();
		calculateP();

		StringBuilder sb = new StringBuilder();
		sb.append(minBundleOfT);
		sb.append("\n");
		sb.append(maxBundleOfP).append(" ").append(remainP);
		System.out.println(sb);
	}

	static void calculateT(){
		for(int i=0;i<6;i++){
			int num = sizes[i];
			if(num==0){ 
				continue;
			}
			minBundleOfT += num / T; 
			if(num%T > 0){ 
				minBundleOfT++;
			}
		}
	}

	static void calculateP(){
		maxBundleOfP = N / P; 
		remainP = N % P; 
	}
}