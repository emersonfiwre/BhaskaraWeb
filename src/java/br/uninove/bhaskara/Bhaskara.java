package br.uninove.bhaskara;

/**
 *
 * @author limae
 */
public class Bhaskara {
    private int a, b, c;
    private double delta, x1, x2;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public double getDelta() {
        return delta;
    }

    public void setDelta(double delta) {
        this.delta = delta;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }
    
    /*
    Delta = (b*b) - 4 * a * c
    o delta deve ser positivo para se calcualr as raizes
    raizPositiva = (-b + raiz(delta)) / 2 * a
    raizNegativa = (-b - raiz(delta)) / 2 * a
    Calcualr raiz em Java: Math.sqrt()
    */
    
    public double calcularDelta(){
        delta = (b*b) - 4* a *c;
        return delta;
    }
    public double calcularX1(){
        if(delta > 0 ){
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
        }else if(delta ==0){
            x1 = -1;
        }else{
            x1 = 0;
            System.out.println("Essa equação não possui raiz real");
        }
        return x1;
    }
    public double calcularX2(){
        if(delta > 0 ){
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
        }else if(delta ==0){
            x2 = -1;
        }else{
            x2 = 0;
            System.out.println("Essa equação não possui raiz real");
        }
        return x2;
    }
    
}
