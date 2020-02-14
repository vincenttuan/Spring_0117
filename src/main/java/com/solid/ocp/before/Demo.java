package com.solid.ocp.before;

class Rectangle {
    private String name;
    public Rectangle(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return name;
    }
}

class Triangle {
    private String name;
    public Triangle(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return name;
    }
}

class Edit { // 被使用
    public void draw(Rectangle rectangle) {
        System.out.println("繪製" + rectangle);
    }
    public void draw(Triangle triangle) {
        System.out.println("繪製" + triangle);
    }
    // 若要加入圓形 ?? 就違反了開放封閉原則
}

public class Demo {
    public static void main(String[] args) {
        // 使用 Edit 物件
        Edit edit = new Edit();
        edit.draw(new Rectangle("矩形"));
        edit.draw(new Triangle("三角形"));
    }
}



