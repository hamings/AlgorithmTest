import java.io.*;


public class Main{
    public static void main(String[] args) throws IOException{
        String[][] strings = new String[5][15];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<5;i++){
            String[] split = br.readLine().split("");
            for(int j = 0;j<split.length;j++){
                strings[i][j]=split[j];
            }
            for(int j = split.length;j<15;j++){
                strings[i][j]="NULL";
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<15;i++){
            for(int j = 0;j<5;j++){
                if(strings[j][i].equals("NULL")){
                    continue;
                }
                sb.append(strings[j][i]);
            }
        }
        System.out.println(sb);
    }
}