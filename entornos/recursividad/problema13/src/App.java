import java.util.Scanner;

public class App {
    // Funció auxiliar per calcular el mínim de dos enters
    public static int min(int a, int b) {
        if (a >= b)
            return b;
        else
            return a;
    }

    public static int petit(int x) {
        if (x < 10)
            return x;
        else {
            return 10 * petit(x / 10) + min(x % 10, petit(x / 10) % 10);
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt(); 

        System.out.println(petit(x));

        sc.close();
    }
}
