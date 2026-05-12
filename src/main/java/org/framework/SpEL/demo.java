package org.framework.SpEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class demo {


    @Value("#{10}")
    private int firstNumber;

    @Value("#{20}")
    private int secondNumber;

    @Value("#{10<8?4:1312}")
    private int result;

    public demo() {
        super();
    }

    public demo(int firstNumber, int secondNumber, int result) {
        super();
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.result = result;
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "demo{" +
                "firstNumber=" + firstNumber +
                ", secondNumber=" + secondNumber +
                ", result=" + result +
                '}';
    }
}
