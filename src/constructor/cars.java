package constructor;

public class cars {
    private int doors;
    private String color;
    private  double engine;
    private String name;

    public cars(String color, String name,double engine, int doors){
        this.color=color;
        this.doors=doors;
        this.engine=engine;
        this.name=name;

    }
    public cars(){
        this("black","BMW",3.7,3);
    }




    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }



    public String getName(String s) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public double getEngine(double v) {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }



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
    public void showInfo(){
        System.out.println("car color is:  "+this.color);
        System.out.println("car doors are:  "+ this.doors);
        System.out.println("car name is :  "+ this.name);
        System.out.println("car engine is :  "+ this.engine);


    }


}