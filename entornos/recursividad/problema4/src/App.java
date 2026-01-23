public class App {

    public static boolean isPerfectPrime(int n) {
        if (n < 10) {
            if (n == 1 || n == 2 || n == 3 || n == 5 || n == 7) {
                return true;
            } else {
                return false;
            }
        }

        return isPerfectPrime(n/10);
    }

    public static int sumDigits(int n) {
        return sumDigits(n%10)+n;
    }

    public static boolean isPrime(int n) {
        return isPrime(n);
    }

    public static void main(String[] args) {
        System.out.println(isPerfectPrime(977));
    }
}
