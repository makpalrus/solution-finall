package com.example.inputs.commands;
import entities.Player;
public class MoveRightCommand implements InputCommand {
    private Player player;

    public MoveRightCommand(Player player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.setRight(true);
    }

    @Override
    public void release() {
        player.setRight(false);
    }
}
