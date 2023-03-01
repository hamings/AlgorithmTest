import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            String[] strings = br.readLine().split("");
            Stack<String> stack = new Stack<>();
            stack.push(strings[0]);
            for(int j = 1;j< strings.length;j++){
                if(strings[0].equals(")")){
                    break;
                }
                if(strings[j].equals("(")){
                    stack.push("(");
                }else{
                    if(!stack.empty()){
                        stack.pop();
                    }else{
                        stack.push(")");
                        break;
                    }

                }


            }
            if(stack.empty()){
                sb.append("YES").append("\n");
            }else{
                sb.append("NO").append("\n");
            }
        }
        System.out.println(sb);
    }
}