package org.framework.ambiguity;

public class Addition {
    private int a ;
    private int b;
    public Addition(int a, int b)
    {
        this.a = a;
        this.b = b;
        System.out.println("Addition constructor: int ,int");
    }
    public Addition(double a, double b)
    {
        this.a = (int)a;
        this.b = (int)b;
        System.out.println("Addition constructor: double ,double");
    }
    public Addition(String a, String b)
    {
        this.a = Integer.parseInt(a);
        this.b = Integer.parseInt(b);
        System.out.println("Addition constructor: String ,String");
    }
    public void getResult()
    {
        System.out.println("Addition Result: "+(a+b));;
    }
}
