// Fichier : PauseState.java
public class PauseState implements Etat {

    @Override
    public void play(LecteurAudio lecteur) {
        System.out.println("Reprise de la lecture...");
        lecteur.setEtat(new LectureState());
    }

    @Override
    public void pause(LecteurAudio lecteur) {
        System.out.println("Déjà en pause.");
    }

    @Override
    public void stop(LecteurAudio lecteur) {
        System.out.println("Arrêt du lecteur...");
        lecteur.setEtat(new StopState());
    }
}
