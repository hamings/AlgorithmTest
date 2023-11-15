import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        char[][] arr = new char[size][size];
        for(int i = 0;i< arr.length;i++){
            Arrays.fill(arr[i],'*');
        }
        removeStar(0,0,size,arr);
        StringBuilder sb = new StringBuilder();
        for(char[] chars: arr){
            sb.append(chars).append("\n");
        }
        System.out.println(sb);
    }
    public static void removeStar(int offsetX, int offsetY,int size, char[][] arr){
        if(size==1) return;
        int nextSize = size/3;
        for(int i = offsetX+nextSize;i<offsetX+nextSize*2;i++){
            for(int j = offsetY+nextSize;j<offsetY+nextSize*2;j++){
                arr[j][i]=' ';
            }
        }
        for(int i = 0;i<size;i+=nextSize){
            for(int j = 0;j<size;j+=nextSize){
                if(!(i==nextSize&&j==nextSize)){
                    removeStar(offsetX+i,offsetY+j,nextSize,arr);
                }
            }
        }
    }
}
