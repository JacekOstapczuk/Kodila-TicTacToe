

package tictactoe3Row;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class WiningCalculation {

    public void winingnSign3x3(Map gameMap) throws GameEndingByWiningException {

        String space1;
        if (gameMap.containsKey(1)) {
            space1 = (String) gameMap.get(1);
        } else {
            space1 = "1";
        }

        String space2;
        if (gameMap.containsKey(2)) {
            space2 = (String) gameMap.get(2);
        } else {
            space2 = "2";
        }

        String space3;
        if (gameMap.containsKey(3)) {
            space3 = (String) gameMap.get(3);
        } else {
            space3 = "3";
        }

        String space4;
        if (gameMap.containsKey(4)) {
            space4 = (String) gameMap.get(4);
        } else {
            space4 = "4";
        }

        String space5;
        if (gameMap.containsKey(5)) {
            space5 = (String) gameMap.get(5);
        } else {
            space5 = "5";
        }

        String space6;
        if (gameMap.containsKey(6)) {
            space6 = (String) gameMap.get(6);
        } else {
            space6 = "6";
        }

        String space7;
        if (gameMap.containsKey(7)) {
            space7 = (String) gameMap.get(7);
        } else {
            space7 = "7";
        }

        String space8;
        if (gameMap.containsKey(8)) {
            space8 = (String) gameMap.get(8);
        } else {
            space8 = "8";
        }

        String space9;
        if (gameMap.containsKey(9)) {
            space9 = (String) gameMap.get(9);
        } else {
            space9 = "9";
        }


        if (space9.equals("X") && space8.equals("X") && space7.equals("X")) {
            throw new GameEndingByWiningException();
        }


        if (space6.equals("X") && space5.equals("X") && space4.equals("X")) {
            throw new GameEndingByWiningException();
        }


        if (space3.equals("X") && space2.equals("X") && space1.equals("X")) {
            throw new GameEndingByWiningException();
        }


        if (space9.equals("X") && space6.equals("X") && space3.equals("X")) {
            throw new GameEndingByWiningException();
        }


        if (space8.equals("X") && space5.equals("X") && space2.equals("X")) {
            throw new GameEndingByWiningException();
        }


        if (space7.equals("X") && space4.equals("X") && space1.equals("X")) {
            throw new GameEndingByWiningException();
        }


        if (space9.equals("X") && space5.equals("X") && space1.equals("X")) {
            throw new GameEndingByWiningException();
        }


        if (space7.equals("X") && space5.equals("X") && space1.equals("X")) {
            throw new GameEndingByWiningException();
        }


        if (space9.equals("O") && space8.equals("O") && space7.equals("O")) {
            throw new GameEndingByWiningException();
        }

        if (space6.equals("O") && space5.equals("O") && space4.equals("O")) {
            throw new GameEndingByWiningException();
        }


        if (space3.equals("O") && space2.equals("O") && space1.equals("O")) {
            throw new GameEndingByWiningException();
        }


        if (space9.equals("O") && space6.equals("O") && space3.equals("O")) {
            throw new GameEndingByWiningException();
        }


        if (space8.equals("O") && space5.equals("O") && space2.equals("O")) {
            throw new GameEndingByWiningException();
        }


        if (space7.equals("O") && space4.equals("O") && space1.equals("O")) {
            throw new GameEndingByWiningException();
        }


        if (space9.equals("O") && space5.equals("O") && space1.equals("O")) {
            throw new GameEndingByWiningException();
        }


        if (space7.equals("O") && space5.equals("O") && space1.equals("O")) {
            throw new GameEndingByWiningException();
        }
    }

    public void winingnSign10x10(Map gameMap) throws GameEndingByWiningException {
        List<String> XOlist = new ArrayList<>();
        for (int i = 0; i <= 199; i++) {
            XOlist.add(i, " ");
        }

        for (int j = 0; j <=199; j++) {
            if (gameMap.containsKey(j)) {
                String space = (String) gameMap.get(j);
                XOlist.add(j, space);
            }

            for (int a = 0; a <=99; a++) {
                if (XOlist.get(a).equals("X") && XOlist.get(a + 10).equals("X")&& XOlist.get(a + 20).equals("X")&& XOlist.get(a + 30).equals("X")&& XOlist.get(a + 40).equals("X")) {
                    throw new GameEndingByWiningException();
                }
                if (XOlist.get(a).equals("O") && XOlist.get(a + 10).equals("O")&& XOlist.get(a + 20).equals("O")&& XOlist.get(a + 30).equals("O")&& XOlist.get(a + 40).equals("O")) {
                    throw new GameEndingByWiningException();
                }
                if (XOlist.get(a).equals("X") && XOlist.get(a + 1).equals("X")&& XOlist.get(a + 2).equals("X")&& XOlist.get(a + 3).equals("X")&& XOlist.get(a + 4).equals("X")) {
                    throw new GameEndingByWiningException();
                }
                if (XOlist.get(a).equals("O") && XOlist.get(a + 1).equals("O")&& XOlist.get(a + 2).equals("O")&& XOlist.get(a + 3).equals("O")&& XOlist.get(a + 4).equals("O")) {
                    throw new GameEndingByWiningException();
                }
                if (XOlist.get(a).equals("X") && XOlist.get(a + 11).equals("X")&& XOlist.get(a + 22).equals("X")&& XOlist.get(a + 33).equals("X")&& XOlist.get(a + 44).equals("X")) {
                    throw new GameEndingByWiningException();
                }
                if (XOlist.get(a).equals("O") && XOlist.get(a + 11).equals("O")&& XOlist.get(a + 22).equals("O")&& XOlist.get(a + 33).equals("O")&& XOlist.get(a + 44).equals("O")) {
                    throw new GameEndingByWiningException();
                }
                if (XOlist.get(a).equals("X") && XOlist.get(a + 9).equals("X")&& XOlist.get(a + 18).equals("X")&& XOlist.get(a + 27).equals("X")&& XOlist.get(a + 36).equals("X")) {
                    throw new GameEndingByWiningException();
                }
                if (XOlist.get(a).equals("O") && XOlist.get(a + 9).equals("O")&& XOlist.get(a + 18).equals("O")&& XOlist.get(a + 27).equals("O")&& XOlist.get(a + 36).equals("O")) {
                    throw new GameEndingByWiningException();
                }
            }

        }
    }
}
