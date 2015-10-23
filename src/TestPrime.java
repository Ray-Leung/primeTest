/**
 * Created by Administrator on 2015/9/28.
 */
public class TestPrime {
    //set a testPrime class to test if the number is prime
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
