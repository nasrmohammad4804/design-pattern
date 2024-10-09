package solution;

public class SelectionTool implements Tool {

    @Override
    public void mouseUp() {
        System.out.println("draw dash rectangle");
    }

    @Override
    public void mouseDown() {
        System.out.println("selection icon");
    }
}
