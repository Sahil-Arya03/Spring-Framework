package org.standalone;

import java.util.List;
import java.util.Properties;

public class Standalone {
    private List<String> list;
    private Properties pros;

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Properties getPros() {
        return pros;
    }

    public void setPros(Properties pros) {
        this.pros = pros;
    }

    @Override
    public String toString() {
        return "Standalone{" +
                "list=" + list +
                ", pros=" + pros +
                '}';
    }
}
