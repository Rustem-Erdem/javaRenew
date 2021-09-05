package encapsulation;

public class main {
    public static void main(String[] args) {
        cars car=new cars();

        car.setColor("blue");
        car.setName("volvo");
        car.setDoors(7);
        car.setEngine(1.6);

        System.out.println(car.getColor());
        System.out.println(car.getDoors());

    }
}
