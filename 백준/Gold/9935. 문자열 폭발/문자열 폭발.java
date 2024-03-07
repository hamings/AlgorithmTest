import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String string = br.readLine();
		String bomb = br.readLine();
		
		Stack<Character> stack = new Stack<Character>();
		for(int i = 0;i<string.length();i++) {
			int count=0;
			stack.add(string.charAt(i));
			if(stack.size()>=bomb.length()) {
				for(int j=0;j<bomb.length();j++) {
					if(stack.get(stack.size()-bomb.length()+j)==bomb.charAt(j)) {
						count++;
					}
				}
				if(count==bomb.length()) {
					for(int k = 0;k<bomb.length();k++) {
						stack.pop();
					}
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		if(stack.size()!=0) {
			for(char c : stack) {
				sb.append(c);
			}
		}else {
			sb.append("FRULA");
		}
		System.out.println(sb);
		
	}
}
