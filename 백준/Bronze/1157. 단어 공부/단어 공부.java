import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] alpha = new int[26];
        String str = sc.nextLine().toUpperCase();
        for(int i = 0;i<str.length();i++) {
            int num = str.charAt(i) - 65;
            alpha[num]++;
        }
        int max = -1;
        char ch = '.' ;
        for(int j = 0;j< alpha.length;j++){
            if(alpha[j]>max){
                max=alpha[j];
                ch = (char)(j+65);
            }else if(alpha[j]==max){
                ch = '?';
            }
        }
        System.out.println(ch);
    }
}
