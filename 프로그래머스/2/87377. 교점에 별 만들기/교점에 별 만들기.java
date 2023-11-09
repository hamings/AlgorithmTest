import java.util.*;
class Solution {
    private static class Point{
        public final long x,y;
        public Point(long x, long y){
            this.x = x;
            this.y = y;
        }
    }
    private Point intersaction(long a, long b, long e, long c,long d, long f){
        double x = (double)(b*f-e*d)/(a*d-b*c);
        double y = (double)(e*c-a*f)/(a*d-b*c);

        if(x%1!=0||y%1!=0) return null;
        return new Point((long)x,(long)y);
    }
    private Point getMinimumPoint (List < Point > points) {
            long minimumX = Long.MAX_VALUE;
            long minimumY = Long.MAX_VALUE;

            for (Point point : points) {
                minimumX = Math.min(minimumX, point.x);
                minimumY = Math.min(minimumY, point.y);
            }
            return new Point(minimumX, minimumY);
        }
        private Point getMaximumPoint (List < Point > points) {
            long maximumX = Long.MIN_VALUE;
            long maximumY = Long.MIN_VALUE;

            for (Point point : points) {
                maximumX = Math.max(maximumX, point.x);
                maximumY = Math.max(maximumY, point.y);
            }
            return new Point(maximumX, maximumY);
        }
    public String[] solution(int[][] line) {
        List<Point> points = new ArrayList<>();
        for(int i = 0;i< line.length;i++){
            for(int j = i+1;j< line.length;j++){
                Point inseractionPoint = intersaction(line[i][0],line[i][1],line[i][2],
                                                    line[j][0],line[j][1],line[j][2]);
                if(inseractionPoint!=null){
                    points.add(inseractionPoint);
                }
            }
        }

        Point minimum = getMinimumPoint(points);
        Point maximum = getMaximumPoint(points);

        int width = (int)(maximum.x-minimum.x+1);
        int height = (int)(maximum.y-minimum.y+1);

        char[][] arr = new char[height][width];
        for(char[] row : arr){
            Arrays.fill(row,'.');
        }

        for(Point point:points){
            int x = (int)(point.x- minimum.x);
            int y = (int)(maximum.y- point.y);
            arr[y][x]='*';
        }

        String[] answer = new String[arr.length];
        for(int i = 0;i< answer.length;i++){
            answer[i]=new String(arr[i]);
        }
        return answer;
    }
}