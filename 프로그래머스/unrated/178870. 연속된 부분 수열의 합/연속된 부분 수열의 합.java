class Solution {
    public int[] solution(int[] sequence, int k) {
        int left=0;
            int right=sequence.length;
            int sum=0;
            for(int L=0,R=0;L<sequence.length;L++){
                while(R<sequence.length&&sum<k){
                    sum+=sequence[R++];
                }
                if(sum==k){
                    int range = R-L-1;
                    if((right-left)>range){
                        left=L;
                        right=R-1;
                    }
                }
                sum-=sequence[L];
            }
            int[] answer = {left,right};
            return answer;
    }
}