class Solution {
    public int solution(int n) throws Exception{
        int answer = 0;
        int equip = 1;
        while(true) {
            if(equip>n) break;
            if(n%equip == 0) answer += equip;
            equip++;
        }
        return answer;
    }
}