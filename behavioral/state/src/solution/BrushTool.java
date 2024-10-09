package solution;

public class BrushTool implements Tool {
    @Override
    public void mouseUp() {
        System.out.println("draw a line");
    }

    @Override
    public void mouseDown() {
        System.out.println("brush icon");
    }
}
