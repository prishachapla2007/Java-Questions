public class Character {
    private int health;
    private final int maxHealth;

    Character(int max) {
        maxHealth = max;
        health = max;
    }

    void takeDamage(int n) {
        health = Math.max(0, health - n);
    }

    void heal(int n) {
        health = Math.min(maxHealth, health + n);
    }

    int getHealth() {
        return health;
    }

    public static void main(String[] args) {
        Character c = new Character(100);
        c.takeDamage(30);
        System.out.println(c.getHealth());
        c.heal(50);
        System.out.println(c.getHealth());
        c.takeDamage(150);
        System.out.println(c.getHealth());
    }
}