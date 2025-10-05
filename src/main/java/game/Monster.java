package game;

public abstract class Monster extends Character {
    protected int damage;

    public Monster(String name, int maxHp, int damage) {
        super(name, maxHp);
        this.damage = damage;
    }

    // Abstract methods inherited from Character
    @Override
    public abstract void attack(Character target);

    @Override
    public abstract void takeDamage(int damage);
}

