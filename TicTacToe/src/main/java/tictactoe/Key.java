package tictactoe;

public class Key {
    Integer field;
    String sign ;

    public void setkey(Integer field,String sign ) {
        this.field = field;
        this.sign = sign;
    }
    public Integer getField() {
        return field;
    }
    public String getSign() {
        return sign;
    }
}
