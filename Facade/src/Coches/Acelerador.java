package Coches;

public class Acelerador {
	private float fuerza = 0;

	public float getFuerza() {
		return this.fuerza;
	}

	public void pisar(float delta) {
		if (this.fuerza + delta < 100)
			this.fuerza += delta;
		else
			this.fuerza=100;
	}

	public void levantar(float delta) {
		if (this.fuerza - delta > 0)
			this.fuerza -= delta;
		else
			this.fuerza=0;
	}
}
