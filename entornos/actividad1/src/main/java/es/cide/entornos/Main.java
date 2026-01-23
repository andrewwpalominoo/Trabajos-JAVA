package es.cide.entornos;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        String a=sc.next();
        String b=sc.next();
        
        if (a.compareTo(b) < 0){
            System.out.println(a+ " < " +b);
        }
        else if (a.compareTo(b) > 0){
            System.out.println(a+ " > " +b);
        }
        else{
            System.out.println(a+ " = " +b);
        }
       
        sc.close();
    }
}