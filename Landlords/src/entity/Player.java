package entity;
import entity.Player;
import entity.Poker;
import java.util.ArrayList;
import java.util.List;

/**
 * 玩家类
 * @author liuyi
 * @date 2019/7/6 0006
 */
public class Player {

    private  String name;
    private  String avg;
    private  String sex;
    private  Integer money;
    private   List<Poker> list = new ArrayList<Poker>();




    public Player(String name, String avg, String sex, Integer money) {
        this.name = name;
        this.avg = avg;
        this.sex = sex;
        this.money = money;
    }

    public Player() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvg() {
        return avg;
    }

    public void setAvg(String avg) {
        this.avg = avg;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public List<entity.Poker> getList() {
        return list;
    }

    public void setList(List<entity.Poker> list) {
        this.list = list;
    }
}
