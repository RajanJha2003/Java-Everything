package operations;

import java.util.ArrayList;

import pojo.Billing;



public interface BillingOperations {
	void addBilling(ArrayList<Billing> billing);
    void searchBilling(int id);
    void getAllBillings();
    void updateBilling(int id, Billing bill);
    void removeBilling(int id);
}
