package org.framework.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Cars implements InitializingBean, DisposableBean {
    private String carName;
    private double price;

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        System.out.println("Setting carName");
        this.carName = carName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        System.out.println("Setting price");
        this.price = price;
    }
    @Override
    public String toString() {
        return "Cars{" + "carName='" + carName + '\'' + ", price=" + price + '}';
    }
@PreDestroy
    public void destroy()
    {
        // destroy
        System.out.println("Cars destroy");
    }
@PostConstruct
    public void afterPropertiesSet()  {
        // init
        System.out.println("Cars init");

    }
}
