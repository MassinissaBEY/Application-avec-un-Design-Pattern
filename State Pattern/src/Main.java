// Fichier : Main.java
public class Main {
    public static void main(String[] args) {
        LecteurAudio lecteur = new LecteurAudio();

        lecteur.appuyerPlay();   // --> Démarrage
        lecteur.appuyerPause();  // --> Mise en pause
        lecteur.appuyerPlay();   // --> Reprise
        lecteur.appuyerStop();   // --> Arrêt
        lecteur.appuyerPause();  // --> Erreur : déjà à l’arrêt
    }
}
