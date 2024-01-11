class Solution {
    public int solution(int n, long l, long r) {
            int answer = 0;
            for(long i=l-1;i<r;i++){
                String num = Long.toString(i,5);
                   if(!isContainNumberTwo(num)) {
                    answer++;
                }
            }
            return answer;
        }
        private boolean isContainNumberTwo(String number){
            for (char c : number.toCharArray()) {
                if(c=='2') return true;
            }
            return false;
        }
}