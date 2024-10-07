package editor;

public class Main {
    public static void main(String[] args) {

        Editor editor = new Editor();
        History history = new History();

        editor.setTitle("title1");
        editor.setContent("content1");

        System.out.println(editor);
        history.addState(editor.createState());

        editor.setContent("C2");
        System.out.println(editor);

        editor.restore(history.removeLastState());
        System.out.println(editor);

        editor.restore(history.removeLastState());
        System.out.println(editor);

    }
}
