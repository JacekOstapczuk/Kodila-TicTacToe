package tictactoe3Row;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class DifficultyLevel {
   Random randomGenerator = new Random();

   public int allocationDifficultyLevel (int choiceDifficultyLevel,  Map gameMap) {
      int  numberToPlay = randomGenerator.nextInt(100);
      if (choiceDifficultyLevel==1) {
         numberToPlay= randomGenerator.nextInt(100);
      } else if (choiceDifficultyLevel==2) {
         int lineToPlay  = randomGenerator.nextInt(5);
            if (lineToPlay==0){
               numberToPlay= randomGenerator.nextInt(6)+32;
            }else if(lineToPlay==1){
               numberToPlay= randomGenerator.nextInt(6)+42;
            } else if(lineToPlay==2){
               numberToPlay= randomGenerator.nextInt(6)+52;
            } else if (lineToPlay==3){
               numberToPlay= randomGenerator.nextInt(6)+62;
            } else  if (lineToPlay==4) {
               numberToPlay = randomGenerator.nextInt(6) + 72;
            } else{
               numberToPlay= randomGenerator.nextInt(100);
            }
      } else if (choiceDifficultyLevel==3) {
         if (!(gameMap.containsKey(55))) {
            numberToPlay = 55;
         } else if (!(gameMap.containsKey(56))){
            numberToPlay = 56;
         } else {
            int lineToPlay  = randomGenerator.nextInt(5);
            if (lineToPlay==0){
               numberToPlay= randomGenerator.nextInt(5)+32;
            }else if(lineToPlay==1){
               numberToPlay= randomGenerator.nextInt(5)+42;
            } else if(lineToPlay==2){
               numberToPlay= randomGenerator.nextInt(5)+52;
            } else if (lineToPlay==3){
               numberToPlay= randomGenerator.nextInt(5)+62;
            } else  {
               numberToPlay = randomGenerator.nextInt(5) + 72;
         }
      }
   }  else if (choiceDifficultyLevel==4) {
         if (!(gameMap.containsKey(55))) {
            numberToPlay = 55;
         } else if (!(gameMap.containsKey(56))) {
            numberToPlay = 56;
         } else {
            List<String> XOlist = new ArrayList<>();
            for (int i = 0; i <= 199; i++) {
               XOlist.add(i, " ");
            }

            for (int j = 0; j <= 199; j++) {
               if (gameMap.containsKey(j)) {
                  String space = (String) gameMap.get(j);
                  XOlist.add(j, space);
               }
            }

            for (int a = 0; a <= 99; a++) {
                  if (XOlist.get(a).equals("X") && XOlist.get(a + 10).equals("X") && XOlist.get(a + 20).equals("X")) {
                     if (XOlist.get(a + 30).equals("O")&&XOlist.get(a - 10).equals("O") ){
                        continue;
                     } else if (XOlist.get(a + 30).equals("O")) {
                        numberToPlay = a - 10;
                     } else {
                        numberToPlay = a + 30;
                     }
                  } else if (XOlist.get(a).equals("X") && XOlist.get(a + 1).equals("X") && XOlist.get(a + 2).equals("X")) {
                     if (XOlist.get(a + 3).equals("O")&&XOlist.get(a - 1).equals("O") ){
                        continue;
                     } else if (XOlist.get(a + 3).equals("O")) {
                           numberToPlay = a - 1;
                        } else {
                           numberToPlay = a + 3;
                        }
                     } else if (XOlist.get(a).equals("X") && XOlist.get(a + 11).equals("X") && XOlist.get(a + 22).equals("X")) {
                     if (XOlist.get(a + 33).equals("O")&&XOlist.get(a - 11).equals("O") ){
                        continue;
                     } else  if (XOlist.get(a + 33).equals("O")) {
                           numberToPlay = a - 11;
                        } else {
                           numberToPlay = a + 33;
                        }
                     } else if (XOlist.get(a).equals("X") && XOlist.get(a + 9).equals("X") && XOlist.get(a + 18).equals("X")) {
                     if (XOlist.get(a + 27).equals("O")&&XOlist.get(a - 9).equals("O") ){
                        continue;
                     } else if (XOlist.get(a + 27).equals("O")) {
                           numberToPlay = a - 9;
                        } else {
                           numberToPlay = a + 27;
                        }
                     }
                  }
               }
            } return  numberToPlay;
         }
}