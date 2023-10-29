

public class Main {

	public static void main(String[] args) {
		BoiteCourier M= new BoiteCourier(3);
		
		Courier c2=new Courier(true,"Nabeul") ;
		Lettre l1=new Lettre(false,"Sfax",100,"A4");
		Colis colis1=new Colis(true,"",200,1.50);
		
		
		M.couriers[0]=c2;
		M.couriers[1]=l1;
		M.couriers[2]=colis1;
		M.afficher();
		System.out.println("le total:"+M.affranchir());
		System.out.println("les couriers invalides sont :"+M.couriersInvalides());
		
		
		
		
		
		
	}

}
