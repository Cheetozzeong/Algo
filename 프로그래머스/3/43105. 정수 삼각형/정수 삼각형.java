class Solution {
	public int solution(int[][] triangle) {
		int answer = 0;
		int N = triangle.length;
		int [][] maker = new int [N][]; // 한 행에 대해서는 나중에 선언해도 된단다
		maker[0] = new int [1]; // maker의 0번째 행에 1크기짜리 배열을 선언
		maker[0][0] = triangle[0][0]; // 첫 번째 항목만 똑같이 만들어주기

		for(int i = 0 ; i < N - 1 ; i++){ // 삼각형 배열의 길이 만큼 반복문
			maker[i + 1] = new int [i + 2]; // 그 행에 맞도록하는 개수의 배열 선언 0 아래꺼 선언해주는 거라서 i+1이고 i+2의 크기 인걸로 선언
			for(int j = 0 ; j < i + 1 ; j++){
				if (maker[i + 1][j] < triangle[i + 1][j] + maker[i][j])
					maker[i + 1][j] = triangle[i + 1][j] + maker[i][j];
				if (maker[i + 1][j + 1] < triangle[i + 1][j + 1] + maker[i][j])
					maker[i + 1][j + 1] = triangle[i + 1][j + 1] + maker[i][j];
			}
		}
		for(int i = 0 ; i < N ; i++){
			if (answer < maker[N - 1][i])
				answer = maker[N - 1][i];
		}
		return answer;
	}
}