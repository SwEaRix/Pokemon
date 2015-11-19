package com;

public final class Locator {
	private GraphicsModule graphicsModule;
	
	public Locator() {}
	
	public void provide(GraphicsModule graphicsModule) {
		this.graphicsModule = graphicsModule;
	}
	
	public GraphicsModule getGraphicsModule() {
		return this.graphicsModule;
	}
}
