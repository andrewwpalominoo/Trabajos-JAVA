package es.cide.prog;

public class Robot {

    // Atr
    static String nombre = "R2D2";
    static int energia = 55;
    static int fuerza = 15;

    // Cons
    public static void Robot(String nomnbre, int energia, int fuerza) {
        nombre = Robot.nombre;
        energia = Robot.energia;
        fuerza = Robot.fuerza;
    }

    // GetSet

    public static String getNombre() {
        return nombre;
    }

    public static int getEnergia() {
        return energia;
    }

    public static int getFuerza() {
        return fuerza;
    }

    // Metodos
    public static boolean superarObstaculo() { // Si tras pasar por el obstaculo tiene energia es true, sino false
        energia -= Obstaculo.getDificultad() * 2;

        if (energia > 0) {
            System.out.println("El robot aún tiene energía");
            return true;
        } else {
            System.err.println("El robot se ha quedado sin energía");
            return false;
        }
    }
}
