package org.framework.Springcore;
// implementation of collection injection
import java.util.*;

public class Emp {
    private String empName;
    // the attributes are using collection framework
    private List<String> list;
    private Map<String, String> maps;
    private Set<String> set;

    public Emp(Map<String, String> maps, Set<String> set, List<String> list, String empName)
    {
        this.maps = maps;
        this.set = set;
        this.list = list;
        this.empName = empName;
    }

    public Emp() {
        super();
    }


    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Map<String, String> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empName='" + empName + '\'' +
                ", list=" + list +
                ", maps=" + maps +
                ", set=" + set +
                '}';
    }
}
