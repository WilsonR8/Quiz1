package View;



import processing.core.PApplet;

public class Main extends PApplet {
	
	
	ScreenView ViewM;
	PApplet app;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("View.Main");
	}

	public void settings() {
		size(500, 500);
	}

	public void setup() {
		ViewM = new ScreenView(this);
	}

	public void draw() {
		background(0);
		
		ViewM.paintView();
	}

}
