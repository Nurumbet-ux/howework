package com.company;

public class Animal {
    private String name;
    private int height;
    private color color;
    private int age;
    private lair lair;

    public com.company.lair getLair() {
        return lair;
    }

    public Animal(int height, color color, int age,lair lair,String name) {
        this.height = height;
        this.color = color;
        this.age = age;
        this.lair = lair;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public com.company.color getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
