package simple_inner_class;

class Employee {
    private String name = "Rajan";

    
    class Department {
        void showDepartment() {
            System.out.println("Employee Name: " + name);
            System.out.println("Department: IT");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee();
        Employee.Department dept = emp.new Department();
        dept.showDepartment();
    }
}
