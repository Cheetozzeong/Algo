class Solution {
	public static int solution(int n, int[][] computers) {
		boolean[] isNet = new boolean[n];
		int answer = 0;

		for(int i =0; i < n; i++) {
			if(!isNet[i]) {
				answer++;
				dfs(computers, i, n, isNet);
			}
		}
		return answer;
	}

	static void dfs(int[][] computers, int i, int n, boolean[] isNet) {
		isNet[i] = true;
		for(int j = 0; j<n; j++) {
			if(!isNet[j] && computers[i][j] == 1) {
				dfs(computers, j, n, isNet);
			}
		}
	}
}