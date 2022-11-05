
package tictactoe;


public class Players {

    public void announcementForPlayerX() {
        System.out.println("Aktualnie trwa tura PIERWSZEGO gracza");
        System.out.println("podaj numer pola na ktorym postawic \"X\" ");
    }
    public String signForPlayerX() {
        String  witchXOSign ="X";
        return  witchXOSign;
    }


    public void announcementForPlayerO() {
        System.out.println("Aktualnie trwa tura DRUGIEGO gracza");
        System.out.println("podaj numer pola na ktorym postawic \"O\" ");
    }

    public String signForPlayerO() {
        String witchXOSign ="O";
        return witchXOSign;
    }


}

