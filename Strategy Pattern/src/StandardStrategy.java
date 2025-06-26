public class StandardStrategy implements LivraisonStrategy {
    @Override
    public double calculerFrais(double montantCommande) {
        return 5.0;
    }
}
