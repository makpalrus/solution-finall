package com.example.gamestates;

import java.util.ArrayList;
import java.util.List;

public class GamestateManager {
    private static List<GameStateObserver> observers = new ArrayList<>();

    public static void subscribe(GameStateObserver o) {
        observers.add(o);
    }

    public static void changeState(gamestates.Gamestate newState) {
        gamestates.Gamestate.state = newState;
        for (GameStateObserver o : observers)
            o.onGameStateChange(newState);
    }
}