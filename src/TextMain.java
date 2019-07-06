import listText.ArrayListText;

import java.util.ArrayList;

/**
 * @author liuyi
 * @create 2019-06-27-19:03
 */
public  class TextMain    {

    private static ArrayListText alt = new ArrayListText();


    public static void main(String[] args) {

               alt.delete();


    }

    /**
     * 生成6个1-33之间随机整数 添加到集合 并且遍历
     */
    public static  void  Text01(){


        int [] array = alt.getArrayInt(6,33);
        ArrayList list = alt.listAddArray(array);

        for (Object o : list) {
            System.out.println(o.toString());
        }
    }

    /**
     * 随机生成20个数 到集合
     * 把大集合中偶数 放入小集合中
     * 并且打印
     */
    public static  void  Text02(){

        System.out.println("--------------------Text02--------------------");
        int [] array = alt.getArrayInt(20,99);
        ArrayList list = alt.listISEven(alt.listAddArray(array));

        for (Object o : list) {
            System.out.println(o.toString());
        }
    }



}
