package pojo;

public class Staff {
	private int id;
    private String name;
    private String role;
    private double salary;
    private int experience;
	@Override
	public String toString() {
		return "Staff [id=" + id + ", name=" + name + ", role=" + role + ", salary=" + salary + ", experience="
				+ experience + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
}
