import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] localTime = br.readLine().split(":");
        String[] actionTime = br.readLine().split(":");

        int[] needTime = new int[3];
        for(int i=0;i<3;i++){
            needTime[i]=Integer.parseInt(actionTime[i])-Integer.parseInt(localTime[i]);
        }
        if(needTime[2]<0){
            needTime[2]+=60;
            needTime[1]--;
        }
        if(needTime[1]<0){
            needTime[1]+=60;
            needTime[0]--;
        }
        if(needTime[0]<=0){
            needTime[0]+=24;
        }
        System.out.printf("%02d:%02d:%02d",needTime[0],needTime[1],needTime[2]);



    }
}
