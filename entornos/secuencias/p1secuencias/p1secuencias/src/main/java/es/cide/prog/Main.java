package es.cide.prog;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        boolean i = false;
        int num = 0;

        while (i!=true && num!=0){
            num = sc.nextInt();
            if (num%2==0){
                i=true;
                System.out.println("Si tiene par");
            }
            if (num%2!=0){
                System.out.println("No tiene par");
            }
        }

    }
}