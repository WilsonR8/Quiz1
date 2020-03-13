package Model;

import processing.core.PApplet;

public class Cuadrado extends Figura{

	public Cuadrado(int posX, int posY, int tam, int dir, int vel, PApplet app) {
		super(posX, posY, tam, dir, vel, app);
		// TODO Auto-generated constructor stub
	}

	
public void paintCu() {
	app.color(246,248,118);
	app.rect(posX, posY, tam, dir);
	
}

public void moveCu() {
	int mx=10;
	int my=10;
		posX = posX + mx;
		posY = posY + my;
		
	if (posX > app.width) {
		mx = -10;
	}
	
	if(posY> app.height) {
		my = -10;
	}
	
	if( posX<0) {
		mx = 10;
		}
	
	if(posY < 0) {
		my= 10;
	}
}
	
}
