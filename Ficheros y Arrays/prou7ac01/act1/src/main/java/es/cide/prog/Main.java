//Andrés Palomino Cassain

package es.cide.prog;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una ruta");
        String ruta = sc.nextLine();

        File directorio = new File(ruta);
        if (directorio.exists() && directorio.isDirectory()) {
            System.out.println("La ruta existe");
            String[] content = directorio.list();
            if (content != null) {
                for (String nombre : content) {
                    System.out.println(nombre);
                }
            }
        } else {
            System.out.println("La ruta no existe");
        }
    }
}