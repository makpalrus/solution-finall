package com.example.inputs.commands;

import entities.Player;

// Атака
public class AttackCommand implements InputCommand {
    private Player player;

    public AttackCommand(Player player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.setAttacking(true);
    }
}
