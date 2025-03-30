package anonymous_inner_class;


interface Employee {
    void work();
}


abstract class Department {
    abstract void departmentInfo();
}


class Company {
    void companyInfo() {
        System.out.println("Company Name:tech.");
    }
}

public class Main {
    public static void main(String[] args) {
        
        Employee emp = new Employee() {
            @Override
            public void work() {
                System.out.println("Employee is working on a project.");
            }
        };
        emp.work();

        
        Department dept = new Department() {
            @Override
            void departmentInfo() {
                System.out.println("Department: Software Development");
            }
        };
        dept.departmentInfo();

       
        Company company = new Company() {
            void companyInfo() {
                System.out.println("Company Name:RJ");
            }
        };
        company.companyInfo();
    }
}
