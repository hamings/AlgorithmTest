import java.util.*;
class Solution {
    public int solution(String dirs) {
            Set<String> set = new HashSet<>();
            int fromX = 0;
            int fromY = 0;
            for (String direction : dirs.split("")) {
                int toX = fromX;
                int toY = fromY;
                String road = "";
                switch (direction) {
                    case "U":
                        toY++;
                        road+=fromX+" ";
                        road+=fromY+" ";
                        road+=toX+" ";
                        road+=toY+" ";
                        break;
                    case "D":
                        toY--;
                        road+=toX+" ";
                        road+=toY+" ";
                        road+=fromX+" ";
                        road+=fromY+" ";
                        break;
                    case "L":
                        toX--;
                        road+=toX+" ";
                        road+=toY+" ";
                        road+=fromX+" ";
                        road+=fromY+" ";
                        break;
                    case "R":
                        toX++;
                        road+=fromX+" ";
                        road+=fromY+" ";
                        road+=toX+" ";
                        road+=toY+" ";
                        break;

                }
                if (toX < -5 || toX > 5 || toY < -5 || toY > 5) continue;
                set.add(road);
                fromX = toX;
                fromY = toY;

            }

            return set.size();
        }

    
}