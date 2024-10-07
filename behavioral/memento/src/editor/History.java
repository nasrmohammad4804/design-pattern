package editor;

import java.util.Stack;

public class History {

    private final Stack<EditorState> states = new Stack<>();

    public EditorState addState(EditorState state) {
        states.add(state);
        return state;
    }

    public EditorState removeLastState() {
        if (states.empty())
            return null;

        return states.pop();
    }
}
