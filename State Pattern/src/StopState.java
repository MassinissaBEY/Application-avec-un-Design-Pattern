// Fichier : StopState.java
public class StopState implements Etat {

    @Override
    public void play(LecteurAudio lecteur) {
        System.out.println("Démarrage de la lecture...");
        lecteur.setEtat(new LectureState());
    }

    @Override
    public void pause(LecteurAudio lecteur) {
        System.out.println("Le lecteur est arrêté. Impossible de mettre en pause.");
    }

    @Override
    public void stop(LecteurAudio lecteur) {
        System.out.println("Déjà arrêté.");
    }
}
