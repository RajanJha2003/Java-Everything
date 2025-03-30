package local_inner_class;

class Company {
    void showEmployeeDetails() {
        
        class Employee {
            void display() {
                System.out.println("Employee: Rajan");
                System.out.println("Department: IT");
            }
        }

        
        Employee emp = new Employee();
        emp.display();
    }
}

public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        company.showEmployeeDetails();
    }
}
