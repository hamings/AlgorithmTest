import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        
        while((str=br.readLine())!=null){
            int num = Integer.parseInt(str);
            int size = (int)Math.pow(3,num);
            
            sb = new StringBuilder();
            for(int i =0;i<size;i++){
                sb.append("-");
            }
            recursion(0,size);
            System.out.println(sb);
        }

}
    static void recursion(int start, int length){
        if(length==1){
            return;
        }
        int newLength = length/3;
        for(int i = start+newLength;i<start+newLength*2;i++){
            sb.setCharAt(i,' ');
        }
        recursion(start,newLength);
        recursion(newLength*2+start,newLength);
    }

}
