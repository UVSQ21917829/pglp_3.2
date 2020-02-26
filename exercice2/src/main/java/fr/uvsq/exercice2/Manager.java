package fr.uvsq.exercice2;

import fr.uvsq.exercice2.AllEmploye;

public class Manager extends AllEmploye {
    
	final private int base=1500;
	private int NombresEmplyes;
	
	public Manager(int nombresEmplyes) {
		super();
		NombresEmplyes = nombresEmplyes;
	}

	@Override
	public double salaire() {
		// TODO Auto-generated method stub
		return base+(NombresEmplyes*100);
	}

}
