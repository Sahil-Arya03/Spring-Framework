package org.config;

import org.springframework.stereotype.Component;

@Component("zoom")
public class zoom {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "zoom{" +
                "name='" + name + '\'' +
                '}';
    }
}
