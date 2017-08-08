package com.ks.rpg.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.ks.rpg.handlers.GameStateManager;

public class Play extends GameState{
	
	private BitmapFont font = new BitmapFont();
	
	private TiledMap tileMap;
	private OrthogonalTiledMapRenderer tmr;
	
	public Play(GameStateManager gsm) {
		super(gsm);
		
		//load tilemap
		tileMap = new TmxMapLoader().load("resources/maps/blankmap.tmx");
		tmr = new OrthogonalTiledMapRenderer(tileMap);
		
	}
	
	public void handleInput() {}
	
	public void update(float dt) {}
	
	public void render() {
		
		//clear screen
		Gdx.gl20.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		//draw tilemap
		tmr.setView(cam);
		tmr.render();
		
	}
	
	public void dispose() {}
}
