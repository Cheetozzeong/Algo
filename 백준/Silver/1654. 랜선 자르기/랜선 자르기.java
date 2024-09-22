import java.io.*;
import java.util.*;

// 이분 탐색을 진행할건데 원래는 arr[i]인 KEY 값이랑 인덱스의 중간값을 비교해서
// 그거보다 크면 오른쪽에서 다시 mid를 찾고
// 작으면 왼쪽에서 찾는 과정이었음
// 여기서는 key값 즉 구하려는 값은 랜선의 길이값(나누려는) 이고 인덱스는 갯수임.
// 랜선의 길이값을 다 입력 받아 정렬 부터 진행 하자
public class Main{
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st  = new StringTokenizer(br.readLine());
//		StringBuilder sb = new StringBuilder();

		int K = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());

		int [] length = new int [K];

		long max = 0;

		for (int i = 0; i < K; i++) {
			length[i] = Integer.parseInt(br.readLine());
			if(max < length[i]) {
				max = length[i];
			}
		}

		long min = 0;
		long mid;
		max += 1;

		while(min < max) {
			mid = min + ((max - min) / 2);

			long count = 0;

			for (int i = 0; i < length.length; i++) {
				count += (length[i]/mid);
			}

			if(count < N) {
				max = mid;
			} else {
				min = mid+1;
			}

		}

		System.out.println(min - 1);
	}
}