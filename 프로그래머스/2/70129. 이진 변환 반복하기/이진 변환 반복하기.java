class Solution {
    public int removeZeroCount(String s){
            String removeZero = s.replace("0","");
            return s.length()-removeZero.length();
        }
        public int[] solution(String s){
            int count=0;
            int totalRemoveZero = 0;
            while(!s.equals("1")){
                int zeroCount = removeZeroCount(s);
                count++;
                totalRemoveZero+=zeroCount;
                int length = s.length()-zeroCount;
                s = Integer.toBinaryString(length);

            }
            return new int[]{count,totalRemoveZero};
    }
}