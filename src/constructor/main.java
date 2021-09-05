package constructor;



public class main {
    public static void main(String[] args) {
        cars car=new cars("blue","volvo",1.6,2);
        cars car1=new cars();

        car.showInfo();
        System.out.println("-------------------");
        car1.showInfo();


//        car.setColor("blue");
//        car.setName("volvo");
//        car.setDoors(2);
//        car.setEngine(1.6);


    }

}
