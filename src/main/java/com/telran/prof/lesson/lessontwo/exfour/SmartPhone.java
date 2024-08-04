package com.telran.prof.lesson.lessontwo.exfour;

public class SmartPhone extends Phone {

    private String lcd;

    private int memorySize;

    @Override
    public void call() {
        System.out.println("Call from smartphone " + super.getName());
    }

    public String getLcd() {
        return lcd;
    }

    public void setLcd(String lcd) {
        this.lcd = lcd;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }

    public void showInfo() {
        System.out.println("Phone name = " + super.getName() + " display = " + this.lcd);
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "lcd='" + lcd + '\'' +
                ", memorySize=" + memorySize +
                '}';
    }
}
