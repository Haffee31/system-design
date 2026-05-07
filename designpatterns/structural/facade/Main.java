package designpatterns.structural.facade;

public class Main {

    public static void main(String[] args) {
        // Usage - simple interface hides all the coordination
        Game game = new Game();
        game.makeMove(0, 0);
        game.makeMove(1, 1);

    }
}
