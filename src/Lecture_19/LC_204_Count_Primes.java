package Lecture_19;

public class LC_204_Count_Primes {
    public static void main(String[] args) {

    }
    public static boolean IsPrime(int n){
        int div=2;
        while (div*div<=n){
            if (n%div==0){
                return false;
            }
            div++;
        }
        return true;
    }
}
