public class App {

    public static int sumDigits(int n) {
        if (n<10){
            return n;
        }

        return sumDigits(sumDigits(n%10)+sumDigits(n/10));
    }

    public static boolean isPerfectPrime(int n) {
        if (n < 10) {
            if (n == 1 || n == 2 || n == 3 || n == 5 || n == 7) {
                System.out.println("TRUE");
                return true;
            } else {
                System.out.println("FALSE");
                return false;
            }
        }

        return isPerfectPrime(n/10);
    }

    public static void main(String[] args) {
        System.out.println(sumDigits(555));

    }
}
