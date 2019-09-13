package exo3;

public class GuitarSpec {
	
	String model;
	Wood backWoods;
	Wood topWoods;
	Builder builders;
	Type types;

	public GuitarSpec(Builder builder, String model, Type type, Wood backWood,
			Wood topWood) {
		super();
		this.builders = builder;
		this.model = model;
		this.types = type;
		this.backWoods = backWood;
		this.topWoods = topWood;
	}


	public exo3.Builder getBuilder() {
		return builders;
	}

	public String getModel() {
		return model;
	}

	public exo3.Type getType() {
		return types;
	}

	public exo3.Wood getBackWood() {
		return backWoods;
	}

	public exo3.Wood getTopWood() {
		return topWoods;
	}

	public boolean equals(Object arg0) {
		boolean equals = false;
		if (arg0 instanceof Guitar) {
			Guitar currentGuitar = (Guitar) arg0;
			equals = currentGuitar.getBackWood().equals(this.getBackWood())
					&& currentGuitar.getBuilder().equals(this.getBuilder())
					&& currentGuitar.getTopWood().equals(this.getTopWood())
					&& currentGuitar.getModel().equals(this.getModel());
		}
		return equals;
	}

}
