package org.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

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

    public void destroy() throws Exception
    {
        // destroy
        System.out.println("Cars destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        // init
        System.out.println("Cars init");

    }
}
