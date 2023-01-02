import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int answer = 0;
        
        if(a==b&&b==c){
            answer=10000+1000*a;
        }else if(a==b||b==c||a==c){
            if(a==b||a==c){
                answer=1000+100*a;
            }else{
                answer=1000+100*b;
            }
}else{
        answer=100*Math.max(a,Math.max(b,c));
    }
        System.out.println(answer);
    }
}