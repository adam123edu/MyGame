package game;

import java.util.Scanner;

public class GameEngine {

    private Scanner scanner = new Scanner(System.in);
    private Hero hero;

    public void start() {
        // Skapa hero
        hero = new Hero("Rocky", 100, new Weapon("Gloves", 8));

        boolean playing = true;
        while (playing) {
            System.out.println("\n=== ROCKY BOXING GAME ===");
            System.out.println("1. Step into the ring ");
            System.out.println("2. Check your stats ");
            System.out.println("3. Take a break ");
            System.out.print("Choose your action: ");
            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                explore();
            } else if (choice.equals("2")) {
                showStats();
            } else if (choice.equals("3")) {
                System.out.println("Rocky takes a break. Goodbye!");
                playing = false;
            } else {
                System.out.println("Invalid input! Try again.");
            }
        }
    }

    private void showStats() {
        System.out.println("\n=== HERO STATS ===");
        System.out.println(hero.getName() + " - Level: " + hero.getLevel() + " HP: " + hero.getHp() + "/" + hero.getMaxHp());
        System.out.println("Weapon: " + hero.getWeapon().getName() + "\n");
    }

    private void explore() {
        double r = Math.random();
        if (r < 0.7) {
            fightMonster();
        } else if (r < 0.9) {
            System.out.println("Rocky has found a way to restore his HP!.");
            hero.restoreHp();
        } else {
            fightBoss();
        }
    }

    private void fightMonster() {
        MonsterLang monster = new MonsterLang();
        System.out.println("\nA fierce competitor " + monster.getName() + " appears!");

        while (hero.getHp() > 0 && monster.getHp() > 0) {
            hero.attack(monster);
            if (monster.getHp() <= 0) break;

            monster.attack(hero);

            if (hero.getHp() <= 20 && Math.random() < 0.8) {
                hero.restoreHp();
                System.out.println(hero.getName() + " fights back with a burst of energy!");
            }
        }

        if (hero.getHp() > 0) {
            System.out.println(monster.getName() + " is defeated!");
            hero.gainXp(100);
            System.out.println(hero.getName() + " leveled up to level " + hero.getLevel() + "!");
            System.out.println("You move on to face the final boss!");
            fightBoss();
        } else {
            System.out.println(hero.getName() + " was defeated by " + monster.getName() + "...");
            System.out.println("Game over!");
            System.exit(0);
        }
    }

    private void fightBoss() {
        BossDrago boss = new BossDrago();
        System.out.println("\nFINAL BOSS " + boss.getName() + " appears!");

        while (hero.getHp() > 0 && boss.getHp() > 0) {
            hero.attack(boss);
            if (boss.getHp() <= 0) break;

            boss.attack(hero);

            if (hero.getHp() <= 30 && Math.random() < 0.4) {
                hero.restoreHp();
                System.out.println(hero.getName() + " Rocky`s has managed to restore his energy!");
            }
        }

        if (hero.getHp() > 0) {
            System.out.println("\n" + hero.getName() + " defeated " + boss.getName() + "!");
            System.out.println("Congratulations! You win the game!");
            System.exit(0);
        } else {
            System.out.println(hero.getName() + " was defeated by " + boss.getName() + "...");
            System.out.println("Game over!");
            System.exit(0);
        }
    }
}

// Class gameengine involves gameflow, menus and the fights
// The class got quite long and does different things.
// Next time it would be better if I split the fights and the menusystem in different classes for better structure