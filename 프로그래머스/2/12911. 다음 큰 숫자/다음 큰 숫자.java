class Solution {
    public int solution(int n) {
        int answer = 0;
        int nCount = Integer.bitCount(n);
        for(int i = n+1;i<=1000000;i++){
            int count = Integer.bitCount(i);
            if(count==nCount) return i;
        }
        return answer;
    }
}