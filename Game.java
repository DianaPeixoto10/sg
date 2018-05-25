package SniperGame;

import java.util.Arrays;

/**
 * Created by codecadet on 25/05/2018.
 */
public class Game {

    private Game_Object[] gameObjects;
    private SniperRifle sniperRifle;
    private int shotsFired;

    public void Game(Game_Object[] gameObjects, SniperRifle sniperRifle, int shotsFired) {
            this.gameObjects = gameObjects;
            this.sniperRifle = sniperRifle;
            this.shotsFired = shotsFired;
    }
        public void start() {
            return;
    }

    //CRIAR UM METODO DE TIPO GAMEOBJECTS[] QUE TEM COMO ARGUMENTO UM INTEIRO
    public createObjects(int obCreator) {
        return createOb;
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

