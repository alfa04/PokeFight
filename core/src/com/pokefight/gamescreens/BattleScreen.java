package com.pokefight.gamescreens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.pokejava.Sprite;

public class BattleScreen implements Screen{
	SpriteBatch batch = new SpriteBatch();
	Sprite charmander = new Sprite(5);
	Sprite charizard = new Sprite(2);
	Texture charmPoke = new Texture("." + charmander.getImage());
	TextureRegion charmPoke1 = new TextureRegion(charmPoke);
	Texture chariPoke = new Texture("." + charizard.getImage());

	TextureRegion chariPoke1 = new TextureRegion(chariPoke);
	Texture battlefield = new Texture("battlefields/1.png");
	private float count =360.0f;
	private float count1 =100.0f;

	public BattleScreen(){

		
	}
	@Override
	public void show() {
	}
	

	
	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(10/255.0f, 15/255.0f, 230/255.0f,1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(battlefield, 0, 44, Gdx.app.getGraphics().getWidth(), Gdx.app.getGraphics().getHeight());
		batch.draw(charmPoke1, (float)135, (float)70,(float) 40,(float) 40,(float) count1, (float)count1, (float)1, (float)1,(float)count);
		batch.draw(chariPoke1, 6.f, 20.f,(float) 50,(float) 50,(float) 100, (float)100, (float)-1, (float)1,(float)0);
		batch.end();
		
		if(count1 < 0.0f)
			count1 = 100.0f;
			else
			count1 --;
		
		if(count < 0.0f)
			count = 360.0f;
			else
			count --;

	}

	@Override
	public void resize(int width, int height) {
	}

	@Override
	public void pause() {
	}

	@Override
	public void resume() {
	}

	@Override
	public void hide() {
	}

	@Override
	public void dispose() {
	}
	

}