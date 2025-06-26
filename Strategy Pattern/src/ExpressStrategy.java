public class ExpressStrategy implements LivraisonStrategy {
    @Override
    public double calculerFrais(double montantCommande) {
        return montantCommande * 0.10;
    }
}
