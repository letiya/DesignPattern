package chapter8;

import java.applet.Applet;
import java.awt.Graphics;

public class MyApplet extends Applet {

	String message;
	
	// A hook
	public void init() {
		message = "Hello World, I am alive!";
		repaint();
	}
	
	// A hook
	public void start() {
		message = "Now I’m starting up...";
		repaint();
	}
	
	// A hook
	public void stop() {
		message = "Oh, now I’m being stopped...";
		repaint();
	}
	
	// A hook
	public void destroy() {
		
	}
	
	// A hook
	public void paint(Graphics g) {
		g.drawString(message, 5, 15);
	}
	
}
