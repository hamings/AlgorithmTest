import java.util.*;
class Solution {
    public String solution(int[] numbers, String hand){
            int left = 10;
            int right = 12;
            StringBuilder sb = new StringBuilder();
            for(int a: numbers){
                if(a==1||a==4||a==7){
                    left=a;
                    sb.append("L");
                }else if(a==3||a==6||a==9){
                    right=a;
                    sb.append("R");
                }else{
                    int leftDistance = calDistance(getX(left),getY(left),a);
                    int rightDistance = calDistance(getX(right),getY(right),a);
                    if(leftDistance==rightDistance){
                        if(hand.equals("left")){
                            rightDistance++;
                        }else{
                            leftDistance++;
                        }
                    }
                    if(leftDistance<rightDistance){
                        left=a;
                        sb.append("L");
                    }else{
                        right=a;
                        sb.append("R");
                    }
                }
            }
            return sb.toString();
        }
        private int getX(int number){
            if(number==0) return 1;
            return (number-1)%3;
        }
        private int getY(int number){
            if(number==0) return 3;
            return (number-1)/3;
        }
        private int calDistance(int preX, int preY, int number){
            int x = getX(number);
            int y = getY(number);
            return Math.abs(preX-x)+Math.abs(preY-y);
        }
}