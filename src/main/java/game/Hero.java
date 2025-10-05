package game;

public class Hero extends Character {
    private Weapon weapon;

    public Hero(String name, int maxHp, Weapon weapon) {
        super(name, maxHp);
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    @Override
    public void attack(Character target) {
        System.out.println(name + "Punches" + target.getName() + " with " + getName() + " for " + weapon.getDamage() + " damage!");
        target.takeDamage(weapon.getDamage());

    }

    @Override
    public void takeDamage(int damage) {
        hp -= damage;
        if (hp < 0) hp = 0;
        System.out.println(name + " takes " + damage + " damage! HP remaining: " + hp);

    }
}
