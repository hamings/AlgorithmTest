import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        while(count-->0){
            int num = Integer.parseInt(br.readLine());
            if(palindrome(String.valueOf(num))){
                System.out.println(1);
                continue;
            }
            for(int i=2;i<=64;i++){
                if(palindrome(change(num,i))){
                    System.out.println(1);
                    break;
                }else{
                    if(i==64){
                        System.out.println(0);
                    }
                }

            }
        }


    }
    static String change(int n, int b) {
        int[] arr = new int[30];
        int index = 0;
        while (n != 0) {
            arr[index] = n % b;
            index++;
            n /= b;

        }
        StringBuilder sb = new StringBuilder();
        for (int i = index - 1; i >= 0; i--) {
            if (arr[i] > 9) {
                sb.append((char) (arr[i] + 55));
            } else {
                sb.append(arr[i]);
            }

        }
        return sb.toString();
    }
    static boolean palindrome(String string){
        boolean check=true;
        int left = 0;
        int right = string.length()-1;
        while(left<right){
            if(string.charAt(left)!=string.charAt(right)){
                check=false;
                break;
            }
            left++;
            right--;
        }
        return check;
    }
}
