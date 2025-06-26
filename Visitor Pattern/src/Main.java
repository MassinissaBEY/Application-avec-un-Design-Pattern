// Main.java
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Création de la liste d'éléments du document
        List<DocumentElement> document = new ArrayList<>();

        // Ajout d'un texte
        document.add(new TextElement("Bonjour, ceci est un document exemple."));

        // Ajout d'une image
        document.add(new ImageElement("image1.png"));

        // Ajout d'un tableau
        String[][] tableData = {
                {"Cellule 1", "Cellule 2"},
                {"Contenu long ici", "Autre contenu"}
        };
        document.add(new TableElement(tableData));

        // Création du visiteur pour compter les mots
        WordCountVisitor wordCounter = new WordCountVisitor();

        // Parcours des éléments du document avec le visiteur
        for (DocumentElement element : document) {
            element.accept(wordCounter);
        }

        // Affichage du résultat
        System.out.println("Nombre total de mots dans le document : " + wordCounter.getWordCount());
    }
}
