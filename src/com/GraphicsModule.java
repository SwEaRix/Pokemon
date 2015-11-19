package com;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

public class GraphicsModule {
	private Graphics2D renderGraphics;
	
	private int actualWidth, actualHeight;
	private int scale;
	
	private boolean transparency;
	
	private BufferedImage buffer;
	
	public GraphicsModule(Graphics2D renderGraphics, int scale, boolean transparency) {
		Rectangle r = renderGraphics.getDeviceConfiguration().getBounds();
		this.actualWidth = (int) r.getWidth();
		this.actualHeight = (int) r.getHeight();
		this.renderGraphics = renderGraphics;
		this.scale = scale;
		
		this.transparency = transparency;
		
		this.buffer = new BufferedImage(this.actualWidth, this.actualHeight, (transparency ? BufferedImage.TYPE_INT_ARGB : BufferedImage.TYPE_INT_RGB));
	}
	
	public void draw() {
		
	}
	
	public void render() {
		//TODO testing
		this.renderGraphics.setColor(Color.GREEN);
		this.renderGraphics.fillRect(0, 0, this.actualWidth, this.actualHeight);
	}
}
