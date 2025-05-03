package com.example.inputs.commands;

import entities.Player;

// Движение влево
public class MoveLeftCommand implements InputCommand {
    private Player player;

    public MoveLeftCommand(Player player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.setLeft(true);
    }
    @Override
    public void release() {
        player.setLeft(false); // ❗ вот это нужно!
    }
}



