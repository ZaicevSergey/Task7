public class Robot <T,S>{
    private String name;
    private int id = 0;
    private static int count = 1;
    T firstPart;
    S secondPart;

    public Robot(T firstPart, S secondPart) {
        this.id = count++;
        this.name = "Robo_" + this.id;

        this.firstPart = firstPart;
        this.secondPart = secondPart;
    }


    @Override
    public String toString() {
        return "Robot: " + name +" " + firstPart.toString() +" "+ secondPart.toString();
    }
}