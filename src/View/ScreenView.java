package View;

import Control.ScreenControl;
import processing.core.PApplet;

public class ScreenView {

	ScreenControl ViewC;
	PApplet app;
	
	public ScreenView(PApplet app) {
		// TODO Auto-generated constructor stub
		
		ViewC = new ScreenControl(app);
		this.app = app;
	}

	public void paintView() {
		ViewC.paintControl();
	}
	
		
	}


