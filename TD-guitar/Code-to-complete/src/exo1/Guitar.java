package exo1;

import exo2.Builder;
import exo2.Type;
import exo2.Wood;

public class Guitar {

	public String serialNumber, builder, model, type, backWood, topWood;
	public double price;
	Wood backWoods, topWoods;
	Builder builders;
	Type types;

	public Guitar(String serialNumber, double price, Builder builders, String model, Type types, Wood backWoods,
			Wood topWoods) {
		super();
		this.serialNumber = serialNumber;
		this.builders = builders;
		this.model = model;
		this.types = types;
		this.backWoods = backWoods;
		this.topWoods = topWoods;
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


	public Builder getBuilders() {
		return builders;
	}

	public String getModel() {
		return model;
	}

	public Type getType() {
		return types;
	}

	public Wood getBackWood() {
		return backWoods;
	}

	public Wood getTopWood() {
		return topWoods;
	}

	public boolean equals(Object arg0) {
		boolean equals = false;
		if (arg0 instanceof Guitar) {
			Guitar currentGuitar = (Guitar) arg0;
			equals = currentGuitar.getBackWood().equals(this.getBackWood())
					&& currentGuitar.getBuilders().equals(this.getBuilders())
					&& currentGuitar.getTopWood().equals(this.getTopWood())
					&& currentGuitar.getModel().equals(this.getModel());
		}
		return equals;
	}

}
