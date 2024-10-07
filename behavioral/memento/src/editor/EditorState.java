package editor;

public class EditorState {

    private final String title;
    private final String content;

    public EditorState(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}
