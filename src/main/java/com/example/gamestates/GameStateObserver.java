package com.example.gamestates;
public interface GameStateObserver {
    void onGameStateChange(gamestates.Gamestate newState);
}