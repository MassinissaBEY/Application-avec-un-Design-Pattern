// WordCountVisitor.java
public class WordCountVisitor implements DocumentVisitor {
    private int wordCount = 0;

    @Override
    public void visit(TextElement text) {
        // Compte les mots dans le texte en séparant par espaces
        if (text.getText() != null && !text.getText().isEmpty()) {
            wordCount += text.getText().split("\\s+").length;
        }
    }

    @Override
    public void visit(ImageElement image) {
        // Pas de mots dans une image, rien à faire
    }

    @Override
    public void visit(TableElement table) {
        // Compte les mots dans toutes les cellules du tableau
        if (table.getData() != null) {
            for (String[] row : table.getData()) {
                for (String cell : row) {
                    if (cell != null && !cell.isEmpty()) {
                        wordCount += cell.split("\\s+").length;
                    }
                }
            }
        }
    }

    public int getWordCount() {
        return wordCount;
    }
}
