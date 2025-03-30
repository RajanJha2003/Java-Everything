package hospital.staff;
import com.hospital.staff.doctor.salary.*;

public class Doctor extends Salary {
	@Override
	protected double calculateSalary(double amt, double tax) {
		// TODO Auto-generated method stub
		return super.calculateSalary(amt, tax);
	}
	
    public static void main(String[] args) {
		Doctor doctor=new Doctor();
		System.out.println(doctor.calculateSalary(100000, 2000));
	}
  
}
