import java.util.Scanner;

public class pregunta2 {
    public static int countaa(String s) {
        if (s.length() == 2) {
            if (s.charAt(0) == 'a' && s.charAt(1) == 'a') {
                    return 1;
                }
            else {
                return 0;
            }
        } else {
                if (s.charAt(0) == 'a' && s.charAt(1) == 'a' && s.charAt(2) == 'a') {
                    return countaa(s.substring(1)) + 2;
                } else if (s.charAt(0)=='a' && s.charAt(1) == 'a') {
                    return countaa(s.substring(1)) + 1;
                }
                else {
                    return countaa(s.substring(1));
                }
            
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int solucion = countaa(a);
        System.out.println(solucion);
        sc.close();
    }
}
