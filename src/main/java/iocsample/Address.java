package iocsample;

public class Address {

	private String num;
	private String road;
	private String district;
	private String province;
	
	public Address(String num, String road, String district, String province) {
		this.num = num;
		this.road = road;
		this.district = district;
		this.province = province;
	}
	
	public String toString() {
		String line1 = num + " " + road + " Road, ";
		String line2 = district + ", " + province;
		return line1 + line2;
	}
}
