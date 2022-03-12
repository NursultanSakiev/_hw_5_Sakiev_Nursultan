package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(1000);
        boss.setUron(100);
        boss.setProtectionType("Magik");
        System.out.println("harakteristik of boss:" + " " + boss.getHealth() + " " + boss.getUron() + " " + boss.getProtectionType());
        createHeroes();
        for (int i = 0; i < createHeroes().length; i++) {
            System.out.println("Health: " + createHeroes()[i].getHealth() + " uron: " + createHeroes()[i].getUron() + " superpower: " + createHeroes()[i].getSuperPower());
        }

    }

    public static Hero[] createHeroes() {
        Hero alpha = new Hero(700, 50);
        Hero tanos = new Hero(2000, 150, "Камень реальности!");
        Hero thor = new Hero(1600, 180, "Молот!");
        Hero[] avengers = {alpha, tanos, thor};
        return avengers;
    }


}