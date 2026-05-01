package org.refstest;
//B is standalone class
public class B {
    private int y;
    private String city;
    private String department;

    public B() {
        super();
    }

    public B(int y, String city, String department) {
        this.y = y;
        this.city = city;
        this.department = department;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "B{" +
                "y=" + y +
                ", city='" + city + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
