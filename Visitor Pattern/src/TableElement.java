// TableElement.java
public class TableElement implements DocumentElement {
    private String[][] data;

    public TableElement(String[][] data) {
        this.data = data;
    }

    public String[][] getData() {
        return data;
    }

    @Override
    public void accept(DocumentVisitor visitor) {
        visitor.visit(this);
    }
}
