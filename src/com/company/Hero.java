package com.company;

public class Hero {
    private int health;
    private int uron;
    private String superPower;


    public Hero(int health, int uron, String superPower) {
        this.health = health;
        this.uron = uron;
        this.superPower = superPower;
    }

    public Hero(int health, int uron) {
        this.health = health;
        this.uron = uron;
    }

    public int getHealth() {
        return health;
    }

    public int getUron() {
        return uron;
    }

    public String getSuperPower() {
        return superPower;
    }

}
