package org.framework.SterotypeAnnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
//@Component("kcd") for specifying the bean name
public class Amnex {
    @Value("Bangalore")
    private String location;
    @Value("100")
    private int employeeCount;
    @Value("#{temp}")
    private List<String> list;

    public Amnex() {
        super();
    }

    public Amnex(String location, int employeeCount) {
        super();
        this.location = location;
        this.employeeCount = employeeCount;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getEmployeeCount() {
        return employeeCount;
    }

    public void setEmployeeCount(int employeeCount) {
        this.employeeCount = employeeCount;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Amnex{" +
                "location='" + location + '\'' +
                ", employeeCount=" + employeeCount +
                ", list=" + list +
                '}';
    }
}
