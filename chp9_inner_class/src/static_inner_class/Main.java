package static_inner_class;

class Company {
    static String companyName = "RJ Tech";

    
    static class Employee {
        static void showDetails() {
            System.out.println(companyName);
            
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Company.Employee.showDetails();
    }
}
