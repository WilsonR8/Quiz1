package Control;


import Model.Logic;
import processing.core.PApplet;






public class ScreenControl {
	
	Logic LogicControl;
	PApplet app;

	public ScreenControl(PApplet app) {
		
		LogicControl = new Logic(app);
		this.app=app;
		// TODO Auto-generated constructor stub
	}
	
	
	public void paintControl() {
		LogicControl.paintLog();
		LogicControl.moveLog();
		
	}

}
