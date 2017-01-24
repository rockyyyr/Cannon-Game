
package com.cannon.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.cannon.CannonGame;
import com.cannon.setup.Assets;
import com.cannon.util.SpriteTween;

import aurelienribon.tweenengine.BaseTween;
import aurelienribon.tweenengine.Tween;
import aurelienribon.tweenengine.TweenCallback;
import aurelienribon.tweenengine.TweenEquations;
import aurelienribon.tweenengine.TweenManager;

/**
 * SplashScreen.
 * 
 * @author Rocky Robson
 */
public class SplashScreen implements Screen {

	private CannonGame game;

	private Texture splash;
	private Sprite splashSprite;
	private SpriteBatch batch;
	private TweenManager manager;

	public SplashScreen(CannonGame game) {
		this.game = game;
	}

	/*
	 * (non-Javadoc)
	 * @see com.badlogic.gdx.Screen#render(float)
	 */
	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		manager.update(delta);

		batch.begin();
		splashSprite.draw(batch);
		batch.end();
	}

	/*
	 * (non-Javadoc)
	 * @see com.badlogic.gdx.Screen#show()
	 */
	@Override
	public void show() {
		splash = Assets.splash;
		splash.setFilter(TextureFilter.Linear, TextureFilter.Linear);

		splashSprite = new Sprite(splash);
		splashSprite.setColor(1, 1, 1, 0);

		batch = new SpriteBatch();

		Tween.registerAccessor(Sprite.class, new SpriteTween());

		manager = new TweenManager();

		TweenCallback callback = new TweenCallback() {

			@Override
			public void onEvent(int type, BaseTween<?> source) {
				tweenCompleted();
			}
		};

		Tween.to(splashSprite, SpriteTween.ALPHA, 1.5f).target(1).ease(TweenEquations.easeInQuad).repeatYoyo(1, 1f).setCallback(callback)
				.setCallbackTriggers(TweenCallback.COMPLETE).start(manager);

	}

	private void tweenCompleted() {
		game.setScreen(new MainMenu(game));
	}

	/*
	 * (non-Javadoc)
	 * @see com.badlogic.gdx.Screen#resize(int, int)
	 */
	@Override
	public void resize(int width, int height) {
	}

	/*
	 * (non-Javadoc)
	 * @see com.badlogic.gdx.Screen#pause()
	 */
	@Override
	public void pause() {
	}

	/*
	 * (non-Javadoc)
	 * @see com.badlogic.gdx.Screen#resume()
	 */
	@Override
	public void resume() {
	}

	/*
	 * (non-Javadoc)
	 * @see com.badlogic.gdx.Screen#hide()
	 */
	@Override
	public void hide() {
	}

	/*
	 * (non-Javadoc)
	 * @see com.badlogic.gdx.Screen#dispose()
	 */
	@Override
	public void dispose() {
		splash.dispose();
		batch.dispose();
	}

}
