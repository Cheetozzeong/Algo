import java.io.*;
import java.util.*;

public class Main {
	public static void main (String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		HashSet<String> set= new HashSet<>();

		for(int i = 0; i < N; i++) {
			set.add(br.readLine());
		}

		ArrayList<String> arr = new ArrayList<>();
		for(int j =0; j < M; j++) {
			String tmp = br.readLine();
			if(set.contains(tmp)) {
				arr.add(tmp);
			}
		}

		Collections.sort(arr);

		System.out.println(arr.size());
		for(int i =0; i<arr.size(); i++) {
			System.out.println(arr.get(i));
		}
	}
}