package game;

public abstract class Character {
    protected String name;
    protected int hp;
    protected int maxHp;

    public Character(String name, int maxHp) {
        this.name = name;
        this.maxHp = maxHp;
        this.hp = maxHp;
    }

    public String getName() {
        return name;
    }
    public int getHp() {
        return hp;
    }
    public int getMaxHp() {
        return maxHp;
    }

    public abstract void attack(Character target);
    public abstract void takeDamage(int damage);
}
