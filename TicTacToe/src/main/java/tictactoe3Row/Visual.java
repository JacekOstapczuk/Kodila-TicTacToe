

package tictactoe3Row;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Visual {

    public void draw3x3(Map gameMap) {

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


        System.out.print("|");
        System.out.print(space7);
        System.out.print("|");
        System.out.print(space8);
        System.out.print("|");
        System.out.print(space9);
        System.out.println("|");
        System.out.print("|");
        System.out.print(space4);
        System.out.print("|");
        System.out.print(space5);
        System.out.print("|");
        System.out.print(space6);
        System.out.println("|");
        System.out.print("|");
        System.out.print(space1);
        System.out.print("|");
        System.out.print(space2);
        System.out.print("|");
        System.out.print(space3);
        System.out.println("|");
    }


    public void draw10x10(Map gameMap) {

        List<String> XOlist = new ArrayList<>();
        for (int i = 0; i <= 99; i++) {
            XOlist.add(i, " ");
        }

        for (int j = 0; j <= 99; j++) {
            if (gameMap.containsKey(j)) {
                String space = (String) gameMap.get(j);
                XOlist.add(j-1, space);
            }
        }

        int m=0;
        int k=0;

            for ( k =0; k < 10; k=k ) {

                for (int l = 0; l < 10; l++) {
                    System.out.print("|");
                    System.out.print(XOlist.get(m));
                    m++;
                }
                System.out.println("|");
                k++;
            }
        }
    }
