package inheritance;

public class employee {
    private String name;
    private String department;
    private int salary;
    private int amount;


    public employee(String department,String name,int salary) {
        super();
        this.name=name;
        this.department = department;
        this.salary= salary;

    }
    public void showInfo(){
        System.out.println(this.name);
        System.out.println(this.department);
        System.out.println(this.salary);
    }
}
