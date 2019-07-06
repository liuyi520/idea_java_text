package entity;
import entity.Player;
import entity.Poker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author liuyi
 * @date 2019/7/6 0006
 */
public class Landlords {

    /**
     * 创建一首牌
     * @return
     */
    public List<Poker> setUpPoker(){
        List<Poker> list = new ArrayList<Poker>();
        list.add(new Poker("","","大王"));
        list.add(new Poker("","","小王"));

        String [] suit = new String[]{"♣","♤","♢","♠"};
        String [] size = new String[]{"A","2","3","4","5","6","7","8","9","10","j","Q","K"};

        for (String s : suit) {

            for (String s1 : size) {
                list.add(new Poker(s,s1,""));
            }

        }


        return  list;
    }


    /**
     * 洗牌
     * @param list
     */
    public void xipai(List<Poker> list){
        Collections.shuffle(list);
    }

    public void  fapai(List<Poker> pokers, List<entity.Player> players){

        for (int i = 0; i < pokers.size()-3; i++) {
            if(i % 3 ==0){

                players.get(0).getList().add(pokers.get(i));
            }
            else if (i % 3 ==1){

                players.get(1).getList().add(pokers.get(i));
            }
            else if (i % 3 ==2){

                players.get(2).getList().add(pokers.get(i));
            }
        }
    }


    /**
     * 看牌
     * @param player
     */
    public void  show(entity.Player player){

        List<Poker> list = player.getList();

        System.out.println();
        System.out.print("[");

        for (Poker poker : list) {
            System.out.print(poker.toString()+",");
        }

        System.out.print("]  "+player.getName());
    }

}
