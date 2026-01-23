package es.cide.prog;

public class Calculadora {
    // atributos
    double op1;
    double op2;

    // constructor
    public Calculadora(double op11, double op22) {
        this.op1 = op11;
        this.op2 = op22;
    }

    // getters setters
    public void setOperando1(double op33) {
        this.op1 = op33;
    }

    public double getOperando1() {
        return this.op1;
    }

    public void setOperando2(double op44) {
        this.op2 = op44;
    }

    public double getOperando2() {
        return this.op2;
    }

    // metodos
    public double sumar() {
        double resultadoSuma = op1 + op2;
        return resultadoSuma;
    }

    public double restar() {
        double resultadoResta = op1 - op2;
        return resultadoResta;
    }

    public double dividir() {
        double resultadoDiv = op1 / op2;
        return resultadoDiv;
    }

    public double multiplicar() {
        double resultadoMulti = op1 * op2;
        return resultadoMulti;
    }

}
