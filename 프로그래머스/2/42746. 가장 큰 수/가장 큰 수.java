import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public String solution(int[] numbers) {
        return Arrays.stream(numbers).mapToObj(String::valueOf)
                    .sorted((o1, o2) -> {
                        int original = Integer.parseInt(o1+o2);
                        int reverse = Integer.parseInt(o2+o1);
                        return reverse-original;
                    })
            .collect(Collectors.joining(""))
            .replaceAll("^0+","0");

    }
}