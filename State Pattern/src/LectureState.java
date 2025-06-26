// Fichier : LectureState.java
public class LectureState implements Etat {

    @Override
    public void play(LecteurAudio lecteur) {
        System.out.println("Déjà en lecture.");
    }

    @Override
    public void pause(LecteurAudio lecteur) {
        System.out.println("Mise en pause...");
        lecteur.setEtat(new PauseState());
    }

    @Override
    public void stop(LecteurAudio lecteur) {
        System.out.println("Arrêt du lecteur...");
        lecteur.setEtat(new StopState());
    }
}
