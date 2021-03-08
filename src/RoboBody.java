public class RoboBody {
    BodyType bodyType;
    private int id = 0;
    private static int count = 1;
    BodyType[] bt = BodyType.values();
    int randomNum = (int) (Math.random() * 3);




    public RoboBody() {

        this.bodyType =bt[randomNum];
        this.id = count++;
    }

    public int getId() {
        return id;
    }
    public Object getType() {
        return bodyType;
    }




    @Override
    public String toString() {
        return "Body: " + bodyType;
    }

}

enum BodyType {
    BODY_TYPE_1,
    BODY_TYPE_2,
    BODY_TYPE_3;
}