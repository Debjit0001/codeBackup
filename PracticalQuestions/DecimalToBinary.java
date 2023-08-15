package PracticalQuestions;

public class DecimalToBinary {
    public static void main(String[] args) {
        int n = 50;
        long ans = 0, k=n;
        while(n!=0) {
            ans = ans*10 + n%2;
            n/=2;
        }
        if(k%2==0)
            ans *= 10;

        System.out.println(ans);
    }
}
