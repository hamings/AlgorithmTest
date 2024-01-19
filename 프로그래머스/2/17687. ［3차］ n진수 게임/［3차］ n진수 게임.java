import java.util.*;
class Solution {
    public String solution(int n, int t, int m, int p) {
        StringBuilder appendString = new StringBuilder();
            int totalLength = t*m;
            for(int i = 0;i<100000;i++){
                if(appendString.length()>=totalLength) break;
                String number = Integer.toString(i,n).toUpperCase();
                appendString.append(number);
            }
            StringBuilder findAnswer = new StringBuilder();
            for(int i=p-1;i<totalLength;i+=m){
                char c = appendString.charAt(i);
                findAnswer.append(c);
            }

            return findAnswer.toString();
    }
}