package exercise;

import java.util.Stack;

public class DocumentHistory {

    private final Stack<DocumentMemento> documentMementos = new Stack<>();

    public void addDocumentSnapShot(DocumentMemento memento) {
        documentMementos.add(memento);
    }

    public DocumentMemento popSnapShot() {


        if (!documentMementos.isEmpty())
            return documentMementos.pop();

        return null;
    }
}
