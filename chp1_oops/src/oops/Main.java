package oops;

// Abstract class for Hospital
abstract class Hospital {
    private String hospitalName;
    private String location;
    private int beds;
    private int staff;
    private String establishedYear;

    public Hospital(String hospitalName, String location, int beds, int staff, String establishedYear) {
        this.hospitalName = hospitalName;
        this.location = location;
        this.beds = beds;
        this.staff = staff;
        this.establishedYear = establishedYear;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public String getLocation() {
        return location;
    }

    public int getBeds() {
        return beds;
    }

    public int getStaff() {
        return staff;
    }

    public String getEstablishedYear() {
        return establishedYear;
    }

    abstract void showInfo();
    abstract void add();
    abstract void update();
    abstract void delete();
    abstract void fetch();
}

// Doctor class extending Hospital
class Doctor extends Hospital {
    private String specialty;
    private int experience;
    private String id;
    private String shift;
    private double salary;

    public Doctor(String hospitalName, String location, int beds, int staff, String establishedYear,
                  String specialty, int experience, String id, String shift, double salary) {
        super(hospitalName, location, beds, staff, establishedYear);
        this.specialty = specialty;
        this.experience = experience;
        this.id = id;
        this.shift = shift;
        this.salary = salary;
    }

    @Override
    void showInfo() {
        System.out.println("Doctor ID: " + id + "\nSpecialty: " + specialty + "\nExperience: " + experience +
                " years\nShift: " + shift + "\nSalary: " + salary);
    }

    @Override
    void add() {
        System.out.println("Doctor added successfully.");
    }

    @Override
    void update() {
        System.out.println("Doctor details updated.");
    }

    @Override
    void delete() {
        System.out.println("Doctor deleted.");
    }

    @Override
    void fetch() {
        System.out.println("Fetching doctor details...");
    }
}

// Patient class extending Hospital
class Patient extends Hospital {
    private String patientId;
    private int age;
    private String illness;
    private String admitDate;
    private String dischargeDate;

    public Patient(String hospitalName, String location, int beds, int staff, String establishedYear,
                   String patientId, int age, String illness, String admitDate, String dischargeDate) {
        super(hospitalName, location, beds, staff, establishedYear);
        this.patientId = patientId;
        this.age = age;
        this.illness = illness;
        this.admitDate = admitDate;
        this.dischargeDate = dischargeDate;
    }

    @Override
    void showInfo() {
        System.out.println("Patient ID: " + patientId + "\nIllness: " + illness + "\nAge: " + age +
                "\nStay: " + admitDate + " to " + dischargeDate);
    }

    @Override
    void add() {
        System.out.println("Patient added successfully.");
    }

    @Override
    void update() {
        System.out.println("Patient details updated.");
    }

    @Override
    void delete() {
        System.out.println("Patient deleted.");
    }

    @Override
    void fetch() {
        System.out.println("Fetching patient details...");
    }
}

// Main class to execute
public class Main {
    public static void main(String[] args) {
        // Doctor object and method calls
        Doctor doc = new Doctor("City Hospital", "Mumbai", 50, 200, "1990", 
                                "Cardiology", 10, "D01", "Day", 75000);
        System.out.println("\n--- Doctor Info ---");
        doc.showInfo();
        doc.add();
        doc.update();
        doc.delete();
        doc.fetch();

        System.out.println("\n------------------------------");

        // Patient object and method calls
        Patient pat = new Patient("City Hospital", "Mumbai", 50, 200, "1990", 
                                  "P01", 28, "Cold", "2025-02-10", "2025-02-15");
        System.out.println("\n--- Patient Info ---");
        pat.showInfo();
        pat.add();
        pat.update();
        pat.delete();
        pat.fetch();
    }
}
