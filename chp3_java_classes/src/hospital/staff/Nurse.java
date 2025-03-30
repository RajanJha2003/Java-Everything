package hospital.staff;

public class Nurse extends com.hospital.staff.doctor.salary.Salary {
	
	@Override
	protected double calculateSalary(double amt, double tax) {
		// TODO Auto-generated method stub
		return super.calculateSalary(amt, tax);
	}
	
	
	public static void main(String[] args) {
		Nurse nurse=new Nurse();
		System.out.println(nurse.calculateSalary(10000, 2000));
	}

}
