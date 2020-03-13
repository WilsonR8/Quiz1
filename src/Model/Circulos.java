package Model;

import processing.core.PApplet;

public class Circulos extends Figura {

	public Circulos(int posX, int posY, int tam, int dir, int vel, PApplet app) {
		super(posX, posY, tam, dir, vel, app);
		// TODO Auto-generated constructor stub
	}

	public void paintCir() {
		app.fill(140, 30, 238);
		app.ellipse(posX, posY, tam, tam);

	}

	public void moveCir() {

		posY = posY + dir;

		if (posX > 500) {
			dir = -1;
		}

		if (posY > 500) {
			dir = -1;
		}

		if (posX < 0) {
			dir = 1;
		}

		if (posY < 0) {
			dir = 1;
		}
	}

}
