package editor;

public class Editor {

    private String content;

    private String title;

    public EditorState createState() {
        return new EditorState(title, content);
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void restore(EditorState state){

        if (state!=null){

            this.title= state.getTitle();
            this.content = state.getContent();
        }
        else {
            this.title = "";
            this.content="";
        }
    }

    public String getContent() {
        return content;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Editor{" +
                "content='" + content + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}

