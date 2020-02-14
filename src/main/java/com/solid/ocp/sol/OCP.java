package com.solid.ocp.sol;

// 加入一個抽象類別
abstract class Shape {
    abstract void draw();
}

class Rectangle extends Shape {
    private String name;
    public Rectangle(String name) {
        this.name = name;
    }
    
    public void draw() {
        System.out.println("繪製" + name);
    }
    
}

class Triangle extends Shape {
    private String name;
    public Triangle(String name) {
        this.name = name;
    }

    public void draw() {
        System.out.println("繪製" + name);
    }
    
}

class Edit { // 被使用
    public void draw(Shape shape) {
        shape.draw();
    }
}

public class OCP {
    public static void main(String[] args) {
        // 使用 Edit 物件
        Edit edit = new Edit();
        edit.draw(new Rectangle("矩形"));
        edit.draw(new Triangle("三角形"));
        
    }
}






