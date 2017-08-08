package com.ks.rpg.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TiledMapTileLayer;
import com.badlogic.gdx.maps.tiled.TiledMapTileLayer.Cell;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.badlogic.gdx.math.MathUtils;
import com.ks.rpg.handlers.GameStateManager;
import com.ks.rpg.handlers.InputManager;

public class Play extends GameState{
	
	private BitmapFont font = new BitmapFont();
	
	private TiledMap tileMap;
	private OrthogonalTiledMapRenderer tmr;
	private float tileSize;
	
	public Play(GameStateManager gsm) {
		super(gsm);
		
		//create player
		createPlayer();
		
		//load tilemap
		createTiles();
		
	}
	
	public void handleInput() {
		
		if(InputManager.isPressed(InputManager.BUTTON_MOVE_UP)) {
			System.out.print("pressed W");
		}
		
		if(InputManager.isPressed(InputManager.BUTTON_MOVE_DOWN)) {
			System.out.print("pressed S");
		}
		
		if(InputManager.isPressed(InputManager.BUTTON_MOVE_LEFT)) {
			System.out.print("pressed A");
		}
		
		if(InputManager.isPressed(InputManager.BUTTON_MOVE_RIGHT)) {
			System.out.print("pressed D");
		}
		
	}
	
	public void update(float dt) {
		handleInput();
		
	}
	
	public void render() {
		
		//clear screen
		Gdx.gl20.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		//draw tilemap
		tmr.setView(cam);
		tmr.render();
		
	}
	
	public void dispose() {}
	
	private void createPlayer() {
		
	}
	
	private void createTiles() {
		
		//load tilemap
				tileMap = new TmxMapLoader().load("resources/maps/mapTest.tmx");
				tmr = new OrthogonalTiledMapRenderer(tileMap);
				
				TiledMapTileLayer layer;
				
				layer = (TiledMapTileLayer)tileMap.getLayers().get("l_Overlay");
				createLayer(layer);
				tileSize = (int)tileMap.getProperties().get("tilewidth");
	}
	
	private void createLayer(TiledMapTileLayer layer) {
		//row = y, col = x
		for(int row = 0; row < layer.getHeight(); row++) {
			for(int col = 0; col < layer.getWidth(); col++) {
				
				//get cell
				Cell cell = layer.getCell(col, row);
				
				//check if cell exists
				if(cell == null) continue;
				if(cell.getTile() == null) continue;
				
				//create collision object
				
				
			}
		}
	}
	
	
}
