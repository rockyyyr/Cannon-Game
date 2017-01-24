package com.cannon.util;

import com.badlogic.gdx.graphics.g2d.Sprite;

import aurelienribon.tweenengine.TweenAccessor;

/**
 * SpriteTween.
 * 
 * @author Rocky Robson
 */
public class SpriteTween implements TweenAccessor<Sprite> {

	public static final int ALPHA = 1;

	/*
	 * (non-Javadoc)
	 * @see aurelienribon.tweenengine.TweenAccessor#getValues(java.lang.Object, int, float[])
	 */
	@Override
	public int getValues(Sprite target, int tweenType, float[] returnValues) {
		if (tweenType == ALPHA) {
			returnValues[0] = target.getColor().a;
			return 1;
		} else {
			return 0;
		}
	}

	/*
	 * (non-Javadoc)
	 * @see aurelienribon.tweenengine.TweenAccessor#setValues(java.lang.Object, int, float[])
	 */
	@Override
	public void setValues(Sprite target, int tweenType, float[] newValues) {
		if (tweenType == ALPHA)
			target.setColor(1, 1, 1, newValues[0]);
	}

}
