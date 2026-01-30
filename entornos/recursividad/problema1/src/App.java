import java.util.Scanner;

public class App {
        // Funció recursiva que retorna el nombre de dígits
    public static int numberOfDigits(int n) {
        if (n < 10) return 1;
        else return 1 + numberOfDigits(n / 10);
    }
    // Utilitzem la función al main per verificar la seva funcionalitat.
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(numberOfDigits(n));

        sc.close();
    }
}
