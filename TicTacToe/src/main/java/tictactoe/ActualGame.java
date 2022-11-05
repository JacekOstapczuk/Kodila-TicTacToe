package tictactoe;
import java.util.*;
public class ActualGame {
    Map<Integer, String> gameMap = new HashMap<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ActualGame that = (ActualGame) o;
        return Objects.equals(gameMap, that.gameMap);
    }

    @Override
    public int hashCode() {
        return gameMap != null ? gameMap.hashCode() : 0;
    }

    DifficultyLevel difficultyLevel =new DifficultyLevel();
    Players players = new Players();
    GameRun gameRun = new GameRun();
    Visual visual = new Visual();
    Random randomGenerator = new Random();
    WiningCalculation winingCalculation = new WiningCalculation();

    public static int getInt() {
        return new Scanner(System.in).nextInt();
    }

    public void manage1Players3x3() {
        String witchXOSign = "";
        int mapSize = 9;

        for (int i = 0; i < mapSize; i++) {

            int givenNumber;
            if (i % 2 == 0) {
                players.announcementForPlayerX();
                witchXOSign = players.signForPlayerX();
                givenNumber = getInt();
            } else {
                witchXOSign = players.signForPlayerO();
                givenNumber = randomGenerator.nextInt(10);
            }
            try {
                actualGame(givenNumber, witchXOSign, mapSize);
            } catch (BadNumberException e) {
                i--;
            } catch (GameEndingByWiningException e) {
                System.out.println(e.anoucment + witchXOSign);
                break;
            } catch (DrawException e) {
                System.out.println(e);
            }
        }
    }

    public void manage2Players3x3() {
        String witchXOSign = "";
        int mapSize = 9;

        for (int i = 0; i < mapSize; i++) {

            if (i % 2 == 0) {
                players.announcementForPlayerX();
                witchXOSign = players.signForPlayerX();
            } else {
                players.announcementForPlayerO();
                witchXOSign = players.signForPlayerO();
            }
            int givenNumber = getInt();

            try {
                actualGame(givenNumber, witchXOSign, mapSize);
            } catch (BadNumberException e) {
                i--;
            } catch (GameEndingByWiningException e) {
                System.out.println(e.anoucment + witchXOSign);
                break;
            } catch (DrawException e) {
                System.out.println(e);
            }
        }
    }


    public void manage1Players10x10( int choiceDifficultyLevel) {
        String witchXOSign = "";
        int mapSize = 100;

        for (int i = 0; i < mapSize; i++) {

            int givenNumber;
            if (i % 2 == 0) {
                players.announcementForPlayerX();
                witchXOSign = players.signForPlayerX();
                givenNumber = getInt();
            } else {
                witchXOSign = players.signForPlayerO();
                givenNumber = difficultyLevel.allocationDifficultyLevel(choiceDifficultyLevel, gameMap);
                System.out.println("");
            }

            try {
                actualGame(givenNumber, witchXOSign, mapSize);
            } catch (BadNumberException e) {
                i--;
            } catch (GameEndingByWiningException e) {
                System.out.println(e.anoucment + witchXOSign);
                break;
            } catch (DrawException e) {
                System.out.println(e);
            }
        }
    }


    public void manage2Players10x10() {
        String witchXOSign = "";
        int mapSize = 100;

        for (int i = 0; i < 100; i++) {

            if (i % 2 == 0) {
                players.announcementForPlayerX();
                witchXOSign = players.signForPlayerX();
            } else {
                players.announcementForPlayerO();
                witchXOSign = players.signForPlayerO();
            }
            int givenNumber = getInt();

            try {
                actualGame(givenNumber, witchXOSign, mapSize);
            } catch (BadNumberException e) {
                i--;
            } catch (GameEndingByWiningException e) {
                System.out.println(e.anoucment + witchXOSign);
                break;
            } catch (DrawException e) {
                System.out.println(e);
            }
        }
    }

    public Map<Integer, String> actualGame(int givenNumber, String witchXOSign, int mapSize) throws BadNumberException, DrawException, GameEndingByWiningException {
        try {
            gameMap = gameRun.numberGettingAndVerification(gameMap, givenNumber, witchXOSign, mapSize);
        } catch (BadNumberException e) {
            throw new BadNumberException();
        }
        if (mapSize == 9) {
            visual.draw3x3(gameMap);
        } else if (mapSize == 100) {
            visual.draw10x10(gameMap);
        }

        if (mapSize == 9) {
            try {
                winingCalculation.winingnSign3x3(gameMap);
            } catch (GameEndingByWiningException e) {
                throw new GameEndingByWiningException();
            }
        } else if (mapSize == 100) {
            try {
                winingCalculation.winingnSign10x10(gameMap);
            } catch (GameEndingByWiningException e) {
                throw new GameEndingByWiningException();
            }
        }
        if (gameMap.size() == mapSize) {
            throw new DrawException();
        }
        return gameMap;
    }
}