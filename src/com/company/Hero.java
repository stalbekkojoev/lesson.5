package com.company;

public class Hero {
    private int helATH;
    private int damage;
    private String supers;

    public int getHelATH() {
        return helATH;
    }

    public void setHelATH(int helATH) {
        this.helATH = helATH;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getSupers() {
        return supers;
    }

    public void setSupers(String supers) {
        this.supers = supers;
    }

    public Hero(int helATH, int damage) {
        this.helATH = helATH;
        this.damage = damage;
    }

    public Hero(int helATH, int damage, String supers) {
        this.helATH = helATH;
        this.damage = damage;
        this.supers = supers;
    }
}
