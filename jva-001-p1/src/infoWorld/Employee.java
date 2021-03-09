package infoWorld;


public class Employee extends Object {

    private final String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public static void main(String[] args) {

        Employee emp = new Employee("John Deer");

        System.out.println(emp.getName());
    }
}
