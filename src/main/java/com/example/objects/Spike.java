package com.example.objects;

import main.Game;

import java.awt.*;

public class Spike extends GameObject implements IGameObject{

	public Spike(int x, int y, int objType) {
		super(x, y, objType);
		initHitbox(32, 16);
		xDrawOffset = 0;
		yDrawOffset = (int)(Game.SCALE * 16);
		hitbox.y += yDrawOffset;
	}

	@Override
	public void update() {

	}

	@Override
	public void draw(Graphics g, int xOffset) {

	}
}
