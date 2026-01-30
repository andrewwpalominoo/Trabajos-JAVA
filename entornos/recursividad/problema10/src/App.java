public class App {
    public static int countSi(String s) {
        if (s.length() == 0) {
            return 0;
        } else {
            if (s.charAt(0) == 's') {
                if (s.charAt(1) == 'i') {
                    return 1 + countSi(s.substring(1));
                }
            }
            return countSi(s.substring(1));
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println(countSi("sisinosi"));
    }
}
