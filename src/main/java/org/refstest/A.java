package org.refstest;
// A is dependent on B
public class A {
    private int x;
    private String name;
    private B b;

    public A() {
        super();
    }

    public A(int x, String name, B b) {
        this.x = x;
        this.name = name;
        this.b = b;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "A{" +
                "x=" + x +
                ", name='" + name + '\'' +
                ", b=" + b +
                '}';
    }
}
