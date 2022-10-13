
package tictactoe3Row;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

            ActualGame actualGame = new ActualGame();
            System.out.println("jeśli chcesz zagrać w grę jednoosobową wciśnij  1  \njeśli chcesz zagrać w grę dwuosobową wciśnij  2 ");
            int choicePlayersQuantity = getInt();
            System.out.println ("podaj wielkość planszy na jakiej chcesz zagrać  1  dla planszy 3x3  i 2 dla planszy 10x10");
            int choiceSizeOfTable = getInt();

            if (choicePlayersQuantity == 1 && choiceSizeOfTable==1) {
                actualGame.manage1Players3x3();
            } else if (choicePlayersQuantity == 2 && choiceSizeOfTable==1) {
                actualGame.manage2Players3x3();
            } else if (choicePlayersQuantity == 1 && choiceSizeOfTable==2) {
                actualGame.manage1Players10x10();
            }  else if (choicePlayersQuantity == 2 && choiceSizeOfTable==2) {
                actualGame.manage2Players10x10();
            } else {
                System.out.println("podano złe dane");
            }
        }

    public static int getInt() {
        return new Scanner(System.in).nextInt();
    }

}

