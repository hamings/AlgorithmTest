import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;



public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> arrayList = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        int avg = 0;
        int median = 0;
        int mode = 0;
        int range = 0;

        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(br.readLine());
            arrayList.add(a);
            map.put(a, map.getOrDefault(a, 0) + 1);
        }

        Collections.sort(arrayList);
        double sum = 0;
        for (int a : arrayList) {
            sum += a;
        }

        avg = (int)Math.round(sum / n);
        median = arrayList.get(n / 2);
        range = arrayList.get(n - 1) - arrayList.get(0);

        int num = 0;
        for (int a : map.values()) {
            num = Math.max(num, a);
        }

        arrayList.clear();
        for (int a : map.keySet()) {
            if (map.get(a) == num) {
                arrayList.add(a);
            }
        }
        Collections.sort(arrayList);
        mode = arrayList.size() >= 2 ? arrayList.get(1) : arrayList.get(0);

        System.out.println(avg);
        System.out.println(median);
        System.out.println(mode);
        System.out.println(range);


    }
}