package entity;

/**
 * @author liuyi
 * @date 2019/7/6 0006
 */
public class Poker {
    private String suit;
    private  String size;
    private String king ;

    @Override
    public String toString() {
        return suit+size+king;
    }

    public Poker(String suit, String size, String king) {
        this.suit = suit;
        this.size = size;
        this.king = king;
    }

    public Poker() {
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getKing() {
        return king;
    }

    public void setKing(String king) {
        this.king = king;
    }
}
