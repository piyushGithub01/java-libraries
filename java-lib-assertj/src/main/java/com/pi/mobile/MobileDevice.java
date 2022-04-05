package com.pi.mobile;

public class MobileDevice {
	
	private final String manufacturer;
	private final String model;
	private final String price;
	
	public MobileDevice(final String manufacturer, final String model, final String price) {
		super();
		this.manufacturer = manufacturer;
		this.model = model;
		this.price = price;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public String getModel() {
		return model;
	}

	public String getPrice() {
		return price;
	}
	
}
