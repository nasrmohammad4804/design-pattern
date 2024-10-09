package problem;

public class Canvas {

    private final ToolType tool;

    public Canvas(ToolType tool) {
        this.tool = tool;
    }

    public void mouseUp() {


        switch (tool) {

            case BRUSH -> System.out.println("draw a line");
            case ERASER -> System.out.println("erased content");
            case SELECTION -> System.out.println("draw dash rectangle");
            default -> throw new RuntimeException("dont find this toolType");
        }
    }

    public void mouseDown() {

        switch (tool) {

            case BRUSH -> System.out.println("brush icon");
            case ERASER -> System.out.println("eraser icon");
            case SELECTION -> System.out.println("selection icon");
            default -> throw new RuntimeException("dont find this toolType");
        }
    }


}
