package exo4;

import exo2.Builder;
import exo2.Type;
import exo2.Wood;

public class Guitar {

	private String serialNumber, model;
	private double price;
	private Wood backWood;
	private Wood topWood;
	private Builder builder;
	private Type type;
	private GuitarSpec guitarSpec;

	public Guitar(String serialNumber, double price, Builder builder, String model, Type type,
			Wood backWood, Wood topWood) {
		super();
		this.serialNumber = serialNumber;
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public Builder getBuilder() {
		return builder;
	}

	public String getModel() {
		return model;
	}

	public Type getType() {
		return type;
	}

	public Wood getBackWood() {
		return backWood;
	}

	public Wood getTopWood() {
		return topWood;
	}

}
