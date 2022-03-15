package com.bridgelabz.snakeNladder;

public class GAME {
    private static final int SNAKE = 2;
    private static final int LADDER = 1;
    private static final int NO_PLAY = 0;
    final int WIN = 100;
    int position = 0;
    int previousPosition = 0;
    int numberOfDiceRolls = 0;

    public int dieRoll() {
        return (int) (Math.random() * 6) + 1;
    }

    void StartGame() {
        while (position < WIN) {
            previousPosition = position;
//            System.out.println(" previous position " + previousPosition);
            int num = (int) Math.floor(Math.random() * 10) % 3;
            int value = dieRoll();
            System.out.println("player rolls dice and got : " + value);
            switch (num) {
                case SNAKE:
                    //System.out.println("GOT SNAKE");
                    position = position - value;
                    if (position < 0) {
                        position = 0;
                    }
                    break;

                case LADDER:
                    //System.out.println("GOT LADDER");
                    position = position + value;
                    if (position > WIN) {
                        position = previousPosition;
                    }
                    break;
                case NO_PLAY:
                   // System.out.println("player does not move");

            }
            numberOfDiceRolls++;
            System.out.println("player position : " + position);
        }
        System.out.println(numberOfDiceRolls + " Times PLAYER rolls dice");
    }

}

