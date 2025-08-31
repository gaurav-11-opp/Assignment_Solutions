import java.util.Scanner;

public class SumNatural {
    static int sumOfNatural(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Sum of first " + n + " natural numbers is: " + sumOfNatural(n));
        sc.close();
    }
}
