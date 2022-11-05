

package tictactoe;

import java.util.Map;
import java.util.Scanner;

public class GameRun {

    public Map<Integer,String > numberGettingAndVerification(Map<Integer, String> gameMap, Integer givenNumber, String witchXOSign, int mapSize)
            throws BadNumberException {

        BadNumberException badNumberException = new BadNumberException();

        if (givenNumber < 1 || givenNumber >  mapSize) {
            System.out.println(badNumberException.badRange);
            throw new BadNumberException();
        }
        if (gameMap.containsKey(givenNumber)) {
            System.out.println(badNumberException.duplicatedNumber);
            throw new BadNumberException();
        }

        gameMap.put(givenNumber, witchXOSign);
        return gameMap;
    }

    public static int getInt() {
        return new Scanner(System.in).nextInt();
    }
}


