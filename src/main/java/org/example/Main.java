package org.example;

import game.Hero;
import game.Weapon;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Weapon gloves = new Weapon("Speed gloves", 8, "hook");
        System.out.println(gloves);

        Hero hero = new Hero("Rocky", 100, gloves);
        System.out.println("Hero: " + hero.getName() + ", HP: "  + hero.getHp() + ", Weapon: " + hero.getWeapon());
        hero.takeDamage(20);

            }

}