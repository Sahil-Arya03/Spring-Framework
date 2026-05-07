package org.Autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class company {
    private int empID;
    @Autowired
    @Qualifier("emp34") //WE CAN ADD QUALIFIER TO SPECIFY THE OBJECT
    private emp emp;

    //constructor
    public company()
    {
        super();
    }
    public company(emp emp, int empID)
    {
        super();
        this.emp = emp;
        this.empID = empID;
    }

    //getters and setters
    public int getEmpID() {
        return empID;
    }
    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public emp getEmp() {
        return emp;
    }
    public void setEmp(emp emp) {
        this.emp = emp;
    }

    @Override
    public String toString() {
        return "company{" +
                "empID=" + empID +
                ", emp=" + emp +
                '}';
    }
}
