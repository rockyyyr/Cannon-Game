/**
 * Project: Cannon Game-core
 * File: Assets.java
 * Date: Jan 22, 2017
 * Time: 11:45:08 PM
 */

package com.cannon.setup;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

/**
 * Assets.
 * 
 * @author Rocky Robson - A00914509
 */
public class Assets {

	public static Texture cannon;
	public static Texture cannonBall;
	public static Texture startMenu;
	public static Texture resumeMenu;
	public static Texture splash;

	public static void load() {
		cannon = new Texture(Gdx.files.internal("Cannon.png"));
		cannonBall = new Texture(Gdx.files.internal("Cannon_Ball.png"));
		startMenu = new Texture(Gdx.files.internal("start.png"));
		resumeMenu = new Texture(Gdx.files.internal("resume.png"));
		splash = new Texture(Gdx.files.internal("Splash.png"));
	}

}
