package game;

public class BossDrago extends Monster {

    public BossDrago() {
        super("Ivan Drago", 100, 12);
        this.damage = 12;
    }

    @Override
    public void attack(Character target) {
        int actualDamage = damage;
        if (Math.random() < 0.3) {
            actualDamage *= 2;
            System.out.println(getName() + " unleashes a SPECIAL UPPERCUT!");
        }
        System.out.println(getName() + " punches " + target.getName() + " for " + actualDamage + " damage!");
        target.takeDamage(actualDamage);
    }

    @Override
    public void takeDamage(int damage) {
        hp -= damage;
        if (hp < 0) hp = 0;
        System.out.println(getName() + " takes " + damage + " damage. HP left: " + hp);
    }
}

// This class represents the final boss Ivan Drago
// He also extends from monster class
// He can do a special attack and sometimes gives out double damage
