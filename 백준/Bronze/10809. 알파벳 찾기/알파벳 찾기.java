
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] alpha = new int[26];
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for(int i = 0;i<alpha.length;i++){
            alpha[i]=-1;
        }
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if(alpha[c-97]==-1){
                alpha[c-97]=i;
            }
        }
        for(int a : alpha) {
            System.out.print(a+" ");
        }
    }
}