package com.example.cs441_mobilegamedevhw02;

public class items {
    private int id;
    private String name;

    public items(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "items{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
