
public class Courier {
protected boolean express;
protected String adresse;
protected final float tarif=0.5f;
Courier (boolean express, String adresse)
{
	this.express=express;
	this.adresse=adresse;
	
}
public boolean estvalid()
{
	return (!this.adresse.isEmpty());
}

@Override
public String toString() {
	return "Courier [express=" + express + ", adresse=" + adresse + "]";
}
public void decrire () 
{
	System.out.println(toString());
}
public double affranchir() {
    if (estvalid()) {
        if (express) {
            return tarif * 2;  
        } else {
            return tarif;  
        }
    } else {
        System.out.println("Le courrier n'est pas valide. L'affranchissement est impossible.");
        return 0.0;  
    }
}}