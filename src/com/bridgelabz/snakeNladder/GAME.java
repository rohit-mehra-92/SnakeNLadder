package com.bridgelabz.snakeNladder;

public class GAME {
    private static final int SNAKE = 2;
    private static final int LADDER = 1;
    private static final int NO_PLAY = 0;
    final int WIN = 100;
    int position = 0;
    int previousPosition = 0;

    public int dieRoll() {
        return (int) (Math.random() * 6) + 1;
    }

    void StartGame() {
        while (position < WIN) {
            previousPosition = position;
         System.out.println(" previous position " + previousPosition);

            int num = (int) Math.floor(Math.random() * 10) % 3;
            int value = dieRoll();
          System.out.println("player rolls dice and got : " + value);
            switch (num) {
                case SNAKE:
                    //System.out.println("GOT SNAKE");
                    position = position - value;
                    if (position < 0) {
                        position = 0;
                        System.out.println("1st position : " + position);
                        break;
                    }
                case LADDER:
                    //System.out.println("GOT LADDER");
                    position = value + position;
                    if (position > WIN) {
                        position = previousPosition;
                        System.out.println("2nd position :" + position);
                        break;
                    }
                    else if (WIN == position){
                        System.out.println("player Wins");
                    }

            }
        }
    }
}

