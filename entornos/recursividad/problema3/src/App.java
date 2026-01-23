public class App {
    
    public static boolean creciente(int n) {

        if (n < 10) {
            return true;
        } else {
            if((n%10)>=(n/10)%10){
                return creciente((n/10));
            } else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        if (creciente(125433)){
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
    }
}
