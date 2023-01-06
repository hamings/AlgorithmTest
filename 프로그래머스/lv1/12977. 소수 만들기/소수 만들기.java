import java.util.ArrayList;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
            ArrayList<Integer> arrayList = new ArrayList<>();
            for(int i = 0;i<nums.length-2;i++){
                for(int j = i+1;j<nums.length-1;j++){
                    for(int k = j+1;k<nums.length;k++){
                        arrayList.add(nums[i]+nums[j]+nums[k]);
                    }
                }
            }

            for(int a : arrayList){
                for(int i = 2;i<a;i++){
                    if(a%i==0){
                       break;
                    }else if(i==a-1){
                        answer++;
                    }
                }
            }
            return answer;
    }
}