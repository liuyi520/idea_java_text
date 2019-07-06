package listText;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * @author liuyi
 * @create 2019-06-27-18:54
 */
public class ArrayListText   {


    /**
     *
     * @param num 个数
     * @param max 最大范围
     * @return
     */
    public int[] getArrayInt(int num,int max){

        int [] arrayInt = new int[num];
        Random random = new Random();

        for (int i = 0; i < arrayInt.length; i++) {

            arrayInt[i] = random.nextInt(max) + 1;
        }
        return  arrayInt;
    }


    /**
     * 集合连续删除元素
     * 普通方式
     */
    public void  deleteList (){


           List<MyObj> list = new ArrayList<MyObj>();
           list.add(new MyObj("liuyi",23));
           list.add(new MyObj("l",24));
           list.add(new MyObj("i",25));
           list.add(new MyObj("u",26));

           for (int i = 0; i < list.size(); i++) {
               if( (list.get(i).getAvg() == 24) || (list.get(i).getAvg() == 26) ){
                   list.remove(i);
                   //list集合本质就是数组 当删除一个元素之后 后面的元素会近一位
                   //导致集合的下标 和 元素不匹配 所以在删除元素成功之后 需要下标减1
                   i--;

               }
           }

           for (MyObj obj : list) {
               System.out.println("姓名:"+obj.getName()+"         年龄:"+obj.getAvg());
           }

       }


    /**
     * 通过迭代器的方式删除元素
     */
    public  void  delete(){

        List<String> list = new ArrayList<String>();
        list.add("小白");
        list.add("小白");
        list.add("小黑");
        list.add("小韩古");

        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            if ("小白".equals(it.next())){
                //当使用迭代器时  删除元素要使用迭代器对象  而不能是集合对象
                it.remove();
            }
            System.out.println(it.next());
        }


    }


    /**
     * 把数组转换为集合
     * @param array 要添加的数组
     * @return
     */
    public ArrayList listAddArray(int [] array){

        ArrayList list = new ArrayList();

        for (int i = 0; i < array.length; i++) {

            list.add(array[i]);
        }

        return list;

    }


    /**
     * 判断集合中的偶数
     * @param al 大集合
     * @return
     */
    public ArrayList<Integer> listISEven(ArrayList<Integer> al){

        ArrayList<Integer> list = new ArrayList<Integer>();

        for (Integer integer : al) {

            if ((integer % 2) == 0){

              list.add(integer);

            }
        }
        return  list;
    }


}
