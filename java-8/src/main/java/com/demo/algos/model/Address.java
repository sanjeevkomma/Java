package com.demo.algos.model;

public class Address implements Cloneable {

	private String addressType;

	private String area;

	private String city;

	public Address(String addressType, String area, String city) {

		super();

		this.addressType = addressType;
		this.area = area;
		this.city = city;

	}
	public String getAddressType() {

		return addressType;
	}
	public void setAddressType(String addressType) {

		this.addressType = addressType;
	}
	public String getArea() {

		return area;
	}
	public void setArea(String area) {

		this.area = area;
	}
	public String getCity() {

		return city;
	}
	public void setCity(String city) {

		this.city = city;
	}

	public Object clone() throws CloneNotSupportedException {

		return super.clone();
	}

	@Override
	public String toString() {

		return "Address Type - "+addressType+", area - "+area+", city - "+city;
	}
}
