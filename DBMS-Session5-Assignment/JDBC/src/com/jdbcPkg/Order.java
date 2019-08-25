package com.jdbcPkg;

/**
 * This is order class which defined for those shoppers who ordered but their order is in the Shipped state
 * @author Shobhit Bhatnagar
 *
 */
public class Order {
	
	private int id;
	private String orderDate;
	private int orderTotal;
	
	/**
	 * Constructor to set member of Order class when object created
	 * @param id shopper id
	 * @param orderDate  
	 * @param orderTotal
	 */
	public Order(int id, String orderDate, int orderTotal){
		this.id = id;
		this.orderDate = orderDate;
		this.orderTotal = orderTotal;
	}
	
	
	/**
	 * This method used to get shopperId
	 * @return shopperId 
	 */
	public int getId(){
		return id;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getDate(){
		return orderDate;
	}
	public int orderTotal(){
		return orderTotal;
	}

}
