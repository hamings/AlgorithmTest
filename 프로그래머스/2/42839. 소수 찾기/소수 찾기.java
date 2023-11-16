import java.util.*;
class Solution {
   private boolean isPrime(int n){
            if(n<=1) return false;
            for(int i = 2;i*i<=n;i++){
                if(n%i==0) return false;
            }
            return true;
        }
        private Set<Integer> getPrimes(int acc, int[] numbers, boolean[] isUsed, Set<Integer> primes){
            if(isPrime(acc)) primes.add(acc);

            for(int i = 0;i<numbers.length;i++){
                if(isUsed[i]) continue;
                int nextAcc = acc*10+numbers[i];
                isUsed[i]=true;
                primes.addAll(getPrimes(nextAcc,numbers,isUsed,primes));
                isUsed[i]=false;
            }
            return primes;
        }
        
        public int solution (String nums){
            Set<Integer> primes = new HashSet<>();
            int[] numbers = nums.chars()
                                    .map(c->c-'0')
                                    .toArray();
            getPrimes(0,numbers,new boolean[numbers.length],primes);
           
            return primes.size();
}
}