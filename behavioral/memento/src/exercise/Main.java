package exercise;

public class Main {
    public static void main(String[] args) {

        Document document = new Document();
        DocumentHistory history = new DocumentHistory();

        document.setContent("text1");
        document.setFontName("vazir");
        document.setFontSize(16);

        history.addDocumentSnapShot(document.saveMemento());

        document.setFontName("b-titr");

        System.out.println(document);

        document.restore(history.popSnapShot());

        System.out.println(document);

    }
}
