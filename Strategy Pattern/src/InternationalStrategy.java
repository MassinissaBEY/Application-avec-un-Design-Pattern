public class InternationalStrategy implements LivraisonStrategy {
    @Override
    public double calculerFrais(double montantCommande) {
        return 15.0 + montantCommande * 0.05;
    }
}
