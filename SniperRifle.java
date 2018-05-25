package SniperGame;

/**
 * Created by codecadet on 25/05/2018.
 */
public class SniperRifle {

    private int bulletDamage;

    public int getBulletDamage() {
        return bulletDamage;
    }

    public void SniperRifle(int bulletDamage) {
        this.bulletDamage = bulletDamage;
    }

    public void shoot(Enemy enemy) {
        return;
    }

    @Override
    public String toString() {
        return "SniperRifle{" +
                "bulletDamage=" + bulletDamage +
                '}';
    }
}
