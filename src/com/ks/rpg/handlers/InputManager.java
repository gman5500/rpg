package com.ks.rpg.handlers;

public class InputManager {

	public static boolean[] keys;
	public static boolean[] pkeys;
	
	public static final int NUM_KEYS = 4;
	
	//movement keys
	public static final int BUTTON_MOVE_UP = 0;
	public static final int BUTTON_MOVE_DOWN = 1;
	public static final int BUTTON_MOVE_LEFT = 2;
	public static final int BUTTON_MOVE_RIGHT = 3;
	
	static {
		keys = new boolean[NUM_KEYS];
		pkeys = new boolean[NUM_KEYS];
		
	}
	
	public static void update() {
		for(int i = 0; i < NUM_KEYS; i++) {
			pkeys[i] = keys[i];
		}
	}
	
	public static boolean isDown(int i) {
		return keys[i];
	}
	
	public static boolean isPressed(int i) {
		return keys[i] && !pkeys[i];
	}
	
	public static void setKey(int i, boolean b) {
		keys[i] = b;
	}
	
}
