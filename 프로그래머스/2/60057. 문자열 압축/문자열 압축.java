import java.util.*;
class Solution {
    private List<String> split(String s , int length){
            List<String> tokens = new ArrayList<>();
            for(int start = 0;start<s.length();start+=length){
                int end = start+length;
                if(end>s.length()) end=s.length();
                tokens.add(s.substring(start,end));
            }
            return tokens;
        }
        private int compress(String s, int length){
            StringBuilder sb = new StringBuilder();
            String last = "";
            int count = 0;
            for(String str : split(s,length)){
                if(str.equals(last)){
                    count++;
                }else{
                    if(count>1) sb.append(count);
                    sb.append(last);
                    last=str;
                    count=1;
                }
            }
            if(count>1) sb.append(count);
            sb.append(last);
            
            return sb.length();
        }
        public int solution(String s) {
            int answer = Integer.MAX_VALUE;
            for(int i = 1;i<=s.length();i++){
                int compressed = compress(s,i);
                if(compressed<answer){
                    answer=compressed;
                }
            }
            return answer;
}
}