public class Factory implements Createable{

    public Robot create() {
        RoboHead rh = new RoboHead();
        RoboBody rb = new RoboBody();


        return new Robot(rb , rh);
    }
}