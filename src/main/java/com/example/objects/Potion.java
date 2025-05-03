package com.example.objects;

import main.Game;

import java.awt.*;

public class Potion extends GameObject implements IGameObject{

	private float hoverOffset;
	private int maxHoverOffset, hoverDir = 1;

	public Potion(int x, int y, int objType) {
		super(x, y, objType);
		doAnimation = true;

		initHitbox(7, 14);

		xDrawOffset = (int) (3 * Game.SCALE);
		yDrawOffset = (int) (2 * Game.SCALE);

		maxHoverOffset = (int) (10 * Game.SCALE);
	}

	public void update() {
		updateAnimationTick();
		updateHover();
	}

	@Override
	public void draw(Graphics g, int xOffset) {

	}

	private void updateHover() {
		hoverOffset += (0.075f * Game.SCALE * hoverDir);

		if (hoverOffset >= maxHoverOffset)
			hoverDir = -1;
		else if (hoverOffset < 0)
			hoverDir = 1;

		hitbox.y = y + hoverOffset;
	}
}
