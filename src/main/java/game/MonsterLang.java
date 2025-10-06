package game;

public class MonsterLang extends Monster {
    public MonsterLang() {
        super("Clubber Lang", 60, 10);
        this.damage = 10;
    }

    @Override
    public void attack(Character target) {
        System.out.println(getName() + " punches " + target.getName() + " for " + damage + " damage");
        target.takeDamage(damage);
    }

    @Override
    public void takeDamage(int damage) {
        hp -= damage;
        if (hp < 0) hp = 0;
        System.out.println(getName() + " takes " + damage + " damage. HP left: " + hp);
    }
}

//This class is the normal monster in the game.
// It extends from Monster class and shows how Clubber Lang attack and take damage