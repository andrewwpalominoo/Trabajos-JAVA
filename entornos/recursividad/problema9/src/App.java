public class App {
    public static int countD(String s) {
        if (s.length() == 0) {
            return 0;
        } else {
            if (s.charAt(0) == 'd') {
                return 1 + countD(s.substring(1));
            } else {
                return countD(s.substring(1));
            }
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println(countD("ddDDssdDd"));
    }
}
