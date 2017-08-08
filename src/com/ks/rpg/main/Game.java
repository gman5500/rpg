package com.ks.rpg.main;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.ks.rpg.handlers.GameStateManager;
import com.ks.rpg.handlers.InputManager;
import com.ks.rpg.handlers.InputProcessor;
import com.ks.rpg.handlers.ResourceManager;

public class Game implements ApplicationListener{

	public static final String TITLE = "RPG";
	public static final int V_WIDTH = 600;
	public static final int V_HEIGHT = 400;
	public static final int SCALE = 2;
	
	public static final float STEP = 1/60f;
	private float accum;
	
	private SpriteBatch sb;
	private OrthographicCamera cam;
	private OrthographicCamera hudCam;
	
	private GameStateManager gsm;
	
	public static ResourceManager res;
	
	public void create() {
		
		Gdx.input.setInputProcessor(new InputProcessor());
		res = new ResourceManager();
		
		//load textures
		res.loadTexture("resources/sprites/ahaego.png", "player");
		
		sb = new SpriteBatch();
		cam = new OrthographicCamera();
		cam.setToOrtho(false, V_WIDTH, V_HEIGHT);
		hudCam = new OrthographicCamera();
		hudCam.setToOrtho(false, V_WIDTH, V_HEIGHT);
		
		gsm = new GameStateManager(this);
		
	}
	
	public void render() {		
		accum += Gdx.graphics.getDeltaTime();
		while(accum >= STEP) {
			accum -= STEP;
			gsm.update(STEP);
			gsm.render();
			InputManager.update();
		}
		
		sb.setProjectionMatrix(hudCam.combined);
		sb.begin();
		sb.draw(res.getTexture("player"), 0, 0);
		sb.end();
		
	}
	
	public void dispose() {
	
	}
	
	public SpriteBatch getSpriteBatch() {return sb;}
	public OrthographicCamera getCamera() {return cam;}
	public OrthographicCamera getHudCamera() {return hudCam;}
	
	public void resize(int w, int h) {}
	public void pause() {}
	public void resume() {}
	
	
}
