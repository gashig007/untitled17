package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setDamage(20);
        boss.setHeight(500);
        boss.setProtection("уклонение");
        System.out.println(boss.getHeight() + " " + boss.getDamage() + " " + boss.getProtection());
        for (int i = 0; i < createHeroes().length; i++) {

            System.out.println(createHeroes()[i].getHeight() + " " + createHeroes()[i].getDamage() + " " + createHeroes()[i].getSuperpower());

        }
    }

    public static Hero[] createHeroes() {
        Hero hero1 = new Hero(100, 20);
        Hero hero2 = new Hero(100, 15);
        Hero hero3 = new Hero(100, 10);
        Hero[] hero = {hero1, hero2, hero3};
        return hero;

    }
}
