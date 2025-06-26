// Fichier : LecteurAudio.java
public class LecteurAudio {
    private Etat etat;

    public LecteurAudio() {
        this.etat = new StopState(); // État initial
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
    }

    public void appuyerPlay() {
        etat.play(this);
    }

    public void appuyerPause() {
        etat.pause(this);
    }

    public void appuyerStop() {
        etat.stop(this);
    }
}
