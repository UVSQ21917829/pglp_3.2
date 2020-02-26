package fr.uvsq.exercice2;

public class Employe extends AllEmploye {
	final private int salaire=1500;
	private int startYear;
	public Employe(int startYear ) {
		this.startYear=startYear;
	}
	@Override
	public double salaire() {
		// TODO Auto-generated method stub
		return salaire+(2020-this.startYear)*20;
	}

}
