package main;

import java.util.ArrayList;

import implementor.BillingImp;
import pojo.Billing;

public class BillingMain {
  public static void main(String[] args) {
	  Billing billing1 = new Billing();
      billing1.setId(201);
      billing1.setPatientId(10);
      billing1.setTotalAmount(10000);
      billing1.setPaymentMethod("Credit Card");
      billing1.setPaid(true);
      
      Billing billing2 = new Billing();
      billing2.setId(202);
      billing2.setPatientId(11);
      billing2.setTotalAmount(5000);
      billing2.setPaymentMethod("Cash");
      billing2.setPaid(false);
      
      Billing billing3 = new Billing();
      billing3.setId(203);
      billing3.setPatientId(12);
      billing3.setTotalAmount(15000);
      billing3.setPaymentMethod("UPI");
      billing3.setPaid(true);
      
      Billing billing4 = new Billing();
      billing4.setId(204);
      billing4.setPatientId(13);
      billing4.setTotalAmount(20000);
      billing4.setPaymentMethod("Debit Card");
      billing4.setPaid(false);
      
      ArrayList<Billing> arrayList=new ArrayList<Billing>();
      arrayList.add(billing1);
      arrayList.add(billing2);
      arrayList.add(billing3);
      arrayList.add(billing4);
      
      BillingImp billingImp=new BillingImp();
      billingImp.addBilling(arrayList);
      billingImp.getAllBillings();
      System.out.println("------------------------");
      
      Billing billing5 = new Billing();
      billing5.setId(204);
      billing5.setPatientId(13);
      billing5.setTotalAmount(150000);
      billing5.setPaymentMethod("UPI");
      billing5.setPaid(true);
      
      billingImp.updateBilling(204, billing5);
      billingImp.getAllBillings();
      System.out.println("------------------------------");
      
      billingImp.searchBilling(204);
      System.out.println("----------------------------");
      
      billingImp.removeBilling(203);
      billingImp.getAllBillings();
      
      
}
}
