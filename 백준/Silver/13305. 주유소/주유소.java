import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main { 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;
        int n = Integer.parseInt(br.readLine());
        int[] length = new int[n-1];
        st=new StringTokenizer(br.readLine());
        for(int i = 0;i<n-1;i++){
            length[i]=Integer.parseInt(st.nextToken());
        }
        st= new StringTokenizer(br.readLine());
        int[] price = new int[n];
        int index=0;
        int minPrice =Integer.MAX_VALUE;
        for(int i = 0;i<n-1;i++){
            price[i]=Integer.parseInt(st.nextToken());
            if(minPrice>price[i]){
                minPrice=price[i];
                index=i;
            }
        }
        long sum = length[0]*price[0] ;

        for(int i = 1;i<n-1;i++){
            if(i<index) {
                sum += price[i - 1] < price[i] ? price[i-1]*length[i]:price[i]*length[i];
            }else{
                sum+=price[index]*length[i];
            }
        }
        System.out.println(sum);
    }
}
