/**
 * Project: Cannon Game-core
 * File: MainMenu.java
 * Date: Jan 22, 2017
 * Time: 11:38:51 PM
 */

package com.cannon.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector3;
import com.cannon.CannonGame;
import com.cannon.setup.Assets;

/**
 * MainMenu.
 * 
 * @author Rocky Robson - A00914509
 */
public class MainMenu extends ScreenAdapter {

	private static final float MENU_HEIGHT = 40;

	private CannonGame game;
	private Rectangle startBox;
	private Texture start;
	private Vector3 touchPoint;

	public MainMenu(CannonGame game) {
		this.game = game;

		start = Assets.startMenu;
		startBox = new Rectangle((800 / 2) - start.getWidth() / 2, MENU_HEIGHT, start.getWidth(), start.getHeight());

		touchPoint = new Vector3();

	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		displayMenu();

	}

	private void displayMenu() {
		game.batch().begin();
		game.batch().draw(Assets.startMenu, (800 / 2) - Assets.startMenu.getWidth() / 2, MENU_HEIGHT);
		game.batch().end();
	}

	private void update() {

		if (Gdx.input.isTouched()) {

		}

	}

}
