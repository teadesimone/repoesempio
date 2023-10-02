package org.example;

public class calcolatrice {

    private int a;
    private int b;

    public calcolatrice(){

        this.a =0;
        this.b =0;
    }
    public void setOperands(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int add (int a, int b){

        return a+b;
    }
    public int sub (int a, int b){

        return a-b;
    }
    public int multiply (int a, int b){

        return a*b;
    }
    public int divide (int a, int b){

        return a/b;
    }
}
