
public class Lettre extends Courier {
	private int poids;
	private String format;

	Lettre(boolean express, String adresse,int poids ,String format) {
		super(express, adresse);
		this.poids=poids;
		this.format=format;
		
		
	}
	
	
	@Override
	public String toString() {
		return super.toString()+"Lettre [poids=" + poids + ", format=" + format + "]";
	}


	@Override
	public void decrire()
	{
		System.out.println(toString());
		
		
	}
	@Override
	public double affranchir() 
	{
		double montant=0.0;
		montant=this.format=="A4" ?  2.5  + 0.5 * poids :3.5 +0.5  *  poids;
		{
		return montant;
		}
	}

	public int getPoids() {
		return poids;
	}

	public void setPoids(int poids) {
		this.poids = poids;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		if(format.toUpperCase()=="A4"||format.toUpperCase()=="A3")
		this.format = format.toUpperCase();
		else
			System.out.println("erreur");
		this.format="A3";
	}
	

}
