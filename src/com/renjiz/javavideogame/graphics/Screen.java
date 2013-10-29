package com.renjiz.javavideogame.graphics;

public class Screen {

	private int width;
	private int height;

	public int[] pixels;
	
	int xTime = 0, yTime = 0 ;
	int counter;

	public Screen(int width, int height) {
		this.width = width;
		this.height = height;
		pixels = new int[width * height];

	}
	
	public void clear(){
		for (int i = 0; i < pixels.length; i++){
			pixels[i] = 0;
		}
	}

	public void render() {
		counter++;
		if (counter % 100 == 0) xTime++;
		if (counter % 80 == 0) yTime++;
		
		for (int y = 0; y < height; y++) {
			if(yTime >= height) break;
			for (int x = 0; x < width; x++) {
				if(xTime >= width) break;
				pixels[xTime + yTime * width] = 0xFF00FF;
			}
		}
	}
}
