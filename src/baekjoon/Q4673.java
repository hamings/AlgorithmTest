package baekjoon;

public class Q4673 { // 셀프 넘버
    public static void main(String[] args) {

        boolean[] flag = new boolean[10001];

        for(int i = 0;i<10001;i++){
            if(d(i)<=10000){
                flag[d(i)]=true;
            }
        }
        for(int i = 0;i<10001;i++){
            if(flag[i]==false){
                System.out.println(i);
            }
        }
    }
    public static int d(int n){
        int sum = n;
        while(n!=0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
}
