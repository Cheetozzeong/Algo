import java.util.*;
import java.io.*;

// 맨 앞글자 or 앞이 공백인 다음 시작하는 단어 -> 대문자로 변경해주기
// 그렇지 않은 케이스 -> 소문자로 변경해주기

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<s.length(); i++) {
            if(i == 0 || s.charAt(i-1) == ' ') { // 처음이거나 내 앞 글자가 공백일 때
                sb.append(Character.toUpperCase(s.charAt(i)));
            } else {
                sb.append(Character.toLowerCase(s.charAt(i)));               
            }
        }
        String answer = sb.toString();
        return answer;
    }
}