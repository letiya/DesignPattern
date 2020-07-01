package chapter11;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class ImageProxy implements Icon {
	
	private ImageIcon imageIcon; // The REAL icon that we eventually want to display when it・s loaded
	private URL imageURL;
	private Thread retrievalThread;
	private boolean retrieving = false;

	public ImageProxy(URL url) { 
		imageURL = url;
	}
	
	@Override
	public int getIconHeight() {
		if (imageIcon != null) {
			return imageIcon.getIconHeight();
		} else {
			return 600; // default height until the imageIcon is loaded
		}
	}

	@Override
	public int getIconWidth() {
		if (imageIcon != null) {
			return imageIcon.getIconWidth();
		} else {
			return 800; // default width until the imageIcon is loaded
		}
	}

	@Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		if (imageIcon != null) {
			imageIcon.paintIcon(c, g, x, y);
		} else {
			g.drawString("Loading CD cover, please wait...", x + 300, y + 190);
			if (!retrieving) {
				// If we aren・t already trying to retrieve the image(!retrieving), then it・s time to start retrieving it 
				// (in case you were wondering, only one thread calls paint, so we should be okay here in terms of thread safety).
				retrieving = true;
				// Note that the image loading with IconImage is synchronous: the ImageIcon constructor doesn・t return until the image is loaded. 
				// That doesn・t give us much of a chance to do screen updates and have our message displayed, so we・re going to do this asynchronously.
				retrievalThread = new Thread(new Runnable() {
					public void run() {
						try {
							imageIcon = new ImageIcon(imageURL, "CD Cover"); // the ImageIcon constructor doesn・t return until the image is loaded.
							c.repaint(); // When we have the image, we tell Swing that we need to be repainted.
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
				retrievalThread.start();
			}
		}
	}

}
