package com.company;

public class lair {
    private String name;
    private Located located;
    private int capacity;

    public lair(String name, Located located, int capacity) {
        this.name = name;
        this.located = located;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public Located getLocated() {
        return located;
    }

    public int getCapacity() {
        return capacity;
    }
}
