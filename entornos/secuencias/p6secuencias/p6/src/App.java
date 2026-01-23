import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String paren = sc.next();
        Boolean encontrado = false;
        boolean correcto = true;
        int contador = 0;
        int i = 0;

        while (!encontrado&&i<paren.length()){
            char c = paren.charAt(i);

            if (c=='.'){
                encontrado = true;
            }
            if (c == '('){
                contador++;
            } else if (c == ')') {
                contador --;
            }

            if (contador<0){
                correcto = false;
            }

            i++;
        }

        if (contador!=0){
            correcto = false;
        }

        if (correcto){
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}