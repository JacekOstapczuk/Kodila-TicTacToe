package tictactoe;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ActualGameTest {


    @Test
    public void OWiningInLine() {
        //Given
        ActualGame testedGame = new ActualGame();
        String result ="";
        GameEndingByWiningException gameEndingByWiningException = new GameEndingByWiningException();
        String expected = gameEndingByWiningException.anoucment;
        //When
       try {
           testedGame.actualGame(1, "O",9);
           testedGame.actualGame(2, "O",9);
           testedGame.actualGame(3, "O",9);
       } catch (BadNumberException e ) {
           result = "this shouldn't happen";
       } catch (GameEndingByWiningException e) {
           result = e.anoucment;
       } catch (DrawException e){
        result  = e.anoucment;
       }

        //Then
        Assertions.assertEquals (  expected, result);
    }

    @Test
    public void OWiningInColumn() {
        //Given
        ActualGame testedGame = new ActualGame();
        String result ="";
        GameEndingByWiningException gameEndingByWiningException = new GameEndingByWiningException();
        String expected = gameEndingByWiningException.anoucment;
        //When
        try {
            testedGame.actualGame(1, "O",9);
            testedGame.actualGame(4, "O",9);
            testedGame.actualGame(7, "O",9);
        } catch (BadNumberException e ) {
            result = "this shouldn't happen";
        } catch (GameEndingByWiningException e) {
            result = e.anoucment;
        } catch (DrawException e){
            result  = e.anoucment;
        }
        //Then
        Assertions.assertEquals (  expected, result);
    }

    @Test
    public void OWiningInSlant() {
        //Given
        ActualGame testedGame = new ActualGame();
        String result ="";
        GameEndingByWiningException gameEndingByWiningException = new GameEndingByWiningException();
        String expected = gameEndingByWiningException.anoucment;
        //When
        try {
            testedGame.actualGame(1, "O",9);
            testedGame.actualGame(5, "O",9);
            testedGame.actualGame(9, "O",9);
        } catch (BadNumberException e ) {
            result = "this shouldn't happen";
        } catch (GameEndingByWiningException e) {
            result = e.anoucment;
        } catch (DrawException e){
            result  = e.anoucment;
        }
        //Then
        Assertions.assertEquals (  expected, result);
    }

    @Test
    public void XWiningInLine() {
        //Given
        ActualGame testedGame = new ActualGame();
        String result ="";
        GameEndingByWiningException gameEndingByWiningException = new GameEndingByWiningException();
        String expected = gameEndingByWiningException.anoucment;
        //When
        try {
            testedGame.actualGame(1, "X",9);
            testedGame.actualGame(2, "X",9);
            testedGame.actualGame(3, "X",9);
        } catch (BadNumberException e ) {
            result = "this shouldn't happen";
        } catch (GameEndingByWiningException e) {
            result = e.anoucment;
        } catch (DrawException e){
            result  = e.anoucment;
        }
        //Then
        Assertions.assertEquals (  expected, result);
    }

    @Test
    public void XWiningInColumn() {
        //Given
        ActualGame testedGame = new ActualGame();
        String result ="";
        GameEndingByWiningException gameEndingByWiningException = new GameEndingByWiningException();
        String expected = gameEndingByWiningException.anoucment;
        //When
        try {
            testedGame.actualGame(1, "X",9);
            testedGame.actualGame(4, "X",9);
            testedGame.actualGame(7, "X",9);
        } catch (BadNumberException e ) {
            result = "this shouldn't happen";
        } catch (GameEndingByWiningException e) {
            result = e.anoucment;
        } catch (DrawException e){
            result  = e.anoucment;
        }
        //Then
        Assertions.assertEquals (  expected, result);
    }

    @Test
    public void XWiningInSlant() {
        //Given
        ActualGame testedGame = new ActualGame();
        String result ="";
        GameEndingByWiningException gameEndingByWiningException = new GameEndingByWiningException();
        String expected = gameEndingByWiningException.anoucment;
        //When
        try {
            testedGame.actualGame(1, "X",9);
            testedGame.actualGame(5, "X",9);
            testedGame.actualGame(9, "X",9);
        } catch (BadNumberException e ) {
            result = "this shouldn't happen";
        } catch (GameEndingByWiningException e) {
            result = e.anoucment;
        } catch (DrawException e){
            result  = e.anoucment;
        }
        //Then
        Assertions.assertEquals (  expected, result);
    }

    @Test
    public void Draw() {
        //Given
        String result ="";
        ActualGame testedGame = new ActualGame();
        GameEndingByWiningException gameEndingByWiningException = new GameEndingByWiningException();
        //When
        try {
            testedGame.actualGame(1, "X",9);
            testedGame.actualGame(2, "X",9);
            testedGame.actualGame(3, "O",9);
            testedGame.actualGame(4, "O",9);
            testedGame.actualGame(5, "O",9);
            testedGame.actualGame(6, "X",9);
            testedGame.actualGame(7, "X",9);
            testedGame.actualGame(8, "X",9);
            testedGame.actualGame(9,"O",9);

        } catch (BadNumberException e ) {
             result  = "this shouldn't happen";
        } catch (GameEndingByWiningException e) {
            result  = e.anoucment;
        } catch (DrawException e){
            result  = e.anoucment;
        }

        //Then
        Assertions.assertEquals ( "Rozgrywka zakończyła się remisem", result);
    }

    @Test
    public void BadMove() {
        //Given
        ActualGame testedGame = new ActualGame();
        String result ="";
        GameEndingByWiningException gameEndingByWiningException = new GameEndingByWiningException();

        String expected = "podano niewłaściwą liczbe, należy podać liczbę pomiędzy 1-9";
        //When
        try {
            testedGame.actualGame(11, "X",9);

        } catch (BadNumberException e ) {
            result = e.badRange;
        } catch (GameEndingByWiningException e) {
        result = e.anoucment;
        } catch (DrawException e){
            result  = e.anoucment;
        }

        //Then
        Assertions.assertEquals (  expected, result);
    }



}
