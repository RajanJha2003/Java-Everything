package staticnonstatic;

class Emp {
    
    String name = "Rajan";
    int age = 25;
    
    
    static String companyName = "RJ";
    static String companyLocation = "Mumbai";

    
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

 
    void showDetails() {
        System.out.println("Employee Details - Name: " + name + ", Age: " + age);
    }

   
    static void companyInfo() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Location: " + companyLocation);
    }


    static void showCompanyDetails() {
        System.out.println("Company Details - Name: " + companyName + ", Location: " + companyLocation);
    }
}

public class Main {
    public static void main(String[] args) {
        Emp emp = new Emp();
        
        // Accessing non-static variables and methods
        System.out.println(emp.name);
        System.out.println(emp.age);
        emp.displayInfo();
        emp.showDetails();

        // Accessing static variables and methods
        System.out.println(Emp.companyName);
        System.out.println(Emp.companyLocation);
        Emp.companyInfo();
        Emp.showCompanyDetails();
    }
}
