import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int n = sc.nextInt();
        int[] numeros = new int [n];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
        }

        Arrays.sort(numeros);
    }
}
