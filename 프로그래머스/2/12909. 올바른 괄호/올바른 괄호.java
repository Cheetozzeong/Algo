import java.util.*;
import java.io.*;

class Solution {
    boolean solution(String s) throws Exception {
			Queue<Character> q = new ArrayDeque<>();

			boolean answer = true;
                
            for(int i=0; i<s.length(); i++) {
                if(s.charAt(i) == '(') {
                    q.add(s.charAt(i));
                } else {
                    if (q.size() == 0) return false;
                    q.poll();
                }
                
            }
            if(q.size() == 0) answer = true;
            else answer = false;
			return answer;
	}
}