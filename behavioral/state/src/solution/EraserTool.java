package solution;

public class EraserTool implements Tool {
    @Override
    public void mouseUp() {
        System.out.println("erased content");
    }

    @Override
    public void mouseDown() {
        System.out.println("eraser icon");
    }
}
