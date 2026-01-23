package es.cide.prog;

public class Main{
    public static void main(String[] args) {

        CocheCombustion cochecillo = new CocheCombustion("0097 DFJ","Mazda",2,220,3.8);
        System.out.println(cochecillo.mostrarInfo());

        CocheElectrico coche2 = new CocheElectrico("1245 ABC", "Sioque", 4, 120);
        System.out.println(coche2.mostrarInfo());
        System.out.println(coche2.cargarBateria());
        System.out.println(coche2.getNivelBateria());

        Patinete patin = new Patinete("7151 PDF", "Xiaomi");
        System.out.println(patin.mostrarInfo());
        System.out.println(patin.cargarBateria());
        System.out.println(patin.getNivelBateria());
    }
}