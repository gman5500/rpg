package com.ks.rpg.handlers;

import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.InputAdapter;

public class InputProcessor extends InputAdapter{

	public boolean keyDown(int k) {
		
		if(k == Keys.W) {
			InputManager.setKey(InputManager.BUTTON_MOVE_UP, true);
		}
		
		if(k == Keys.S) {
			InputManager.setKey(InputManager.BUTTON_MOVE_DOWN, true);
		}
		
		if(k == Keys.A) {
			InputManager.setKey(InputManager.BUTTON_MOVE_LEFT, true);
		}
		
		if(k == Keys.D) {
			InputManager.setKey(InputManager.BUTTON_MOVE_RIGHT, true);
		}
		
		return true;
	}
	
	public boolean keyUp(int k) {
		
		if(k == Keys.W) {
			InputManager.setKey(InputManager.BUTTON_MOVE_UP, false);
		}
		
		if(k == Keys.S) {
			InputManager.setKey(InputManager.BUTTON_MOVE_DOWN, false);
		}
		
		if(k == Keys.A) {
			InputManager.setKey(InputManager.BUTTON_MOVE_LEFT, false);
		}
		
		if(k == Keys.D) {
			InputManager.setKey(InputManager.BUTTON_MOVE_RIGHT, false);
		}
		
		return true;
	}
	
}
