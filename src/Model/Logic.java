package Model;

import processing.core.PApplet;

public class Logic {

	Cuadrado cubes[];
	public PApplet app;

	public Logic(PApplet app) {
		cubes = new Cuadrado[5];

		
		this.app = app;
	

	

	for (int i = 0; i < cubes.length; i++) {
		cubes[i] = new Cuadrado((10 + (i * 24)), 50, 15, 2,6, app);
	}
}

public void paintLogic() {
	for (int i = 0; i < cubes.length; i++) {
		cubes[i].paintCu();
		cubes[i].moveCu();
	}
	
	
	
	
}}
