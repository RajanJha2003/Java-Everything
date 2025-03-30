package consumer;

import implementor.Company;

public class Account extends Company {

	@Override
	public double salary(int sal) {
		// TODO Auto-generated method stub
		return sal;
	}

	@Override
	public double salary(int sal, int bonus) {
		// TODO Auto-generated method stub
		return sal+bonus;
	}

	@Override
	public double salary(int sal, int bonus, int tax) {
		// TODO Auto-generated method stub
		return sal+bonus-tax;
	}

}
