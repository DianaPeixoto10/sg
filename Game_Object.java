package SniperGame;

/**
 * Created by codecadet on 25/05/2018.
 */
public abstract class Game_Object {

    private String message;

    public void Game_Object(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "Game_Object{" +
                "message='" + message + '\'' +
                '}';
    }
}
