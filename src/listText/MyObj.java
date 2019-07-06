package listText;

/**
 * @author liuyi
 * @date 2019/7/6 0006
 */
public class MyObj {


    private  String name ;
    private  int avg;

    public MyObj() {
    }

    public MyObj(String name, int avg) {
        this.name = name;
        this.avg = avg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAvg() {
        return avg;
    }

    public void setAvg(int avg) {
        this.avg = avg;
    }
}
