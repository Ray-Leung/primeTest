import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by Administrator on 2015/9/28.
 */
public class IsPrime {
    public static void main(String[] args) {
        int count = 0;
        long startTime = System.currentTimeMillis();
        Queue<Integer> primeStack = new LinkedList<Integer>();
        for (int a = 1; a < 1000000; a++) {
            boolean test = testPrime(a);
            if (test){
                primeStack.offer(a);
                 count = count + a;
                System.out.print(a+"\t");
                 if (count >= 1000000) {
                     count = count - a;
                     break;
                     }
                 }
            }
        boolean test = testPrime(count);
        while (! test) {
            count = count - primeStack.poll();
            test = testPrime(count);
        }
        System.out.println("\n total prime number: "+ count+ " total added prime number: " + (primeStack.size() - 1));
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("\n Run time: "+totalTime);
    }

    public static boolean testPrime(int n){
        if (n<=1) {
            return false;
        }
        else if(n == 2){
            return true;
        }
        else if (n%2==0){
            return false;
        }
        else {
            for (int i = 3; i * i <= n; i+=2) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}

