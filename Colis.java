
public class Colis extends Courier {
	int poids;
	double volume;

	Colis(boolean express, String adresse,int poids,double volume) {
		super(express, adresse);
		this.poids=poids;
		this.volume=volume;
		
	}
	@Override
	public String toString() {
		return super.toString()+"Colis [poids=" + poids + ", volume=" + volume + "]";
	}
public void decrire()
		{
		System.out.println(toString());
			
			
		}
	public double affranchir()
	{
		double montant;
		super.affranchir();
		 montant=0.25 * volume + poids * 1.0;
		 return montant;
			}
		
	

}
