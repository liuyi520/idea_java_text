import listText.ArrayListText;
import listText.MyObj;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liuyi
 * @create 2019-06-27-19:03
 */
public  class TextMain    {

    private static ArrayListText alt = new ArrayListText();


    public static void main(String[] args) {

     /*   String [] names = new String[]{"1","2","3"};
        ArrayList <String> list = alt.listAddArray(names);
        for (String s : list) {
            System.out.println(s);
        }*/
        max(new int []{6,3,8,223,43,234});


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

    /**
     * 冒泡排序
     * @param array
     */
    public static  void max( int [] array){

        int num = 0 ;

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length - i - 1; j++) {

                if(array[j] > array[j+1]){
                    num = array[j];
                    array[j] = array[j+1];
                    array[j+1] = num;
                }
            }
        }

        for (int i1 : array) {
            System.out.println(i1);
        }
    }





}
