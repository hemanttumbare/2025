package com.oops.concepts.polymorphism;

public class OverLoading {

    public double add(int a, int b){
        return a+b;
    }

    public double add(double a, double b){
        return a+b;
    }

    public int add(int a, int b, int c){
        return a+b+c;
    }

    public String concat(String str, int a){
        return str+a;
    }

    public String concat(int a,String str){
        return a+str;
    }

    public static void main(String[] args) {

        OverLoading over = new OverLoading();

        System.out.println( over.add(1,2) );
        System.out.println( over.add(1.0,2.0) );
        System.out.println( over.add(1,2, 3) );
        System.out.println( over.concat("abc",2) );
        System.out.println( over.concat(1,"abc") );


    }

}
