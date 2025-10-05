package game;

public class Weapon {
    private String name;
    private int damage;
    private String type; // t.ex. "jab", "hook", "uppercut"

    public Weapon(String name, int damage, String type) {
        this.name = name;
        this.damage = damage;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return name + " (" + type + ", Damage: " + damage + ")";
    }
}

