package iocsample;

public class Customer {

	private int id;
	private int pin;
	private Address address;
	private BankAccount account;
	private String phone;

	private Customer(int id, int pin, BankAccount account) {  
		this.id = id;
		this.pin = pin;
		this.account = account;
	}

	public Customer(String s) {
	}

	public int getID() {
		return id;
	}
	
	public boolean match(int pin) {
		return this.pin == pin;
	}
	
	public BankAccount getAccount() {
		return account;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPhone() {
		return phone;
	}
}
