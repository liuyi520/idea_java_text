import entity.Landlords;
import entity.Player;
import entity.Poker;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liuyi
 * @date 2019/7/6 0006
 */
public class LandlordsMain {

    public static void main(String[] args) {

        Landlords ld = new Landlords();
        //创建一首扑克
        List<Poker> pokers = ld.setUpPoker();
        //洗牌
        ld.xipai(pokers);

        //创建三个玩家
        List<Player> players = new ArrayList<Player>();
        Player player = new Player("小白", "19", "男", 500);
        Player player1 = new Player("小黑", "22", "男", 1100);
        Player player2 = new Player("小黄", "16", "女", 1220);
        players.add(player);
        players.add(player1);
        players.add(player2);

        //发牌
        ld.fapai(pokers,players);

        //看牌
        ld.show(player);
        ld.show(player1);
        ld.show(player2);




    }


}
