import sun.reflect.generics.tree.Tree;

import java.util.Arrays;

public class Game {

    private GameObject[] gameObjects;
    private SniperRifle sniperRifle;
    private int shotsFired;
    private Enemy enemy;
    private Object object;

    public GameObject[] createObjects(int obNumber) {
        Object[] gameObjects = Object.values();
        Object ob = gameObjects[(int) (Math.random() * 3)];

        for (int i = 0; i < obNumber; i++) {
            switch (ob) {
                case TREE:
                    ;
                    break;
                case SOLDIERENEMY:
                    createObjects();
                    break;

                case ARMOUREDENEMY:
                    createObjects();
                    break;
            }
            return gameObjects;
        }
    }

    public void start() {

    }

    @Override
    public String toString() {
        return "Game{" +
                "gameObjects=" + Arrays.toString(gameObjects) +
                ", sniperRifle=" + sniperRifle +
                ", shotsFired=" + shotsFired +
                '}';
    }
}

