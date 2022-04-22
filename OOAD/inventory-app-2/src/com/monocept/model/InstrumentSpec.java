package com.monocept.model;

public abstract class InstrumentSpec {
	private Builder builder;
	private String model;
	private Type type;
	private Wood backWood;
	private Wood topWood;

	public InstrumentSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood) {
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
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

	public boolean matches(InstrumentSpec otherSpec) {
		if (builder != otherSpec.getBuilder())
			return false;
		if ((model != null) && (!model.equals("")) && (!model.equals(otherSpec.getModel())))
			return false;
		if (type != otherSpec.getType())
			return false;
		if (backWood != otherSpec.getBackWood())
			return false;
		if (topWood != otherSpec.getTopWood())
			return false;
		return true;

	}
}
