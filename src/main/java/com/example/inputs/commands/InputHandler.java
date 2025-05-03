package com.example.inputs.commands;

import java.util.HashMap;
import java.util.Map;

public class InputHandler {
    private Map<Integer, InputCommand> keyCommandMap = new HashMap<>();

    public void bindCommand(int keyCode, InputCommand command) {
        keyCommandMap.put(keyCode, command);
    }

    public void handleKeyPress(int keyCode) {
        InputCommand command = keyCommandMap.get(keyCode);
        if (command != null) {
            command.execute();
        }
    }
    public void handleKeyRelease(int keyCode) {
        InputCommand command = keyCommandMap.get(keyCode);
        if (command != null) {
            command.release();
        }
    }

}
