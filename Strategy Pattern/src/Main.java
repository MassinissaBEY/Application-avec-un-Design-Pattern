public class Main {
    public static void main(String[] args) {
        Commande commande = new Commande(100, new StandardStrategy());
        System.out.println("Frais livraison standard : " + commande.calculerFraisLivraison() + " €");

        commande.setLivraisonStrategy(new ExpressStrategy());
        System.out.println("Frais livraison express : " + commande.calculerFraisLivraison() + " €");

        commande.setLivraisonStrategy(new InternationalStrategy());
        System.out.println("Frais livraison internationale : " + commande.calculerFraisLivraison() + " €");
    }
}
