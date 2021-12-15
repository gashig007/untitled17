package com.company;

public class Hero {
    private int height;
    private int damage;
    private String superpower;

    public Hero(String superpower) {
        this.height = height;
        this.damage = damage;
        this.superpower = superpower;
    }

    public Hero(int height, int damage) {
        this.height = height;
        this.damage = damage;
    }


    public int getDamage() {

        return damage;
    }

    public int getHeight() {

        return height;
    }

    public String getSuperpower() {

        return superpower;
    }

}


