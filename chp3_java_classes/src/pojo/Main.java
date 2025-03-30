package pojo;

class Pojo{
	String name;
	int id;
	double sal;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
}

public class Main {
	public static void main(String[] args) {
		Pojo pojo=new Pojo();
		pojo.setName("Rajan");
		pojo.setId(17);
		pojo.setSal(10000);
		
		System.out.println(pojo.getName());
		System.out.println(pojo.getId());
		System.out.println(pojo.getSal());
	}

}
