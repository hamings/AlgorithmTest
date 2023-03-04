import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = br.readLine().split("");
        while(!strings[0].equals(".")){
            Stack<String> stack = new Stack<>();
            for(int i = 0;i<strings.length;i++){
                if(strings[i].equals("(")||strings[i].equals("[")){
                    stack.push(strings[i]);
                }else if (strings[i].equals(")")){
                    if(stack.empty()||stack.peek().equals("[")){
                        stack.add(strings[i]);
                        break;
                    } else{
                        stack.pop();
                    }
                }else if (strings[i].equals("]")){
                    if(stack.empty()||stack.peek().equals("(")){
                        stack.add(strings[i]);
                        break;
                    } else{
                        stack.pop();
                    }
                }else if(strings[i].equals(".")){
                    break;
                }

            }
            if(stack.empty()){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
            strings = br.readLine().split("");
        }
    }
}
