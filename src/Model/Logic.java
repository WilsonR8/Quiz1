package Model;

import processing.core.PApplet;

public class Logic {

	Cuadrado cubes[];
	Circulos circles[];
	public PApplet app;

	public Logic(PApplet app) {
		cubes = new Cuadrado[5];
		circles = new Circulos[5];

		
		this.app = app;
	

	

	for (int i = 0; i < cubes.length; i++) {
		cubes[i] = new Cuadrado(((int)( app.random(50,450)))    ,    ((int)( app.random(50,450))), 20, 2,6, app);
	}
	
	for (int i = 0; i < circles.length; i++) {
		circles[i] = new Circulos(((int)( app.random(50,450)))   ,   ((int)( app.random(50,450))), 20, 2,6, app);
	}
	
}
	

public void paintLog() {
	for (int i = 0; i < cubes.length; i++) {
		cubes[i].paintCu();
		
	}
	
	for (int i = 0; i < circles.length; i++) {
		circles[i].paintCir();
		
	}
	
}
	
	public void moveLog() {
		for (int i = 0; i < cubes.length; i++) {
		cubes[i].moveCu();
	}
		
		for (int i = 0; i < circles.length; i++) {
			circles[i].moveCir();
			
		}
	
	}
	
	
	
	
}
