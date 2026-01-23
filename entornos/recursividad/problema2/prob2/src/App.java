public class App {
    public static int reduccion(int x) {
        
        if (x / 10 == 0){
            return x;
        } else {
            return (x%10) + (reduccion(x/10));
        }

    }

    public static int reduccion_suma(int x) {
        
        if (x / 10 == 0){
            return x;
        } else {
            return (x%10) + (reduccion(x/10));
        }

    }

    public static void main(String[] args) {
        System.out.println(reduccion(5966));
    }
}