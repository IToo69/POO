package exo3;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
	
	private List<Guitar> guitars;

	public Inventory() {
		guitars = new LinkedList<>();
	}

	public void addGuitar(String serialNumber, double price, Builder builder, String model, Type type, Wood backWood,
			Wood topWood) {
		guitars.add(new Guitar(serialNumber, price, builder, model, type, backWood, topWood));
	}

	public Guitar getGuitar(String serialNumber) {
		for (Iterator<Guitar> i = guitars.iterator(); i.hasNext();) {
			Guitar guitar = i.next();
			if (guitar.getSerialNumber().equalsIgnoreCase(serialNumber)) {
				return guitar;
			}
		}
		return null;
	}

	public List<Guitar> search(GuitarSpec whatCustomerWant) {

		List<Guitar> listGuitars = new LinkedList<>();

		for (Iterator<Guitar> i = guitars.iterator(); i.hasNext();) {
			Guitar guitar = i.next();
			
			Builder builder = whatCustomerWant.getBuilder();
			if (builder != null && !builder.equals(guitar.getBuilder()))
				continue;
			
			String model = whatCustomerWant.getModel();
			if ((model != null) && (!model.equals(""))
					&& (!model.equalsIgnoreCase(guitar.getModel())))
				continue;
			
			Type type = whatCustomerWant.getType();
			if ((type != null) && (!type.equals(guitar.getType())))
				continue;
			
			Wood backWood = whatCustomerWant.getBackWood();
			if ((backWood != null) && (!backWood.equals(guitar.getBackWood())))
				continue;
			
			Wood topWood = whatCustomerWant.getTopWood();
			if ((topWood != null) && (!topWood.equals(guitar.getTopWood())))
				continue;
			
			listGuitars.add(guitar);
		}
		return listGuitars;
	}

}
