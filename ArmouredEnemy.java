package SniperGame;

/**
 * Created by codecadet on 25/05/2018.
 */
public class ArmouredEnemy {

    private int armour;

    public int getArmour() {
        return armour;
    }

    public ArmouredEnemy(int armour) {
        this.armour = armour;
    }

    public void hit(int shoot) {
        return;
    }

    @Override
    public String toString() {
        return "ArmouredEnemy{" +
                "armour=" + armour +
                '}';
    }
}

