package solution;

public class Main {
    public static void main(String[] args) {

        Canvas canvas = new Canvas(new SelectionTool());

        canvas.mouseDown();
        canvas.mouseUp();


        canvas.setTool(new EraserTool());

        canvas.mouseDown();
        canvas.mouseUp();


    }
}
