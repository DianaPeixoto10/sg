package SniperGame;

/**
 * Created by codecadet on 25/05/2018.
 */
public class Tree {

    private String message;

    public void Tree(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "message='" + message + '\'' +
                '}';
    }
}
