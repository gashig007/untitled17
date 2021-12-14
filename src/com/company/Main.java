package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setDamage(20);
        boss.setHeight(500);
        boss.setProtection("уклонение");
        System.out.println(boss.getHeight() + " " + boss.getDamage() + " " + boss.getProtection());

    }
}
