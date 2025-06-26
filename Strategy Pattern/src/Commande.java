public class Commande {
    private double montant;
    private LivraisonStrategy livraisonStrategy;

    public Commande(double montant, LivraisonStrategy livraisonStrategy) {
        this.montant = montant;
        this.livraisonStrategy = livraisonStrategy;
    }

    public void setLivraisonStrategy(LivraisonStrategy livraisonStrategy) {
        this.livraisonStrategy = livraisonStrategy;
    }

    public double calculerFraisLivraison() {
        return livraisonStrategy.calculerFrais(montant);
    }

    public double getMontant() {
        return montant;
    }
}
