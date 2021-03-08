public class RoboHead {
    HeadType headType;
    private int id = 0;
    private static int count = 1;
    HeadType[] ht = HeadType.values();
    int randomNum = (int) (Math.random() * 3);


    public RoboHead() {
        this.headType =ht[randomNum];
        this.id = count++;
    }

    public int getId() {
        return id;
    }

    public Object getType() {
        return headType;
    }


    @Override
    public String toString() {
        return "Head: " + headType;

    }
}
enum HeadType {
    HEAD_TYPE_1,
    HEAD_TYPE_2,
    HEAD_TYPE_3;
}