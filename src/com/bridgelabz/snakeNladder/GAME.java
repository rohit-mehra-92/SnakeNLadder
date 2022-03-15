package com.bridgelabz.snakeNladder;

public class GAME {
    private static final int SNAKE = 2;
    private static final int LADDER = 1;
    private static final int NO_PLAY = 0;
    final int WIN = 100;
    int position = 0;

    void StartGame() {
        while (WIN > position) {
            int num = (int) Math.floor(Math.random() * 10) % 3;
            int value = dieRoll();
            System.out.println("player Dice rolls: " + value);
            switch (num) {
                case SNAKE:
                    System.out.println("GOT SNAKE moves");
                    position = position - value;
                    System.out.println("player position : " + position);
                    break;

                case LADDER:
                    System.out.println("GOT LADDER");
                    position = value + position;
                    System.out.println("player position : " + position);
                    break;

                case NO_PLAY:
                    System.out.println("PLAYER DOES NOT MOVE");
                    System.out.println("player position : " + position);
                    break;

            }
        }
    }

    public static int dieRoll() {
        return (int) (Math.random() * 7);
    }
}
