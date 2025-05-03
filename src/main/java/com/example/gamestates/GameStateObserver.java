package com.example.gamestates;

public interface GameStateObserver {
    void onGameStateChange(GameState newState);
}
