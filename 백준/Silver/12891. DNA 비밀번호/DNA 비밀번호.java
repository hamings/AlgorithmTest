import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] arr=new int[4];
    static int[] checkArr = new int[4];
    static int check=0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int totalLength = Integer.parseInt(st.nextToken());
        int partLength = Integer.parseInt(st.nextToken());

        char[] chars = br.readLine().toCharArray();

        st= new StringTokenizer(br.readLine());
        for(int i = 0;i<4;i++){
            arr[i]=Integer.parseInt(st.nextToken());
            if(arr[i]==0){
                check++;
            }
        }

        int result = 0;
        for(int i = 0;i<partLength;i++){
            add(chars[i]);
        }

        if(check==4){
            result++;
        }
        for(int i = partLength;i<totalLength;i++){
            int j = i-partLength;
            add(chars[i]);
            remove(chars[j]);
            if(check==4){
                result++;
            }
        }
        System.out.println(result);

        }

    static void add(char c) {
    if(c=='A'){
        checkArr[0]++;
        if(checkArr[0]==arr[0]){
            check++;
        }
    }else if(c=='C'){
            checkArr[1]++;
            if(checkArr[1]==arr[1]){
                check++;
            }
    }else if(c=='G'){
            checkArr[2]++;
            if(checkArr[2]==arr[2]){
                check++;
            }
    }else if(c=='T'){
            checkArr[3]++;
            if(checkArr[3]==arr[3]){
                check++;
            }
    }

    }
    static void remove(char c){
        if(c=='A'){
            if(checkArr[0]==arr[0]){
                check--;
            }
            checkArr[0]--;
        }else if(c=='C'){
            if(checkArr[1]==arr[1]){
                check--;
            }
            checkArr[1]--;
        }else if(c=='G'){
            if(checkArr[2]==arr[2]){
                check--;
            }
            checkArr[2]--;
        }else if(c=='T'){
            if(checkArr[3]==arr[3]){
                check--;
            } checkArr[3]--;
        }
    }
}
