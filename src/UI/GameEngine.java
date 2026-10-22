package UI;

import java.util.Scanner;

public class GameEngine {
    private boolean running = true;
    private Scanner scanner = new Scanner(System.in);

    public void start() {
        while (running) {
            gameStart();
            String val = scanner.nextLine();
            mainMenu(val);
        }
    }

    private void mainMenu(String val) {

    }

    void gameStart(){
        System.out.println("Hello Adventurer. Welcome to a new world.");
        System.out.println("Would you like to take your first step into a new world?");
        System.out.println("1. If you are ready");
        System.out.println("0. If you are not");

        // System.out.println("Would you like to go 1. left, 2. forward, or 3. right.");

    }


}
