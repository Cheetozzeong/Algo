import java.util.*;
import java.io.*;

class Solution
{
    public int solution(int []A, int []B) throws Exception{
        int answer = 0;
        int length = A.length;
        Arrays.sort(A);
        Arrays.sort(B);
        for(int i=0; i<length; i++) {
            answer = answer+(A[i]*B[length-i-1]);
        }
        return answer;
    }
}