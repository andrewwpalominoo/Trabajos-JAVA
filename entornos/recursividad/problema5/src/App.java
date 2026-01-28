import java.util.Scanner;

public class App {
    
    public static int orejas(int n) {
        //Impares = 2 oreja, pares = 3 orejas, contar cuantas orejas hay en total hasta n con recursividad
        // Caso base: si n es 0, no hay más números
        if (n == 0) {
            return 0;
        }
        
        // Si el número es impar: 2 orejas, si es par: 3 orejas
        int orejasPorNumero;
        if (n % 2 == 1) {
            orejasPorNumero = 2;
        } else {
            orejasPorNumero = 3;
        }
        
        // Llamada recursiva con el número anterior (n - 1)
        return orejasPorNumero + orejas(n - 1);
    }
    public static void main(String[] args) throws Exception {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(orejas(n));
    }
}
