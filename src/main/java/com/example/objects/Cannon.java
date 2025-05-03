package com.example.objects;

import inputs.commands.InputCommand;
import main.Game;

import java.awt.*;

public class Cannon extends GameObject implements IGameObject {

	private int tileY;

	public Cannon(int x, int y, int objType) {
		super(x, y, objType);
		tileY = y / Game.TILES_SIZE;
		initHitbox(40, 26);
//		hitbox.x -= (int) (1 * Game.SCALE);
		hitbox.y += (int) (6 * Game.SCALE);
	}

	public void update() {
		if (doAnimation)
			updateAnimationTick();
	}

	@Override
	public void draw(Graphics g, int xOffset) {

	}

	public int getTileY() {
		return tileY;
	}


}
