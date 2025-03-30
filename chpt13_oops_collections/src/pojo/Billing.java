package pojo;

public class Billing {
	private int id;
    private int patientId;
    private double totalAmount;
    private String paymentMethod;
    private boolean isPaid;
	@Override
	public String toString() {
		return "Billing [id=" + id + ", patientId=" + patientId + ", totalAmount=" + totalAmount + ", paymentMethod="
				+ paymentMethod + ", isPaid=" + isPaid + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public boolean isPaid() {
		return isPaid;
	}
	public void setPaid(boolean isPaid) {
		this.isPaid = isPaid;
	}
}
