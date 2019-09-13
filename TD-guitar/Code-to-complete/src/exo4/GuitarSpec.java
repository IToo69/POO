package exo4;

public class GuitarSpec {
	
	String model;
	Wood backWood;
	Wood topWood;
	Builder builder;
	Type type;
	int nbcordes;

	public GuitarSpec(Builder builder, String model, Type type, Wood backWood,
			Wood topWood) {
		super();
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
	}


	public GuitarSpec(Builder builder, String model, Type type, int nbcordes, Wood backWood,
			Wood topWood) {
		this.builder=builder;
		this.model=model;
		this.type=type;
		this.nbcordes=nbcordes;
		this.backWood=backWood;
		this.topWood=topWood;
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
