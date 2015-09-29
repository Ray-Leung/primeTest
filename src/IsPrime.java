/**
 * Created by Administrator on 2015/9/28.
 */
public class IsPrime {
    public static void main(String[] args) {
        int count = 0;
        long startTime = System.currentTimeMillis();
        for (int a = 1; a < 1000000; a++) {
            boolean getPrime = TestPrime.testPrime(a);
            if (getPrime == true){
                 count ++;
                System.out.print(a+"\t");
            }
        }
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("\n Run time: "+totalTime);
        System.out.println("\n total prime number: "+ count);
    }
}

