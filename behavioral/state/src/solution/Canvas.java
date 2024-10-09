package solution;

public  class Canvas {

    private Tool tool ;

    public Canvas(Tool tool){
        this.tool = tool;
    }

    public void mouseUp(){
        tool.mouseUp();
    }
    public void mouseDown(){
        tool.mouseDown();
    }

    public void setTool(Tool tool) {
        this.tool = tool;
    }

    public Tool getTool() {
        return tool;
    }
}
