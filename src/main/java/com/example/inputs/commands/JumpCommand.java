package com.example.inputs.commands;
import entities.Player;
public class JumpCommand implements InputCommand {
    private Player player;

    public JumpCommand(Player player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.setJump(true);
    }

    @Override
    public void release() {
        player.setJump(false); // если нужно отключить прыжок после отпускания
    }
}
