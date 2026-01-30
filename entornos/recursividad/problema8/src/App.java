import java.util.Scanner;

public class App {
    public static int power(int a, int n) {
        if (n == 1) {
            return a;
        } else {
            return a * power(a, n - 1);
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int resultat = power(a, n);
        System.out.println(resultat);

        sc.close();
    }
}