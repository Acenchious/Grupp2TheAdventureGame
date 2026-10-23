package UI;

import java.util.Scanner;

public class GameEngine {
    private boolean running = true;
    private Scanner scanner = new Scanner(System.in);

    public void start() {
        while (running) {
            gameStart();
            String choice = scanner.nextLine();
            mainMenu(choice);
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

    void firstChoice(){
        switch (scanner.nextLine()){
            case "1":
                firstRoom();
                break;
            case "0":
                System.out.println("One day you will be brave enough!");
                running = false;
                break;
            default:
                System.out.println("Wrong choice. Try again.");
        }
    }

    void firstRoom(){
        System.out.println("You enter the dungeons first room. The moldy walls stinks and the dropping sound deeper in makes you want to leave.");
        System.out.println("Do you want to go left or right?");

    }
}
