package exercise;

public class DocumentMemento {

    private final String content;
    private final String fontName;
    private final int fontSize;

    public DocumentMemento(String content,String fontName,int fontSize){
        this.content= content;
        this.fontName =fontName;
        this.fontSize= fontSize;
    }
    public int getFontSize(){
        return this.fontSize;
    }

    public String getContent(){
        return this.content;
    }
    public String getFontName(){
        return this.fontName;
    }
}
