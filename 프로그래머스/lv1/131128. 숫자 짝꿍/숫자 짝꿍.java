
class Solution {
    public String solution(String X, String Y) {
         StringBuilder sb = new StringBuilder();
             int[] x = new int[10];
            int[] y = new int[10];

            for(char c : X.toCharArray()){
                x[c-48]++;
            }
            for(char c : Y.toCharArray()){
                y[c-48]++;
            }
            for(int i = 9;i>=0;i--){
                for(int j = 0;j<Math.min(x[i],y[i]);j++){
                    sb.append(i);
                }
            }
            if(sb.length()==0){
                return "-1";
            }else if(sb.charAt(0)=='0'){
                return "0";
            }return sb.toString();
    }
}