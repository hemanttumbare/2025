package com.oops.concepts.polymorphism;

interface poly {
    void draw();
}

public class Overriding {

    public static void main(String[] args) {

        Size circle = new Circel();
        Size square = new Square();

        circle.draw();
        circle.paint();
        System.out.println(circle.a);

        square.draw();
        square.paint();
        System.out.println(square.a);
    }
}

class Size  {
    public int a=10;
    public void draw(){
        System.out.println("Size Class");
    }

    public void paint(){
        System.out.println("Paint of Size Class");
    }

}

class Circel extends Size implements poly {
    public int a=20;
    public void draw(){
        System.out.println("Circle Class");
    }
    public void paint(){
        System.out.println("Paint of Circle Class");
    }
}

class Square extends Size implements poly {
    public int a=30;
    public void draw(){
        System.out.println("Square Class");
    }
    public void paint(){
        System.out.println("Paint of Square Class");
    }
}
