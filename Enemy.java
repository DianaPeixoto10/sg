abstract public class Enemy extends GameObject {

    private int health;
    private boolean isDead;

    public Enemy(int health) {
        this.health = health;
        this.isDead = false;
    }

    public boolean isDead() {
        return isDead;
    }

    public int getHealth() {
        return health;
    }

    public void hit(int damage) {
        return;
    }

    @Override
    public String getMessage() {
        return "ArmouredEnemy";
    }
}


