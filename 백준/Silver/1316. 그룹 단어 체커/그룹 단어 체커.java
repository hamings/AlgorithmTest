import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for(int i = 0;i<n;i++){
            String str = sc.next();
            ArrayList<Character> arrayList = new ArrayList<>();
            for(int j = 1;j<str.length();j++){
                if(str.charAt(j-1)!=str.charAt(j)){ 
                    arrayList.add(str.charAt(j-1));
                    if(arrayList.contains(str.charAt(j))){
                        count++;
                        break;
                    }
                }
            }
        }
        System.out.println(n-count);
    }
}
