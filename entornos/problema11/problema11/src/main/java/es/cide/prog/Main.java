package es.cide.prog;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nCent4 = 4;
        int nCent7 = 7;
        int total = 0;
        int cont4 = 4;
        int cont7 = 7;

        int n = sc.nextInt();

        while (total != n) {
            if (total > n) {
                total = total - nCent7;
                cont7--;
                total = total + nCent4;
                cont4++;
            }
            while (total <= n) {
                total = total + nCent7;
            }
        }
        System.out.println(cont7);
        System.out.println(cont4);

    }
}