package pojo;

public class Medicine {
	private int id;
    private String medicineName;
    private int quantity;
    private double price;
    private String expiryDate;
	@Override
	public String toString() {
		return "Medicine [id=" + id + ", medicineName=" + medicineName + ", quantity=" + quantity + ", price=" + price
				+ ", expiryDate=" + expiryDate + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMedicineName() {
		return medicineName;
	}
	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
}
