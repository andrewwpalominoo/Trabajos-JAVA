import java.util.Scanner;

public class pregunta1 {
    public static int engrandir(int x){
        if (x<10){
            return x;
        } else {
            if (engrandir(x/10) < engrandir((x%10)/10)){
                return engrandir((x%10)/10);
            }
            else {
                return engrandir(x/10);
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int solucion = engrandir(a);
        System.out.println(solucion);
        sc.close();
    }
}
