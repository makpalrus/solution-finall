package com.example.gamestates;

import java.awt.event.MouseEvent;

import main.Game;
import ui.MenuButton;

public class State {

	protected Game game;

	public State(Game game) {
		this.game = game;
	}

	public boolean isIn(MouseEvent e, MenuButton mb) {
		return mb.getBounds().contains(e.getX(), e.getY());
	}

	public Game getGame() {
		return game;
	}

	@SuppressWarnings("incomplete-switch")
	public void setGamestate(GameState state) {
		switch (state) {
			case MENU -> GameStateManager.changeState(GameState.MENU);
			case PLAYING -> game.getAudioPlayer().setLevelSong(game.getPlaying().getLevelManager().getLevelIndex());
		}

		GameState.state = state;
	}

}