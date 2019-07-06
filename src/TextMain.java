import listText.ArrayListText;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liuyi
 * @create 2019-06-27-19:03
 */
public  class TextMain    {

    private static ArrayListText alt = new ArrayListText();


    public static void main(String[] args) {

        String [] names = new String[]{"1","2","3"};
        ArrayList <String> list = alt.listAddArray(names);
        for (String s : list) {
            System.out.println(s);
        }


        Text01();

    }

    /**
     * 生成6个1-33之间随机整数 添加到集合 并且遍历
     */
    public static  void  Text01(){


        Integer [] array = alt.getArrayInt(6,33);

        ArrayList list = new ArrayList();
        list.addAll(List.of(array));

        for (Object o : list) {
            System.out.println(o.toString());
        }
    }





}
