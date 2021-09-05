package inheritance;

public class main {
    public static void main(String[] args) {
//        employee employees = new employee("software", "Rustem Erdem", 145000);
//        employees.showInfo();
     manager Manager= new manager("software","Rustem Erdem",145000,35);
    Manager.showInfo();
    Manager.raiseSalary(24);

    }

}
