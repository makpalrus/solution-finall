package com.example.inputs.commands;

public interface InputCommand {
    void execute();
    default void release() {}
}
