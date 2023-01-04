import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer,Integer> array = new HashMap<>();

        for(int i = 0;i<10;i++){
            array.put(sc.nextInt()%42,1);
        }
        System.out.println(array.size());


    }
}