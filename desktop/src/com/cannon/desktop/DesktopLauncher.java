package com.cannon.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.cannon.CannonGame;

public class DesktopLauncher {
	public static void main(String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "CannonGame Game";
		config.width = 1080;
		config.height = 720;
		new LwjglApplication(new CannonGame(), config);
	}
}
