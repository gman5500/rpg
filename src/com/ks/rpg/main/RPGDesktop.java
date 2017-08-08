package com.ks.rpg.main;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class RPGDesktop {

	public static void main(String[] args) {
		
		LwjglApplicationConfiguration cfg =
				new LwjglApplicationConfiguration();
		
		cfg.title = Game.TITLE;
		cfg.height = Game.V_HEIGHT * Game.SCALE;
		cfg.width = Game.V_WIDTH * Game.SCALE;
		
		new LwjglApplication(new Game(), cfg);
	}
	
}
