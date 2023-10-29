public class BoiteCourier {
	
     Courier[] couriers;

    public BoiteCourier(int n) {
        couriers = new Courier[n];
    }

    public double affranchir() {
        double montantTotal = 0;

        for (int i = 0; i < couriers.length; i++) {
            double montantCourrier = couriers[i].affranchir();
            montantTotal += montantCourrier;
        }

        return montantTotal;
    }

    public int couriersInvalides() {
        int count = 0;

        for (int i = 0; i < couriers.length; i++) {
            if (!couriers[i].estvalid()) {
                count++;
            }
        }

        return count;
    }

    public void afficher() {
        for (int i = 0; i < couriers.length; i++) {
   
            couriers[i].decrire();
            if (!couriers[i].estvalid()) {
                System.out.println("Ce courrier est invalide.");
            }
         
        }
    }
}
