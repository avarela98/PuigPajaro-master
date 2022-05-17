package com.mygdx.puig_pajaro;

import com.badlogic.gdx.Game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class PuigPajaro extends Game {
	SpriteBatch batch;
	BitmapFont font;
	int topScore;
	int lastScore;



	public void create() {
		batch = new SpriteBatch();
		font = new BitmapFont();
		this.setScreen(new MainMenuScreen(this));
		topScore = 0;
		lastScore = 0;
	}

	public void render() {
		super.render(); // important!
	}
	public void dispose() {
	}
}
