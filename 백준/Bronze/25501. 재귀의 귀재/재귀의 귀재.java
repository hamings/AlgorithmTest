import java.util.Scanner;

public class Main {
    static int count;
    public static int recursion(String s,int l, int r){
        count++;
        if(l>=r){
            return 1;
        }else if(s.charAt(l)!=s.charAt(r)){
            return 0;
        }else{
            return recursion(s,l+1,r-1);
        }
    }
    public static int isPalindrome(String s){
        return recursion(s,0,s.length()-1);
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
            count = 0;
            String str = sc.next();
            sb.append(isPalindrome(str)).append(" ").append(count).append("\n");
        }
        System.out.println(sb);
    }
}