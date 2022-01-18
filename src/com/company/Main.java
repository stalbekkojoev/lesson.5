package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(1000);
        boss.setDamage(50);
        boss.setSupers("большой удар");
        System.out.println("Жизнь: "+boss.getHealth() + "\nУрон: " + boss.getDamage()+"\nCила: "+ boss.getSupers());
        Hero[] geektech = createHeroes();
        for (Hero hero:geektech ) {
            System.out.println("жизнь: " + hero.getHelATH() + "\nУрон: " + hero.getDamage() +"\nсила: "+ hero.getSupers())
            ;
        }


    }
    public static Hero[] createHeroes(){
        Hero stalbek = new Hero(300,20,"оперкод");
        Hero albert =new Hero(400,25);
        Hero adilet = new Hero(350,30);
        Hero[] geektech = {stalbek,albert,adilet};
        return geektech;

    }
}
