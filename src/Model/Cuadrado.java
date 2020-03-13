package Model;

import processing.core.PApplet;

public class Cuadrado extends Figura{

	public Cuadrado(int posX, int posY, int tam, int dir, int vel, PApplet app) {
		super(posX, posY, tam, dir, vel, app);
		// TODO Auto-generated constructor stub
	}

	
public void paintCu() {
	app.fill(246,248,118);
	app.rect(posX, posY, tam, tam);
	
}

public void moveCu() {

		posX = posX + dir;
	
		
	if (posX > 500) {
		dir = -1;
	}
	
	if(posY > 500) {
		dir = -1;
	}
	
	if( posX<0) {
		dir = 1;
		}
	
	if(posY < 0) {
		dir= 1;
	}
}
	
}
