package encapsulation;

public class cars {
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    private  double engine;

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        if(doors==2||doors==4) {
            this.doors = doors;
        }else{
            System.out.println("doors should be only 2 or 4");
        }
    }

    private int doors;
}
