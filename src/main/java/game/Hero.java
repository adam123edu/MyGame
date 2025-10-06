package game;

public class Hero extends Character {
    private Weapon weapon;

    private int xp = 0;
    private int level = 1;

    public Hero(String name, int maxHp, Weapon weapon) {
        super(name, maxHp);
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public int getLevel() {
        return level;
    }

    public void gainXp(int ammount) {
        xp += ammount;
        while (xp >= 100 && level < 10) {
            xp -= 100;
            levelUp();
        }

    }
    public void restoreHp() {
        hp = maxHp;
        System.out.println(name + " restores HP to " + hp + "!");
    }


    private void levelUp() {
        level++;
        maxHp += 20;
        hp = maxHp;
        System.out.println(name + " Leveled up! Now at level " + level + ". Max Hp: " + maxHp);
    }

    @Override
    public void attack(Character target) {
        System.out.println(name + " Punches " + target.getName() + " with " + weapon.getName() + " for " + weapon.getDamage() + " damage!");
        target.takeDamage(weapon.getDamage());

    }

    @Override
    public void takeDamage(int damage) {
        hp -= damage;
        if (hp < 0) hp = 0;
        System.out.println(name + " takes " + damage + " damage! HP remaining: " + hp);

    }

    public void extraAttack(Character target, int extraDamage) {
        System.out.println(name + " uses extra fighting spirit punch on " + target.getName() + " for " + extraDamage + " damage!");
        target.takeDamage(extraDamage); // applicerar skadan
    }

}
