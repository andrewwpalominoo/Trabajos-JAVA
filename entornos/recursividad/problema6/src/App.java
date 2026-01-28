public class App {
    public static int contar7(int n) {
        if (n == 0) {
            return 0;
        } else if (n % 10 == 7) {
            return 1 + contar7(n / 10);
        } else {
            return contar7(n / 10);
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println(contar7(717));
    }
}
