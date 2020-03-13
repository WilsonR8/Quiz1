package Model;

import processing.core.PApplet;

public class Figura {

	int posX;
	int posY;
	int tam;
	int dir;
	int vel;
	PApplet app;
	
	
	public Figura(int posX, int posY, int tam, int dir,int vel,PApplet app) {
		// TODO Auto-generated constructor stub
		this.posX=posX;
		this.posY=posY;
		this.tam=tam;
		this.dir=dir;
		this.vel=vel;
		this.app=app;
		
		
	}

}
