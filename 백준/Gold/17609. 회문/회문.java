import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        for(int i = 0;i<t;i++){
            String str = br.readLine();
            ArrayList<Character> arrayList = new ArrayList<>();
            for(char c : str.toCharArray()){
                arrayList.add(c);
            }
            if(palindrome(arrayList,0,arrayList.size()-1)==2){
                ArrayList<Character> copyList = (ArrayList<Character>) arrayList.clone();
                copyList.remove(indexA);
                arrayList.remove(arrayList.size()-1-indexA);
                if((palindrome(copyList,0,copyList.size()-1))==0||palindrome(arrayList,0,arrayList.size()-1)==0){
                    sb.append(1).append("\n");
                }else{
                    sb.append(2).append("\n");
                }
            }else {
                sb.append(0).append("\n");
            }


        }
        System.out.println(sb);

    }
    static int indexA;
    static int palindrome(ArrayList<Character> arrayList ,int a,int b){ //s u m m u u s
        if(a>=b){
            return 0;
        }else if(arrayList.get(a)!=arrayList.get(b)){
            indexA = a;
            return 2;
        }else{
            return palindrome(arrayList,a+1,b-1);
        }
    }
}