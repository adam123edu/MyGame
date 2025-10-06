package game;

public class Weapon {
    private String name;
    private int damage;

    public Weapon(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    @Override
    public String toString() {
        return name + " (Damage: " + damage + ")";
    }
}

// Class (Weapon) represents a weapon hero can use. Also contains the weapons name and damage


