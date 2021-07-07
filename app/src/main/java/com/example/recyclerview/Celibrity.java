package com.example.recyclerview;

public class Celibrity {
    private int image;
    private String name;

    public String getCompany() {
        return company;
    }

    private String company;
    private int age;

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Celibrity(int image, String name, int age,String company) {
        this.image = image;
        this.name = name;
        this.age = age;
        this.company=company;
    }
}
