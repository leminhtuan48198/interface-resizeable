package com.codegym;

public class ResizeableTest {
    public static void main(String[] args) {
        Circle[] circles=new Circle[3];
                circles[0]=new Circle(1);
                circles[1]=new Circle(2);
                circles[2]=new Circle(3);
        for (Circle circle:circles
             ) {
            System.out.println("Dien tich hinh tron truoc khi tang la "+circle.getArea());
            double percent=Math.random()*99+1;
            circle.resizeable(percent);
            System.out.println("Ban kinh hinh tron da tang len "+percent+"%");
            System.out.println("Dien tich hinh tron sau khi tang la "+circle.getArea());
        }
        Rectangle[] rectangles=new Rectangle[3];
                rectangles[0]=new Rectangle(1,2);
                rectangles[1]=new Rectangle(2,3);
                rectangles[2]=new Rectangle(4,3);
        for (Rectangle rectangle:rectangles
             ) {
            System.out.println("Dien tich hinh chu nhat truoc khi tang la "+rectangle.getArea());
            double percent=Math.random()*99+1;
            rectangle.resizeable(percent);
            System.out.println("Kich thuoc hinh chu nhat da tang len "+percent+"%");
            System.out.println("Dien tich hinh chu nhat sau khi tang la "+rectangle.getArea());
        }
    }
}
