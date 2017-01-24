package com.cannon;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.cannon.screens.SplashScreen;
import com.cannon.setup.Assets;

public class CannonGame extends Game {

	private SpriteBatch batch;

	@Override
	public void create() {
		batch = new SpriteBatch();
		Assets.load();
		setScreen(new SplashScreen(this));
	}

	@Override
	public void render() {
		super.render();
	}

	public SpriteBatch batch() {
		return this.batch;
	}

}
