import java.util.Scanner;

public class Main {
    public static void main(String[] args) { //5432165
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] chars = str.toCharArray();
       for(int i = 0;i<str.length()-1;i++){
           for(int j = i+1;j<str.length();j++){
               if(chars[i]<chars[j]){
                   char temp = chars[j];
                   chars[j]=chars[i];
                   chars[i]=temp;
               }
           }
       }
       StringBuilder sb = new StringBuilder();
       for(char c : chars){
           sb.append(c);
       }
        System.out.println(sb);
    }
}