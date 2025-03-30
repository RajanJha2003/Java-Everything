package overriding;


class Account{
	double sal(int sal) {
		return sal;
	}
	
	double sal(int sal,int bonus) {
		return sal+bonus;
	}
	
	double sal(int sal,int bonus,int tax) {
		return sal+bonus-tax;
	}
}




class Manager extends Account {
	@Override
	double sal(int sal, int bonus) {
		// TODO Auto-generated method stub
		return super.sal(sal, bonus);
	}
	
}


class HR extends Account{
	@Override
	double sal(int sal, int bonus, int tax) {
		// TODO Auto-generated method stub
		return super.sal(sal, bonus, tax);
	}
}


class Employee extends Account{
	@Override
	double sal(int sal) {
		// TODO Auto-generated method stub
		return super.sal(sal);
	}
}

public class Main {
	
	public static void main(String[] args) {
		Employee employee=new Employee();
		System.out.println(employee.sal(1000));
		
		
		Manager manager=new Manager();
		System.out.println(manager.sal(100000, 2000));
		
		HR hr=new HR();
		System.out.println(hr.sal(100000, 2000, 1000));
	}

}
