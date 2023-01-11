import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int answer = 0;
        String[] strings = {"c=","c-","dz=","d-","lj","nj","s=","z="};
        Scanner sc= new Scanner(System.in);
        String str = sc.next();
        for(String a : strings){
            if(str.contains(a)){
                str=str.replace(a,"!");
            }
        }
        answer+=str.length();
        System.out.println(answer);
    }
}