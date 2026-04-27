import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] a = new int[n];
        boolean noHayDoble = true;

        for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            
        if (n>=2){
            for (int i = 1; i < n; i++) {
                for (int j = 0; j < i; j++) {
                    if (a[i] == 2*a[j]){
                        noHayDoble = false;
                    }
                }
            }
            
            if (noHayDoble){
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
        sc.close();
    }
}
