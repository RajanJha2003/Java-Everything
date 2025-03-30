package exception_propogation;

import java.io.IOException;



class Emp{
	void getData() throws IOException {
		throw new IOException("Employee data not found");
	}
}


class Company{
	void getEmpData() throws IOException {
		Emp emp=new Emp();
		emp.getData();
	}
}

public class Main{
	public static void main(String[] args) {
		Company company=new Company();
		try {
			company.getEmpData();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			
			System.out.println(e);
		}
	}
}