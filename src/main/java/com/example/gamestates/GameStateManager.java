package com.example.gamestates;
import java.util.ArrayList;
import java.util.List;

public class GameStateManager {
    private static GameState currentState;
    private static final List<GameStateObserver> observers = new ArrayList<>();

    public static void subscribe(GameStateObserver observer) {
        observers.add(observer);
    }

    public static void changeState(GameState newState) {
        currentState = newState;
        notifyObservers();
    }

    private static void notifyObservers() {
        for (GameStateObserver observer : observers) {
            observer.onGameStateChange(currentState);
        }
    }

    public static GameState getCurrentState() {
        return currentState;
    }
}
