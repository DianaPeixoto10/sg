package SniperGame;

/**
 * Created by codecadet on 25/05/2018.
 */
public abstract class Enemy {
    private int health;
    private boolean isDead;
    private String message;

    public Enemy(int health, boolean isDead) {
        this.health = health;
        this.isDead = isDead;
    }

    public boolean isDead() {
        return isDead;
    }

    public int getHealth() {
        return health;
    }

    public void hit(int shoot) {
        return;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "Enemy{" +
                "health=" + health +
                ", isDead=" + isDead +
                ", message='" + message + '\'' +
                '}';
    }
}
