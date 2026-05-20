package Lecture_19;

public class Sieve_of_Eratosthenes {
    public static void main(String[] args) {
     int n=100;
    }
    public static int Prime_Seive(int n){
        int[] Prime =new int[n+1];
        Prime[0]=1;//0 is not prime
        Prime[1]=1;//1 is not prime
        for (int i=2;i*i<Prime.length;i++){
            if (Prime[i]==0){
                for (int j = 2 ; i*j < Prime.length ; j++) {
                    Prime[i*j]=1;
                }
            }
        }
        int c=0;
        for (int i = 2; i < Prime.length; i++) {
            if (Prime[i]==0){
                c++;
            }
        }
        return c;
    }
}
