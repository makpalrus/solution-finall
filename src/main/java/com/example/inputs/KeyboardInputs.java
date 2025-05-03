package com.example.inputs;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import entities.Player;
import gamestates.GameState;
import gamestates.GameStateManager;
import inputs.commands.*;
import main.GamePanel;

public class KeyboardInputs implements KeyListener {

	private GamePanel gamePanel;
	private InputHandler inputHandler;

	public KeyboardInputs(GamePanel gamePanel) {
		this.gamePanel = gamePanel;
		inputHandler = new InputHandler();
		Player player = gamePanel.getGame().getPlaying().getPlayer();

		inputHandler.bindCommand(KeyEvent.VK_A, new MoveLeftCommand(player));
		inputHandler.bindCommand(KeyEvent.VK_D, new MoveRightCommand(player));
		inputHandler.bindCommand(KeyEvent.VK_SPACE, new JumpCommand(player));
		inputHandler.bindCommand(KeyEvent.VK_F, new AttackCommand(player));

	}

	@SuppressWarnings("incomplete-switch")
	@Override
	public void keyReleased(KeyEvent e) {
		inputHandler.handleKeyRelease(e.getKeyCode());

	}


	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
			if (GameStateManager.getCurrentState() == GameState.PLAYING) {
				GameStateManager.changeState(GameState.OPTIONS); // или Gamestate.PAUSE, если ты ввела PAUSE
				return;
			}
		}

		inputHandler.handleKeyPress(e.getKeyCode());
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// Not In Use
	}
}