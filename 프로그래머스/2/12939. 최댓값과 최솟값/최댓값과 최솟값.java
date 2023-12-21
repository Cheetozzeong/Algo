import java.util.*;
import java.io.*;

class Solution {
    public String solution(String s) throws Exception {
		StringTokenizer st = new StringTokenizer(s," ");
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		while(st.hasMoreTokens()) {
			int now = Integer.parseInt(st.nextToken());
			if(min > now) min = now;
			if(max < now) max = now;

		}

		String answer = min+" "+max;
		return answer;
	}
}