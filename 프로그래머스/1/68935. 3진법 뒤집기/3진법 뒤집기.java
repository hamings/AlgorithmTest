import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public int solution(int n) {
        String reversed = new StringBuilder(Integer.toString(n, 3)).reverse().toString();
            return Integer.parseInt(reversed, 3);
    }
}