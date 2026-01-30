import java.util.Scanner;

public class App {
    public static int count8(int n) {
        if (n==0){
            return 0;
        }

        int lastDigit = n%10;
        int secondLastDigit = (n/10)%10;

        if (lastDigit==0){
            if (secondLastDigit==8){
                return 2 + count8(n/10);
            } else {
                return 1 + count8(n/10);
            }
        } else {
            return + count8(n/10);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int resultat = count8(n);
        System.out.println(resultat);

        sc.close();
    }
}
