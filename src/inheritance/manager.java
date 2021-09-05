package inheritance;

public class manager extends employee{
    private int num_of_employees; // example for an attribute which we added later
    public manager(String department, String name, int salary, int num_of_employees) {

        super(department, name, salary );
        this.num_of_employees= num_of_employees;
    }
    public void raiseSalary(int amount){
        System.out.println("%"+amount+ "  raise for employees");
    }
}
